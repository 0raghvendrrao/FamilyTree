package com.example;
import java.util.Scanner;

public class WelcomeMenu implements Menu{
    public void printMenu()
    {
        System.out.println("1. Create family.");
        System.out.println("2. View family.");
        System.out.println("3. Create a member");
        System.out.println("4. Add Relation");
        System.out.println("5. See related people.");
        System.out.println("6. See relation between two people.");
    }
    WelcomeMenu()
    {
        printMenu();
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        action(input);
    }
    public void action(int input)
    {
        switch(input)
        {
            case 1:
                Form form = new CreateFamilyForm();
                break;
            case 2:
                Families.viewFamilies();
                break;
//            case 2:
//                Form form = new CreateMemberForm();
//                break;
//            case 3:
//                Form form = new CreateRelationForm();
//                break;
//            case 4:
//                Form form = new SeeRelatedForm();
//                break;
//            case 5:
//                Form form = new SeeRelationBetweenForm();
//                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
