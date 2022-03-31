package TestsNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestsNGBasics {
  private String URL_WEBSITE = "https://demoqa.com/";

  WebDriver driver;

  @BeforeTest
  public void setBaseUrl() {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    driver = new ChromeDriver();

    driver.get(URL_WEBSITE);
  }

  @Test
  public void titleTest() {
    String expectedTitle = "ToolsQA";
    String webPageTitle = driver.getTitle();

    Assert.assertEquals(webPageTitle, expectedTitle);
  }

  @Test
  public void urlTest() {
    String actualUrl = driver.getCurrentUrl();

    Assert.assertEquals(actualUrl, URL_WEBSITE);
  }

  @AfterTest
  public void closeSession() {
    driver.quit();
  }
}
