**Problem Solving through Programming**

**The Concepts:**

1. **Variables**  
2. **Operators**  
3. **Conditionals**  
4. **Looping**

**Problem Solving:**

1. **Design**  
2. **Pseudo-Code**  
3. **Code it**  
4. **Test it**

**The Concepts:**

1. **Variables:**   
   In programming, variables act as container to store and manipulate information, making it easier to work with data and solve problems efficiently.  
     
   Similar to how we see variables used in mathematics, we are abstracting an equation for multiple uses.

   Just like with the Pythagorean theorem used to solve for the length of the hypotenuse of a right triangle, variables are used to abstract the problem to help you solve the problem.  
     
   Let’s start by looking at this example  
     
   From this we can setup the equation  
     
   52 \+ 62 \= ?2

   So that’s simple if we have to solve one problem, but math homework wasn’t ever that simple. We always have to solve countless problems, and just imagine a world where instead of doing the math problem, you could actually just set two variables, then have your answer and be done. 

   

   So we look at the abstraction of the Pythagorean theorem and find this equation

   

   a2 \+ b2 \= c2

   

   With that, we can then just plug numbers into our a and b value

   a \= 5 

   b \= 6

   Therefore we have 52 \+ 62 \=  c2 

   

   

   But what if the triangle changes?

		a \= 4  
b \= 7   
Therefore we have 42 \+ 72 \= c2

Types of Variables: 

	**boolean**: true or false. (Think binary  0 or 1\)

	**int**: A whole number

	**char**: A single character

	**String:** A word or sentence (Collection of ordered characters)

Variable Assignment Java Syntax Examples:

| *// Example Declaring (Boolean):* boolean isRaining \= true; *// Example Declaring (Integer):*int temperature \= 75;*// Example Declaring (Character):*char favoriteLetter \= 'c';*// Example Later Setting (Integer):*temperature \= 77;*// Example Declaring (Character):*favoriteLetter \= 'g'; |
| :---- |

2. **Operators**

- Arithmetic Operators

| Operator | Description | Java Syntax Example |
| :---: | :---: | :---: |
| \+ | Addition | 5 \+ 3  (8) |
| \- | Subtraction | 10 \- 4 (6) |
| \* | Multiplication | 6 \* 2 (12) |
| / | Division | 15 / 5 (3) |


- Comparison Operators

| Operator | Description | Java Syntax Example |
| :---: | :---: | :---: |
| \== | Equal to | 5 \== 5 |
| \!= | Not equal to | 7 \!= 3 |
| \> | Greater than | 12 \> 8  |
| \< | Less than | 2 \< 6 |
| \>= | Greater than or equal to | 10 \>= 10 |
| \<= | Less than or equal to | 3 \<= 7 |


- Logical Operators

| Operator | Description | Java Syntax Example |
| :---: | :---: | :---: |
| && | Logical AND | (5 \> 3\) && (8 \< 10\) (true) |
| || | Logical OR | (2 \== 2\) || (1 \> 5\) (true) |
| \! | Logical NOT | \!(7 \< 4\) (true) |

	

3. **Conditionals**

Conditionals are fundamental building blocks in programming, enabling programs to make decisions and execute different actions based on various conditions. They introduce logic and flexibility, allowing software to respond dynamically to different inputs and situations. Without conditionals, programs would be limited to executing the same instructions every time, regardless of the circumstances.

Imagine a program that determines if a user is eligible to vote. Using an "if" statement, the program can check if the user's age is greater than or equal to the voting age. Based on this condition (age), the program can then display the appropriate message – either confirming eligibility or stating that the user is not yet old enough. This simple example illustrates how conditionals empower programs to adapt their behavior, making them more interactive, versatile, and capable of solving a wider range of problems.

The key thing to remember is

`IF (condition1 is met) THEN DO`   
	`Execute code block 1`  
`ELSE IF (condition2 is met) THEN DO`  
	`Execute code block 2`  
`ELSE (last resort or catch all) THEN DO`  
	`Execute code block 3`

See how in this simple example, we might have the program do 3 very different things based on IF conditions are met?

It’s as simple as coming up to a four way road intersection.

Conditional Java Syntax Example:

| int temp \= 35;if ( temp \< 45 ) {    System.out.println("We should grab a winter coat to take to school");} else if ( (temp \>= 45) && (temp \< 65) ) {    System.out.println("We should grab a light jacket to take to school");} else {    System.out.println("We don't need a jacket or coat today");} |
| :---- |

4. **Looping**

Loops are another essential construct in programming, providing a way to execute a block of code repeatedly. This repetition allows for efficient automation of tasks and processes that would otherwise require writing the same lines of code multiple times. Think of a program that needs to print the numbers from 1 to 100\. Instead of manually coding each print statement, a loop can automate this process with just a few lines of code, significantly improving efficiency and readability.

Beyond simple repetition, loops are crucial for handling collections of data, like lists or arrays. For example, imagine a program that calculates the average grade of a class. A loop can iterate through the list of student grades, adding each grade to a total and then dividing by the number of students. This ability to process data sequentially makes loops indispensable for tasks like searching, sorting, and filtering information, ultimately enabling programs to manage and manipulate large datasets effectively.

In simplified terms, we could write 99 lines instructing the program to output something like this:

| print("I really like learning about Programming Concepts")print("I really like learning about Programming Concepts")print("I really like learning about Programming Concepts")print("I really like learning about Programming Concepts")print("I really like learning about Programming Concepts")...print("I really like learning about Programming Concepts")print("I really like learning about Programming Concepts")print("I really like learning about Programming Concepts")print("I really like learning about Programming Concepts")print("I really like learning about Programming Concepts") |
| :---- |

Although this is ugly, and other than the ease of Copy-Paste, it’s tedious to actually program this. Instead with a loop, we can do the same thing in half the work-time and significantly less code lines

| for 100 loops:	print("I really like learning about Programming Concepts") |
| :---- |

So looping allows us to perform the same action over and over again in order to accomplish a given task. 

Looping Java Syntax Example:

| *// Simple:*for ( int i \= 0 ; i \< 5 ; i++ ) {  System.out.println( "Iteration " \+ i ) ;}*// Output:*Iteration 0Iteration 1Iteration 2Iteration 3Iteration 4 |
| :---- |

| *// More Complex:*int i \= 0;      *// Iteration Counter*boolean continueFlag \= true;while ( continueFlag ) {  System.out.println( "Iteration " \+ iteration ) ;  System.out.print("Do you want to continue? (y/n)  ");   *// Ask User*    inputChar \= scanner.nextLine().charAt(0);               *// Get Answer*  if (inputChar \!= 'y' && inputChar \!= 'Y') {    continueFlag \= false;                                 *// IF \!yes don't continue*  }}*// Output:*Iteration 0Do you want to continue? (y/n)  yIteration 1Do you want to continue? (y/n)  yIteration 2Do you want to continue? (y/n)  n |
| :---- |

**Problem Solving Steps:**

1. **Design**  
   

Designing an algorithm is like creating a detailed recipe for a computer to follow. It involves breaking down a task into a sequence of precise, unambiguous steps that lead to the desired outcome. Imagine you're writing instructions for baking a cake. You wouldn't just say "bake the cake." Instead, you'd specify each step: preheat the oven, mix the ingredients, pour the batter, and so on. Similarly, an algorithm outlines the exact steps, decisions, and calculations the computer must perform to achieve a specific goal.

For example, let's consider the task of finding the largest number in a list. The algorithm might involve these steps: 

1. Start with the first number as the assumed largest.   
2. Compare this number with the next number in the list.   
3. If the next number is larger, update the assumed largest number.   
4. Repeat steps 2 and 3 for the remaining numbers in the list. 

By clearly defining these steps, the algorithm provides a foolproof method for the computer to identify the largest number, regardless of the specific list provided. This systematic approach ensures that the program executes the task correctly and efficiently every time.

2. **Pseudo-code**

Pseudo-code is crucial because it bridges the gap between human logic and programming languages. It allows you to sketch out the structure and flow of your program in a clear, human-readable format before diving into the specific syntax of a programming language, making it easier to spot potential errors and refine your logic beforehand.

Continuing with our example above, we might write the following pseudo-code to detail out our example from above like this:

**List \= \[ 8, 6, 3, 7, 9 \]**  
**Variable MAX \= List(Number 1) or 8**  
**Loop ( for number in List ):**   
  **Conditional ( if MAX \< number ) :**  
    **Variable MAX \= number** 

We can see how this is closer to our actual code solution that we will write.

3. **Code it**

Translating the Pseudo-Code into real code should just be a matter of finding the appropriate syntax for what you’re attempting to do. In this class we will be using Java, so we will need to follow the strict language structure to make the pseudo-code actually work.

See programming concept sections for Java Syntax examples:

For our program to calculate the max number in a list of numbers, it would look like this:

| public class MaxNumber {    public static void main(String\[\] args) {        int\[\] numbers \= {8, 6, 3, 7, 9};        int max \= numbers\[0\]; *// Assume the first number is the largest initially*        *// Loop through the array, comparing each number to the current max*        for (int i \= 1; i \< numbers.length; i++) {            if (numbers\[i\] \> max) {                max \= numbers\[i\]; *// Update max if a larger number is found*            }        }        System.out.println("The largest number is: " \+ max);    }} |
| :---- |

4. **Test it**

Simply put, testing is important because it helps you find and fix mistakes in your code *before* they become bigger problems.

Think of it as a quality check. You're making sure your code does what it's supposed to do, handles different situations correctly, and produces the right results. This is crucial because even small errors can have big consequences, especially as your programs become more complex.

Testing also helps you build confidence in your code. When you know your code has passed a series of tests, you can be more confident that it will work reliably in the real world. This is especially important if your code will be used by others or in critical applications.

So in this stage, we might run the following list of numbers through the program:

| List \= \[ 5, 6, 8, 9, 7, 2, 10, 9, 7 \]List \= \[ 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 \]List \= \[ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 \]List \= \[ 100, 200, 350, 45, 75, 89, 100 \] |
| :---- |

This is not an all encompassing list of test cases, but it is a start. We want to push the program and find its breaking points so that we can get the issues resolved and rely on the program in the future.  
