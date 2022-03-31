package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstStep {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\chromedriver.exe");

    // Credentials
    String standard_user = "standard_user";
    String password = "secret_sauce";

    // Initialize Driver
    WebDriver driver = new ChromeDriver();

    //Open Website
    driver.get("https://www.saucedemo.com/");

    // Locator the elements by ID
    WebElement usernameInput = driver.findElement(By.id("user-name"));
    WebElement passwordInput = driver.findElement(By.id("password"));
    WebElement loginBtn = driver.findElement(By.id("login-button"));

    // Locator the elements by ClassName
    WebElement errorBox = driver.findElement(By.className("error-message-container"));

    // Locator the elements by Xpath
    WebElement loginBtnXpath = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
    String textIntoBtn = loginBtnXpath.getAttribute("value");
    System.out.println("Value Btn Login: " + textIntoBtn);

    // Fill fields of inputs
    usernameInput.sendKeys(standard_user);
    passwordInput.sendKeys(password);

    // Click in the button
    loginBtn.click();

    // This block code verify is exist any error in the login execute
    try {
      String valueError = errorBox.findElement(By.tagName("h3")).getText();
      System.out.println("LoginError: " + valueError);
    } catch (Exception e) {
      System.out.println("Login Successfuly, Welcome");
    }

  }
}
