package com.example;

import java.util.ArrayList;
import java.util.List;

public class FamilyMember {
    public String name;
    private int age;
    public boolean gender;
    public List<FamilyMember> parents = new ArrayList<>();
    public List<FamilyMember> children = new ArrayList<>();
    public FamilyMember spouse;
    FamilyMember(String name, int age, boolean gender)
    {
        this.gender = gender;
        this.name = name;
        this.age = age;
        spouse = null;
    }

    public int getAge() {
        return age;
    }

    public void printDetails()
    {
        System.out.println(name+" "+age+" "+gender);
    }

    public void addParent(FamilyMember fm2) {
        parents.add(fm2);
    }
    public void addChild(FamilyMember fm2){
        children.add(fm2);
    }
    public void addSpouse(FamilyMember fm2){
        spouse = fm2;
    }
}
