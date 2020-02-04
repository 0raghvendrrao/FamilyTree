package com.example;

import java.util.Scanner;

public class CreateMemberForm implements Form {
    @Override
    public void form() {
        System.out.println("Enter name, age and gender.");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        int age = s.nextInt();
        boolean gender = s.
                nextBoolean();

        for(Family fam: Families.families){
            for(FamilyMember fm: fam.members) {
                if(fm.name.equals(name))
                    try {
                        throw new MemberAlreadyExistsException();
                    } catch (MemberAlreadyExistsException e) {
                        System.out.println("Member "+name+" already exists.");
                        e.printStackTrace();
                    }
            }
        }
        FamilyMember fm = new FamilyMember(name, age, gender);
        System.out.println("Successfully created member "+name+" Select family to add:");
        Families.viewFamilies(1);
        int input = s.nextInt();
        Families.families.get(input-1).addMember(fm);
    }
    CreateMemberForm()
    {
        form();
    }
}
