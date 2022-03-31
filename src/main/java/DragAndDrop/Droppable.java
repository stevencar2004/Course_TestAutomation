package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Droppable {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\chromedriver.exe");

    String URL_WEBSITE = "https://demoqa.com/droppable";

    WebDriver driver = new ChromeDriver();

    driver.get(URL_WEBSITE);

    driver.manage().window().maximize();

    // Initialize Actions
    Actions action = new Actions(driver);

    // Define the box elements, the draggable and the end box or droppable
    WebElement draggable = driver.findElement(By.id("draggable"));
    WebElement droppable = driver.findElement(By.id("droppable"));

    // Action Drag and Drop
    action.dragAndDrop(draggable, droppable).build().perform();

    // Check is Drag and Drop results OK
    WebElement result = droppable.findElement(By.tagName("p"));

    if (result.getText().equals("Dropped!")) {
      System.out.println("Successfuly");
    } else {
      System.out.println("Opps!, Try again");
    }

    driver.close();
  }
}
