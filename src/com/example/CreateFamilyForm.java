package com.example;

import java.util.Scanner;

public class CreateFamilyForm implements Form {
    CreateFamilyForm()
    {
        form();
    }

    @Override
    public void form() {
        System.out.println("Enter family name: ");
        Scanner s = new Scanner(System.in);
        String input = s.next();
        Families.createFamily(input);
        System.out.println("Created family "+input);
    }
}
