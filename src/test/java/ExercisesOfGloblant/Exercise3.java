package ExercisesOfGloblant;

import org.testng.Assert;
import org.testng.annotations.Test;

/* one test must be true and the other must be false */

public class Exercise3 {
  @Test
  public void isTheBigger(){
    int num1 = 2;
    int num2 = 12;

    Assert.assertTrue(num1 > num2);
  }

  @Test
  public void isValidEmail(){
    String email = "pepito.perez@gmail.com";

    Assert.assertFalse(email.contains("@email.com"));
  }
}
