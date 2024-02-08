// !/usr/bin/env Java

// Created By: Tamer Zreg
// Date: Feb. 6, 2024
// This program creates a dialogue between the user and the program.

// Imports utility
import java.util.Scanner;

// Main Class
class Dialogue {
  // Main method entry point
  public static void main(String[] args) {
    // Setup for Scanner (Console input)
    Scanner sc = new Scanner(System.in);
    // Output to console
    System.out.println("Hello, what is your name?");
    // Input from console (name)
    String name = sc.next();
    // Concatenates name variable with sentence (Hello John Doe!)
    System.out.print("Hello" + " " + (name) + "! ");
    // Output to Console
    System.out.println("How are you doing today? (good/bad)");
    // Input from Console (feeling)
    String feeling = sc.next();
    // Checks if feeling is good
    if (feeling.equals("good")) {
      // Output to Console
      System.out.println("Im Glad you are feeling happy! :)");
    }
    // Checks if feeling is bad
    else if (feeling.equals("bad")) {
      // Output to Console
      System.out.println(("Im Sorry, I hope you feel better. :("));
    }
    // Exception
    else {
      // Output to Console
      System.out.println("Sorry I didn’t catch that, can you try again?");
    }
  }
}
