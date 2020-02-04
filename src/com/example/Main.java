package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("WELCOME TO FAMILY TREE: ");
            Menu m = new WelcomeMenu();
            System.out.println("Exit 0/ Continue 1");
            Scanner s = new Scanner(System.in);
            int input = s.nextInt();
            if(input == 0)
                break;
        }
    }
}
