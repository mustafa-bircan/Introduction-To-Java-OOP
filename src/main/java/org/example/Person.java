package org.example;

public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public String address;
    public String email;
    public String phoneNumber;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String address, String email, String phoneNumber) {
        this(firstName, lastName, age);
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
