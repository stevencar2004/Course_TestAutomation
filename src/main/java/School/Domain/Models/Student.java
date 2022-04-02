package School.Domain.Models;

import School.Shared.ValidTypes.TypesOcuppation;
import School.Shared.ValidTypes.TypesSchoolDay;

public class Student extends Person {
  private int  grade;
  private int idStudent;
  private TypesSchoolDay schoolDay;

  public Student(String name, int age, TypesOcuppation occupation, int grade, TypesSchoolDay schoolDay, int idStudent) {
    super(name, age, occupation);
    this.grade = grade;
    this.schoolDay = schoolDay;
    this.idStudent = idStudent;
  }

  public void passedYearSchool () {
    this.grade += 1;
  }

  public int getGrade() {
    return grade;
  }

  public int getIdStudent() {
    return idStudent;
  }

  public TypesSchoolDay getSchoolDay() {
    return schoolDay;
  }

  @Override
  public String toString() {
    return "Student{" +
            ", idStudent=" + idStudent +
            ", name='" + super.getName() +
            ", age='" + super.getAge() +
            "grade=" + grade +
            ", schoolDay=" + schoolDay +
            "} \n";
  }
}
