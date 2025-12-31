//Create a Person class with a copy constructor that clones another person's attributes.
package OOPs.constructors.person;

import java.sql.SQLOutput;

public class Person {
    private String name;
    private int age;
    private String maritalStatus;

    // paramaterize constructor
    Person(String name, int age, String maritalStatus) {
        this.name = name;
        this.age = age;
        this.maritalStatus = maritalStatus;
    }

    // copy constructor
    Person(Person other){
        this.name = other.name;
        this.age = age;
    }
    void display(){
        System.out.println("Name : " + name);
        System.out.println("age : " + age);
        System.out.println("marital status :" + maritalStatus);
    }
}
