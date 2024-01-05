import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IlkTest {

 @Test
    public  void test01 (){
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     //1- Hepsi burada linkine gidilir
     driver.get("https://www.hepsiburada.com");
     // 2- Arama çubuğuna nutella yazılır.
  WebElement searchTextBox = driver.findElement(By.xpath("/html/body/div/div/div/div[4]/div[5]/div/div/div/div[1]/div[3]/div[2]/div/div/div/div/div/div/div[1]/div[2]/input"));

  searchTextBox.sendKeys("Nutela" + Keys.ENTER);
  // 3- arama sonuçlarının nutella içerdiğini doğrulayın
  WebElement searchResult = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[6]/div[2]/div[2]/div[1]/div[1]/div"));
  String actualResult = searchResult.getText();
  if (actualResult.contains("Nutella")){
   System.out.println("Arama Sonuçları Nutella İçeriyor. TEST GEÇTİ ");
  }else {
   System.out.println("Arama Sonuçları Nutella İçermiyor. TEST KALDI ");
  }
  driver.quit();
 }

}
