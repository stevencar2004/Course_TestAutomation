package ExercisesGlobant;

/*
 * Escribir un test que tome diferentes terminos de busqueda como un input, navegar a yahoo.com y hacer una busqueda,
 * luego repetir lo mismo en yahoo.com, y comparar los resultados.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.*;

public class Exercise3 {
  public static void main(String[] args) {
    List<String> ListURLs = Arrays.asList("https://bing.com", "https://espanol.yahoo.com/");
    String paramSearch = "iphone 11 pro";

    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    WebElement inputField;
    WebElement firstResult = new RemoteWebElement();

    String resultBing = "";
    String resultYahoo = "";

    for (String URL : ListURLs) {
      driver.get(URL);

      if (URL.contains("bing")) {
        inputField = driver.findElement(By.id("sb_form_q"));
      } else {
        inputField = driver.findElement(By.id("ybar-sbq"));
      }
      inputField.sendKeys(paramSearch);
      inputField.submit();

      if (URL.contains("bing")) {
        firstResult = driver.findElement(By.xpath("//*[@id=\"b_results\"]/li[1]/ul/li[1]/div/h2/a"));
        resultBing = firstResult.getText();
      }
      // Falta acomodar el resultado de yahoo
    }

    System.out.println("Resultado del primer link de la busqueda en Bing: " + resultBing);
    System.out.println("Resultado del primer link de la busqueda en Yahoo: " + resultYahoo);
  }
}
