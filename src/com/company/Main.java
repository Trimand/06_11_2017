package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Dialog minDialog = new DanskDialog();

        minDialog = new EngelskDialog();

        Scanner scanner = new Scanner(System.in);

        String ans = "y";

        while (ans.equalsIgnoreCase("y") ||
                ans.equalsIgnoreCase("j")) {
            System.out.println(minDialog.greetings());

            System.out.println(minDialog.AskForLanguageChange());
            ans = scanner.nextLine();
            if (ans.equalsIgnoreCase("j") || ans.equalsIgnoreCase("y")) {
                minDialog = changelanguage();
            }

            System.out.println(minDialog.AskForcontinue());
            ans = scanner.nextLine();
        }
        System.out.println(minDialog.Goodbye());
    }

    public static Dialog changelanguage() {

        Scanner scanner = new Scanner(System.in);
        String ans;
        while (true) {
            System.out.println("choose language eng / dk ");
            ans = scanner.nextLine();
            if (ans.equalsIgnoreCase("dk") || ans.equalsIgnoreCase("eng")) {
                break;
            }
        }
        if (ans.equalsIgnoreCase("dk")) {
            return new DanskDialog();
        } else {
            return new EngelskDialog();

        }


    }

}