/**
 * Checks your age and tells you weather or not you can vote.
 *
 * @author Tamer
 * @version 1.0
 * @since 2024/02/06
 */

// Import Utility
import java.util.*;

// Voting Class
public class voting {
  // Main method entry point
  public static void main(String[] args) {
    // Scanner used for input
    Scanner sc = new Scanner(System.in);

    // Output to console
    System.out.println("How old are you?");
    // Input age variable from user
    int age = sc.nextInt();

    // If age is below 18
    if (age < 18) {
      // Output to console
      System.out.println("Sorry you will have to wait " + (18 - age) + " year(s).");
    }
    // If they are younger than 18
    else {
      // Output to console
      System.out.println("You are eligible to vote.");
    }
  }
}
