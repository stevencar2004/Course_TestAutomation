package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstStep {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\chromedriver.exe");

    // Initialize Browser
    WebDriver driver = new ChromeDriver();

    // Open Facebook
    driver.get("http://www.facebook.com");

    // Maximize Browser
    driver.manage().window().maximize();

    // Close Browser
    driver.close();
  }
}
