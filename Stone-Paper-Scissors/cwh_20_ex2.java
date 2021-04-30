package com.company;

import java.util.Random;
import java.util.Scanner;

public class cwh_20_ex2 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int a;

        System.out.println("-----------------------------------------------");
        System.out.println("WELCOME TO THE GAME OF STONE, PAPER AND SCISSOR");
        System.out.println("-----------------------------------------------");
        System.out.println();
        System.out.println("TYPE \"0\" FOR \"STONE\"");
        System.out.println("TYPE \"1\" FOR \"PAPER\"");
        System.out.println("TYPE \"2\" FOR \"SCISSOR\"");

        int scrComp = 0;
        int scrUser = 0;

        while(i<=5) {
            a = rand.nextInt(3);
            System.out.print("Type Here: ");
            int user = sc.nextInt();

//        0 is used for Stone
//        1 is used for Paper
//        2 is used for Scissor

            switch (a) {
                case 0 -> System.out.println("Computer has taken STONE");
                case 1 -> System.out.println("Computer has taken PAPER");
                case 2 -> System.out.println("Computer has taken SCISSOR");
            }

            if (a == user) {
                System.out.println("Match is tie. Try Again!");
            }

            else if (a == 0 && user == 1) {
                System.out.println("You have WON the match.");
                scrUser+= 1;
            }

            else if (a == 0 && user == 2) {
                System.out.println("Computer has WON the match.");
                scrComp+=1;
            }

            else if (a == 1 && user == 2) {
                System.out.println("You have WON the match.");
                scrUser+= 1;
            }

            else if (a == 1 && user == 0) {
                System.out.println("Computer has WON the match.");
                scrComp+=1;
            }

            else if (a == 2 && user == 0) {
                System.out.println("You have WON the match.");
                scrUser+= 1;
            }

            else if (a == 2 && user == 1) {
                System.out.println("Computer has WON the match.");
                scrComp+=1;
            }

            else {
                System.out.println("INVALID SYNTAX");
            }

            i++;
        }

        System.out.println("Your Final Score: \n"+scrUser);
        System.out.println("Computer's  Final Score: \n"+scrComp);

        if (scrUser < scrComp) {
            System.out.println("COMPUTER HAS WON THE FINAL MATCH. TRY AGAIN!!");
        }

        else if (scrUser > scrComp) {
            System.out.println("YOU HAVE WON THE FINAL MATCH");
        }

        else {
            System.out.println("THE FINAL MATCH IS TIED");
        }

    }

}
