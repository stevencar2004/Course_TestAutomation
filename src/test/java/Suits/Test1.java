package Suits;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
  WebDriver driver;

  @BeforeMethod(alwaysRun = true)
  public void setBaseUrl() {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    driver = new ChromeDriver();

    String url = "https://demoqa.com/radio-button/";
    driver.get(url);
  }

  @Test(groups = {"ValidateTitle"})
  public void validateTitle() {
    String expectedTitle = "ToolsQA";
    String webPageTitle = driver.getTitle();

    Assert.assertEquals(webPageTitle, expectedTitle);
  }

  @Test(groups = {"ClickRadioButtons"})
  public void clickRadioButonImpressive() {
    WebElement element = driver.findElement(By.id("impressiveRadio"));

    JavascriptExecutor executor = (JavascriptExecutor) driver;
    executor.executeScript("arguments[0].click()", element);

    String response = driver.findElement(By.className("text-success")).getText();

    Assert.assertEquals(response, "Impressive");
  }


  @AfterMethod(alwaysRun = true)
  public void closeSession() {
    driver.quit();
  }
}
