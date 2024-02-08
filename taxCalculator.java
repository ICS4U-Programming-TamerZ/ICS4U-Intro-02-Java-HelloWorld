// !/usr/bin/env Java

// Created By: Tamer Zreg
// Date: Feb. 6, 2024
// This program asks the user for the cost of an item and tell them the total including HST.

// Import Utility
import java.util.*;

// taxCalculator Class
public class taxCalculator {
  // Main method entry point
  public static void main(String[] args) {
    // Scanner for input
    Scanner sc = new Scanner(System.in);
    // Defines Variables
    float taxRate, cost, totalCost;
    try {
      // Output to Console
      System.out.println("What is your local tax rate? (example: 13 for 13%)");
      // Gets taxRate input
      taxRate = sc.nextFloat();

      // Output to Console
      System.out.println("How much was your cost excluding tax?");
      // Gets cost input (without tax)
      cost = sc.nextFloat();

      // Converts from percentage to decimal
      taxRate = taxRate / 100;
      // Calculates total cost
      totalCost = cost * (taxRate + 1);

      // Output to Console
      System.out.println("Your total cost will be: $" + (totalCost) + " CAD");
    }
    // If user input a string or any other errors
    catch (Exception e) {
      // Output error message to console
      System.out.print("Invalid" + e.getMessage());
    }
  }
}
