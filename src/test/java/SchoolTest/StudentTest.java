package SchoolTest;

import School.Domain.Models.Student;
import School.Shared.ValidTypes.TypesOcuppation;
import School.Shared.ValidTypes.TypesSchoolDay;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class StudentTest {
  Student student;

  @BeforeMethod
  public void initializeTests(){
    student = new Student("Steven", 18, TypesOcuppation.Student, 11, TypesSchoolDay.Morning, 101);
  }

  @Test(description = "This test validate the class Student is not null")
  public void checkStudentIsNotNul(){
    Assert.assertNotNull(student);
  }

  @Test(description = "Check age of the student before birthday and after birthday")
  public void checkTheBirthday(){
    int currentAge = student.getAge();

    student.birthday();

    int newAge = student.getAge();

    Assert.assertEquals(currentAge + 1, newAge);
  }

  @Test
  public void validateNameAndIdStudent() {
    String name = "Camilo";
    int id = 10011;
    student = new Student(name, 18, TypesOcuppation.Student, 11, TypesSchoolDay.Morning, id);

    SoftAssert tests = new SoftAssert();

    tests.assertEquals(student.getName(), name);
    tests.assertEquals(student.getIdStudent(), id);
    tests.assertAll();
  }

  @AfterMethod
  public void showDetailsTest(ITestResult result) {
    System.out.println("Test " + result.getName() + " \n Which the function is " + result.getMethod().getDescription() + " \n result is " + result.getStatus());
  }
}
