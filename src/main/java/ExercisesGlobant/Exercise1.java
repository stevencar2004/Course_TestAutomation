package ExercisesGlobant;
/*
 * Escribir un test que tome diferentes terminos de busqueda como un input, navegar a yahoo.com y hacer una busqueda.
 * Verificar que la búsqueda fue exitosa.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Exercise1 {

  public static void main(String[] args) {
    String URL = "https://espanol.yahoo.com/";
    String paramSearch = "iphone 11 pro";

    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.get(URL);

    String titleBeforeSearch = driver.getTitle();
    String urlBeforeSearch = driver.getCurrentUrl();

    WebElement inputField = driver.findElement(By.id("ybar-sbq"));
    WebElement searchBtn = driver.findElement(By.id("ybar-search"));

    inputField.sendKeys(paramSearch);
    searchBtn.click();

    String titleAfterSearch = driver.getTitle();
    String urlAfterSearch = driver.getCurrentUrl();

    if (!titleBeforeSearch.equals(titleAfterSearch) && !urlBeforeSearch.equals(urlAfterSearch)) {
      System.out.println("The Search is Successfuly");
    } else {
      System.out.println("Opps!, try again");
    }
    
    //driver.close();
  }
}
