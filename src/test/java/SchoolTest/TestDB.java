package SchoolTest;

import School.Domain.DataBases.StudentsDB;
import School.Domain.Models.Student;

import School.Shared.ValidTypes.TypesOcuppation;
import School.Shared.ValidTypes.TypesSchoolDay;
import School.Shared.ValidTypes.ValidStatusCode;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

/* Version 1.0 - Se comprueban los casos base y funcionales
*  Falta:
*    - Comprobar los corner cases y validar las exepciones por los tipos de datos
*    - Realizar mas test sobre las funcionalidades
* */

public class TestDB {
  StudentsDB DB;
  int initialSizeStudentsIndB = 0;

  @BeforeMethod
  public void initializeDB() {
    ArrayList<Student> initialStudents = new ArrayList<Student>(
            Arrays.asList(
                    new Student("Steven", 18, TypesOcuppation.Student, 11, TypesSchoolDay.Morning, 101),
                    new Student("Carolina", 16, TypesOcuppation.Student, 9, TypesSchoolDay.Morning, 102),
                    new Student("liliana", 17, TypesOcuppation.Student, 10, TypesSchoolDay.Morning, 103),
                    new Student("Marcela", 18, TypesOcuppation.Student, 11, TypesSchoolDay.Morning, 104)
            )
    );
    DB = new StudentsDB(initialStudents);
    initialSizeStudentsIndB = initialStudents.size();
  }

  @Test(description = "Validate the initial amount of students is equals with the Data Base")
  public void checkAmountStudentsInDB() {
    int actualStudentsInBD = DB.getListOfThePersonInSchool().size();

    Assert.assertEquals(actualStudentsInBD, initialSizeStudentsIndB);
  }

  @Test(description = "Find one student of the database by id and check this student has name <Steven>")
  public void findOneStudentById() {
    String nameStudent = "Steven";
    int idStudent = 101;

    Student result = DB.findPerson(idStudent);

    Assert.assertNotNull(result);
    Assert.assertEquals(result.getName(), nameStudent);

  }

  @Test(description = "Check is the new student is added into data base")
  public void addNewStudent() {
    ValidStatusCode code = DB.addPerson(new Student("Marcela", 18, TypesOcuppation.Student, 11, TypesSchoolDay.Morning, 104));

    Assert.assertEquals(code.name(), ValidStatusCode.Success.name());
    Assert.assertEquals(DB.getListOfThePersonInSchool().size(),initialSizeStudentsIndB + 1);
  }

  @Test(description = "Check if student is deleted from data base")
  public void deleteStudent() {
    Student beforeStudent = DB.findPerson(101);

    ValidStatusCode code = DB.deletePerson(101);

    Student afterStudent = DB.findPerson(101);

    Assert.assertNotNull(beforeStudent);
    Assert.assertNull(afterStudent);
    Assert.assertEquals(code.name(), ValidStatusCode.Success.name());
    Assert.assertEquals(DB.getListOfThePersonInSchool().size(),initialSizeStudentsIndB - 1);
  }

  @AfterMethod
  public void detailsTest(ITestResult result){
    System.out.println("Test " + result.getName() + " \n which Function is " + result.getMethod().getDescription() + " result " + result.getStatus());
  }
}
