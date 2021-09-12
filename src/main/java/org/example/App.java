package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App
{
    public static void main( String[] args )
    {
        //What the password should be
        Scanner scanner = new Scanner(System.in);
        final String pass = "abc$123";

        //Asks what the password is
        System.out.print("What is the password? ");
        String userPass = scanner.nextLine();

        //Checks what the user entered
        if (userPass.equals(pass))
            System.out.print("Welcome!");
        else
            System.out.print("I don't know you.");
    }
}
