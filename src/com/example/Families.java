package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Families  {
    private static List<Family> families = new ArrayList<>();

    private static void addFamily(Family fam)
    {
        families.add(fam);
    }
    public static void createFamily(String s)
    {
        for(Family family: families){
            try {
                if (family.name.equals(s)) {

                    throw new FamilyAlreadyExistsException();
                }
            }
            catch(Exception e)
            {
                System.out.println("Family Already Exists.");
            }
        }
        addFamily(new Family(s));
    }
    public static void viewFamilies()
    {
        int cnt = 1;
        for(Family family: families){
            System.out.println(cnt+" "+family.name);
            cnt++;
        }
        System.out.println("Enter number to view members/ Exit 0");

        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        if(input>0 && input <10)
        {
            families.get(input-1).viewMembers();
        }

    }
}
