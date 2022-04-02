package ExercisesOfGloblant;

import org.testng.annotations.*;

/* Exercise about annotations and basics Test */

public class Exercise1 {

  @BeforeClass
  public void BeforeEachClass(){
    System.out.println("Before class method");
  }

  @BeforeMethod
  public void BeforeEachTest(){
    System.out.println("Before test method");
  }

  @Test
  public void myTest(){
    System.out.println("Test 1 method");
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
