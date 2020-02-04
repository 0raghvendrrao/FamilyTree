package com.example;

public class FamilyMember {
    public String name;
    private int age;
    public boolean gender;

    FamilyMember(String name, int age, boolean gender)
    {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printDetails()
    {
        System.out.println(name+" "+age+" "+gender);
    }
}
