package ExercisesOfGloblant;

import org.testng.annotations.*;
import java.lang.reflect.Method;

/* Exercise about Data Providers */

public class Exercise2 {

  @DataProvider(name = "Annotations")
  public static Object[][] Annotations(Method m){
    return switch (m.getName()) {
      case "myTest1" -> new Object[][]{{"FIRST TEST STRING"}};
      case "myTest2" -> new Object[][]{{"SECOND TEST STRING"}};
      default -> new Object[][]{{"Not Found Cases"}};
    };
  }

  @BeforeClass()
  public void BeforeEachClass(){
    System.out.println("Before class method");
  }

  @BeforeMethod
  public void BeforeEachTest(){
    System.out.println("Before test method");
  }

  @Test(dataProvider = "Annotations")
  public void myTest1(String result){
    System.out.println(result);
  }

  @Test(dataProvider = "Annotations")
  public void myTest2(String result){
    System.out.println(result);
  }

  @AfterMethod
  public void AfterEachTest(){
    System.out.println("After test method");
  }

  @AfterClass
  public void AfterEachClass(){
    System.out.println("After class method");
  }
}
