package School.Domain.Models;

import School.Shared.ValidTypes.TypesOcuppation;

public class Person {
  private String name;
  private int age;
  private TypesOcuppation ocupation;

  public Person(String name, int age, TypesOcuppation ocupation){
    this.ocupation = ocupation;
    this.age = age;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void birthday() {
    age++;
  }

  public TypesOcuppation getOcupation() {
    return ocupation;
  }

  public void setOcupation(TypesOcuppation ocupation) {
    this.ocupation = ocupation;
  }
}
