import java.util.Scanner;

public class CodingConcepts {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nChoose a concept to explore:");
      System.out.println("1. Variables");
      System.out.println("2. Operators");
      System.out.println("3. Conditionals");
      System.out.println("4. Loops");
      System.out.println("5. Exit");

      System.out.print("Enter your choice (1-5): ");
      int choice = scanner.nextInt();

      if (choice == 1) {
        exampleVariables();
      } else if (choice == 2) {
        exampleOperators();
      } else if (choice == 3) {
        exampleConditionals();
      } else if (choice == 4) {
        exampleLoops();
      } else if (choice == 5) {
        System.out.println("Exiting program. Goodbye!");
        scanner.close();
        return; // Exit the program
      } else {
        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
      }
    }
  }

  public static void exampleVariables() {
    // Setting Variables:
    System.out.println("\nExploring Variables");

    // Boolean (boolean) = Very simple true or false value;
    boolean myBoolean = true;

    // Integers (int) - Think Whole Numbers
    int myNumber = 10;

    // Character (char) = A Single Character
    char myChar = 'G';

    // String (String) = A Word, Sentence, or Paragraph. Multiple sequential characters
    String myString = "Hello World";

    /*
     * Print out our values:
     * Even though we declared the variables above, we can still recall and use them later in the program
     */

    System.out.println("myBoolean = " + myBoolean);
    System.out.println("myNumber = " + myNumber);
    System.out.println("myChar = " + myChar);
    System.out.println("myString = " + myString);

    System.out.println("RESETTING THE VARIABLES");

    /*
     * What if we need to reset a variable though?
     * We just need to drop the variable type from the front of the set (boolean, int, char, String)
     */

    myBoolean = false;
    myNumber = 7;
    myChar = 'A';
    myString = "Hello Universe";

    /*
     * Print out our values:
     */

    System.out.println("myBoolean = " + myBoolean);
    System.out.println("myNumber = " + myNumber);
    System.out.println("myChar = " + myChar);
    System.out.println("myString = " + myString);

    // Return to main
  }

  public static void exampleOperators() {
    System.out.println("\nExploring Operators:");

    // Arithmetic Operators
    int a = 10;
    int b = 5;
    System.out.println("a + b = " + (a + b));  // Addition
    System.out.println("a - b = " + (a - b));  // Subtraction
    System.out.println("a * b = " + (a * b));  // Multiplication
    System.out.println("a / b = " + (a / b));  // Division
    System.out.println("a % b = " + (a % b));  // Modulus (remainder)

    // Assignment Operators
    int c = 20;
    c += 5;  // c = c + 5;
    System.out.println("c += 5: " + c);
    c -= 10; // c = c - 10;
    System.out.println("c -= 10: " + c);
    c *= 2;  // c = c * 2;
    System.out.println("c *= 2: " + c);
    c /= 4;  // c = c / 4;
    System.out.println("c /= 4: " + c);

    // Comparison Operators (result in a boolean value)
    int x = 10;
    int y = 7;
    System.out.println("x == y: " + (x == y)); // Equal to
    System.out.println("x != y: " + (x != y)); // Not equal to
    System.out.println("x > y: " + (x > y));  // Greater than
    System.out.println("x < y: " + (x < y));  // Less than
    System.out.println("x >= y: " + (x >= y)); // Greater than or equal to
    System.out.println("x <= y: " + (x <= y)); // Less than or equal to

    // Logical Operators (used with boolean values)
    boolean p = true;
    boolean q = false;
    System.out.println("p && q: " + (p && q)); // Logical AND
    System.out.println("p || q: " + (p || q)); // Logical OR
    System.out.println("!p: " + (!p));        // Logical NOT

    // Increment and Decrement Operators
    int i = 5;
    System.out.println("i++: " + (i++)); // Post-increment (use the value, then increment)
    System.out.println("++i: " + (++i)); // Pre-increment (increment, then use the value)
    System.out.println("i--: " + (i--)); // Post-decrement
    System.out.println("--i: " + (--i)); // Pre-decrement
  }

  public static void exampleConditionals() {
    System.out.println("\nExploring Conditionals:");

    // If Statement
    int age = 20;
    if (age >= 18) {
      System.out.println("You are an adult.");
    }

    // If-Else Statement
    int score = 75;
    if (score >= 60) {
      System.out.println("You passed the exam.");
    } else {
      System.out.println("You failed the exam.");
    }

    // If-Else If-Else Statement
    int temperature = 25;
    if (temperature > 30) {
      System.out.println("It's hot outside.");
    } else if (temperature > 20) {
      System.out.println("The weather is pleasant.");
    } else {
      System.out.println("It's cold outside.");
    }

    // Nested If Statements
    int num = 10;
    if (num > 0) {
      System.out.println("The number is positive.");
      if (num % 2 == 0) {
        System.out.println("The number is even.");
      } else {
        System.out.println("The number is odd.");
      }
    }
  }

  public static void exampleLoops() {
    System.out.println("\nExploring For Loops:");

    // Basic for loop structure:
    // for (initialization; condition; update) {
    //     // Code to be executed in each iteration
    // }

    // Example 1: Print numbers from 1 to 5
    System.out.println("Numbers 1 to 5:");
    for (int i = 1; i <= 5; i++) {
      System.out.print(i + " ");
    }
    System.out.println(); // Print a new line

    // Example 2: Calculate the sum of numbers from 1 to 10
    int sum = 0;
    for (int j = 1; j <= 10; j++) {
      sum += j; // Equivalent to sum = sum + j;
    }
    System.out.println("Sum of numbers 1 to 10: " + sum);

    // Example 3: Iterate through an array
    int[] numbers = {2, 4, 6, 8, 10};
    System.out.println("Numbers in the array:");
    for (int k = 0; k < numbers.length; k++) {
      System.out.print(numbers[k] + " ");
    }
    System.out.println();

    // Example 4: Nested for loops to print a pattern
    System.out.println("Pattern:");
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    // Example 5: Looping backwards
    System.out.println("Numbers 5 to 1:");
    for (int i = 5; i >= 1; i--) {
      System.out.print(i + " ");
    }
    System.out.println();

    /*
     * While and Do-While Loops:
     *
     * While loops are useful when you don't know the exact number of iterations in advance.
     * The loop continues as long as the condition is true.
     *
     * Do-while loops are similar to while loops, but they guarantee that the code block
     * is executed at least once before checking the condition.
     */
  }
}
