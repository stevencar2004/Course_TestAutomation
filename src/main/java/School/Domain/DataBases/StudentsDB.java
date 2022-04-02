package School.Domain.DataBases;

import School.Domain.Models.Student;
import School.Shared.ValidTypes.ValidStatusCode;

import java.util.ArrayList;


public class StudentsDB  {

  ArrayList<Student> listStudentsInSchool;

  public StudentsDB(ArrayList<Student> listStudentsInSchool) {
    this.listStudentsInSchool = listStudentsInSchool;
  }

  public Student findPerson(int id) {
    for (Student student: listStudentsInSchool) {
      if (student.getIdStudent() == id) return student;
    }
    return null;
  };

  public ValidStatusCode addPerson(Student newStudent) {
    try {
      boolean results = listStudentsInSchool.add(newStudent);
      if(results) return ValidStatusCode.Success;
      return ValidStatusCode.Error;
    }catch (Exception e){
      return ValidStatusCode.Error;
    }
  };

  public ValidStatusCode deletePerson(int id) {
    try {
      boolean results = listStudentsInSchool.removeIf(student -> student.getIdStudent() == id);
      if(results) return ValidStatusCode.Success;
      return ValidStatusCode.NotFound;
    }catch (Exception e){
      return ValidStatusCode.Error;
    }
  };

  public ArrayList<Student> getListOfThePersonInSchool() {
    return listStudentsInSchool;
  }
}
