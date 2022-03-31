package TestsNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class NavigateInTabs {
  WebDriver driver;

  @BeforeMethod
  public void setBaseUrl() {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    driver = new ChromeDriver();

    String url = "https://demoqa.com/links/";
    driver.get(url);
  }

  @Test(priority = 1)
  public void openNewTabUsingJS() throws InterruptedException {
    ((JavascriptExecutor) driver).executeScript("window.open()");
    Thread.sleep(5000);
  }

  @Test(priority = 2)
  public void openNewTabUsingClick() throws InterruptedException {
    driver.findElement(By.id("simpleLink")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("dynamicLink")).click();
    Thread.sleep(5000);
  }

  @Test(priority = 3)
  public void handleTabs() throws InterruptedException {
    // Obtenemos el id de la ventana abierta del navegador
    String mainTab = driver.getWindowHandle();
    String newTab = "";

    System.out.println("Main: " + mainTab);

    driver.findElement(By.id("simpleLink")).click();
    Thread.sleep(5000);

    // Obtenemos todos los IDs de las ventanas abiertas en el browser
    Set<String> handles = driver.getWindowHandles();

    // Recorremos la lista de IDs de las ventanas
    for (String actual : handles) {
      System.out.println("Handle ID: " + actual);

      // validamos que no estamos en la inicial y cambiamos de ventana en el browser
      if (!actual.equalsIgnoreCase(mainTab)) {
        System.out.println("ChangingTab");
        // le indicamos a cual ventana nos queremos cambiar
        driver.switchTo().window(actual);

        newTab = actual;
        System.out.println("New Main Tab: " + newTab);
      }
    }

    //Abrimos google en la nueva ventana
    driver.get("https://www.google.com/");
    Thread.sleep(5000);

    // Volvemos a la ventana principal y abrimos google
    System.out.println("ChangingTab");
    driver.switchTo().window(mainTab);
    driver.get("https://www.google.com/");
    Thread.sleep(5000);
  }

  @AfterMethod
  public void closeSession() {
    driver.quit();
  }
}
