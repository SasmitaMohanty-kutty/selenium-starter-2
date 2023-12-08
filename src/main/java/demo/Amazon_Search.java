package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Search {
  WebDriver driver;
  public Amazon_Search()
    {
        System.out.println("Constructor: TestCases");
       // WebDriverManager.chromedriver().timeout(30).setup();
       WebDriverManager.edgedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }
     public void  AmazonSearch(){
      //Navigate to the Url"https://www.google.com/" Using Locator "ID" driver.get(URL)
      driver.get("https://www.google.com");
    // Enter "amazon" in  search  text box Using Locator "Name" q|sendKeys("amazon")
    driver.findElement(By.name("q")).clear();
    driver.findElement(By.name("q")).sendKeys("amazon");
     // press enter key in search text box Using Locator "Name" q|sendKeys(Keys.RETURN)
     driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
    
      //Veryfy whether amazom.com or amazon.in  is present Using Locator "XPath" //span[text()="Amazon.com"]
      boolean result = driver.findElement(By.xpath("//span[text()='Amazon.com']")).isDisplayed();
      System.out.println("Is Amazon is present?"+result);
      //Close browser Using Locator "ID" driver.close

     }


  
}
