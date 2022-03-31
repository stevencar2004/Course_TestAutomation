package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListElements {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\chromedriver.exe");

    String URL_WEBSITE = "https://www.saucedemo.com/";

    WebDriver driver = new ChromeDriver();

    driver.get(URL_WEBSITE);

    //Keep all input elements of the web page into variable inputs
    List<WebElement> inputs = driver.findElements(By.tagName("input"));
    System.out.println("Amount Items: " + inputs.size());

    System.out.println("Items Results...");
    for (WebElement element : inputs) {
      System.out.println(element.getAttribute("name"));
    }

    driver.close();
  }
}
