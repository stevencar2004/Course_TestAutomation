package School.Controllers;

import School.Domain.DataBases.StudentsDB;
import School.Domain.Models.Student;
import School.Shared.ValidTypes.TypesOcuppation;
import School.Shared.ValidTypes.TypesSchoolDay;
import School.Shared.ValidTypes.ValidStatusCode;
import School.Views.View;

import java.util.ArrayList;
import java.util.Arrays;

/* Esta APP esta en la Version 1.0 cumple con los requerimientos y funcionalidades
*  Falta:
*   - Validar los datos introducidos, que no lancen exepciones
*   - Que la ejecucion sea en bucle y por medio de un menu de opciones
* */

public class App {
  public static void main(String[] args) {
    StudentsDB studentsDB;
    ValidStatusCode code;
    int idStudent;

    ArrayList<Student> initialStudents = new ArrayList<Student>(
            Arrays.asList(
                    new Student("Steven", 18, TypesOcuppation.Student, 11, TypesSchoolDay.Morning, 101),
                    new Student("Carolina", 16, TypesOcuppation.Student, 9, TypesSchoolDay.Morning, 102),
                    new Student("liliana", 17, TypesOcuppation.Student, 10, TypesSchoolDay.Morning, 103),
                    new Student("Marcela", 18, TypesOcuppation.Student, 11, TypesSchoolDay.Morning, 104)
            )
    );

    View.showMessage("Initial Values Of School");

    studentsDB = new StudentsDB(initialStudents);
    View.showList(studentsDB.getListOfThePersonInSchool());

    // Added a new student in the DB
    Student newStudent = View.addNewStudent();
    code = studentsDB.addPerson(newStudent);
    View.showMessageByCode(code, "add");

    // Added a new student in the DB
    newStudent = View.addNewStudent();
    code = studentsDB.addPerson(newStudent);
    View.showMessageByCode(code, "add");

    // Deleted student of the DB
    idStudent = View.getIdStudent("Delete");
    code = studentsDB.deletePerson(idStudent);
    View.showMessageByCode(code, "delete");

    // find student of the DB
    idStudent = View.getIdStudent("Find");
    Student result = studentsDB.findPerson(idStudent);
    View.showStudent(result);

    View.showMessage("Final List Students");
    View.showList(studentsDB.getListOfThePersonInSchool());
  }
}
