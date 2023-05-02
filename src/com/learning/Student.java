package com.learning;

import com.learning.Address;

import java.util.Objects;

public class Student {
    static String collegeName;
    String name;
    int age;
    Address address;

    public Student() {

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String addressType) {
        if(addressType.equalsIgnoreCase("hostel")) {
            Address a = new Address();
            a.setCity("Chennai");
            a.setCountry("IN");
            a.setState("TN");
            a.setStreetName("Shollinganallur Hostel");
            address = a;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() &&
                getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
