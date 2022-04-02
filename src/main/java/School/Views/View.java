package School.Views;

import School.Domain.Models.Student;
import School.Shared.ValidTypes.TypesOcuppation;
import School.Shared.ValidTypes.TypesSchoolDay;
import School.Shared.ValidTypes.ValidStatusCode;

import java.util.ArrayList;
import java.util.Scanner;

public class View {

  static public void showList(ArrayList<Student> list) {
    System.out.println(list.toString());
  }

  static public void showMessage(String msg) {
    System.out.println(msg);
  }

  static public Student addNewStudent() {
    Scanner input = new Scanner(System.in);

    System.out.println("== Add new Student ==");

    System.out.print("Write A IdStudent: ");
    int idStudent = input.nextInt();

    System.out.print("Write A Name: ");
    String name = input.next();

    System.out.print("Write Age: ");
    int age = input.nextInt();

    System.out.print("Write Ocuppation (Student): ");
    String ocuppation = input.next();

    System.out.print("Write a Grade: ");
    int grade = input.nextInt();

    System.out.print("Write a SchoolDday (Morning, Afternoon, Nigth): ");
    String schoolDay = input.next();

    return new Student(name, age, TypesOcuppation.valueOf(ocuppation), grade, TypesSchoolDay.valueOf(schoolDay), idStudent);
  }

  static public int getIdStudent(String typeMethod) {
    Scanner input = new Scanner(System.in);

    System.out.println("== " + typeMethod + " a Student ==");

    System.out.println("Write a IdStudent: ");
    return input.nextInt();
  }

  static public void showStudent(Student student){
    System.out.println(student.toString());
  }

  static public void showMessageByCode(ValidStatusCode code, String method){
    System.out.println(code.name());
    System.out.println(code);

    if(method.equals("add")){
      System.out.println("Added new student, success!");
    }
    else if(method.equals("delete")){
      System.out.println("Delete student, success!");
    }
  }
}
