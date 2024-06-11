![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB Java | Loops and Version Control

## Introduction

We have just learned how to iterate over arrays in different ways according to the needs so now let's practice a bit.

<br>

## Requirements

1. Fork this repo.
2. Clone this repo.
3. Add your instructor and the class graders as collaborators to your repository. If you are unsure who your class graders are, ask your instructor or refer to the day 1 slide deck.
4. In the repository, create a Java project and add the code for the following prompts.

## Submission

Once you finish the assignment, submit a URL link to your repository or your pull request in the field below.

<br>

## Instructions

### Task 1

Write a Java method that returns the difference between the largest and smallest values in an array of integers. The length of the array must be at least 1.

### Task 2

Write a Java method that finds the smallest and second smallest elements of a given array and prints them to the console.

### Task 3

Write a Java method that calculates the result of the following mathematical expression, where `x` and `y` are two variables that have been pre-set in your code:

<br>

![img-1-formula](https://education-team-2020.s3-eu-west-1.amazonaws.com/java/img-1.png)

<br>

## FAQs

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">I am stuck and don't know how to solve the problem or where to start. What should I do?</summary>

  <br> <!-- ✅ -->

  If you are stuck in your code and don't know how to solve the problem or where to start, you should take a step back and try to form a clear, straight forward question about the specific issue you are facing. The process you will go through while trying to define this question, will help you narrow down the problem and come up with potential solutions.

  For example, are you facing a problem because you don't understand the concept or are you receiving an error message that you don't know how to fix? It is usually helpful to try to state the problem as clearly as possible, including any error messages you are receiving. This can help you communicate the issue to others and potentially get help from classmates or online resources.

  Once you have a clear understanding of the problem, you should be able to start working toward the solution.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">How do I create a Maven project in IntelliJ?</summary>

  <br> <!-- ✅ -->

  To create a Maven project in IntelliJ, you can follow these steps:

  1. Open IntelliJ IDEA and click the "Create New Project" button.
  2. In the "New Project" dialog, select "Maven" as the build system.
  3. Specify the name of the project.
  4. In the "Project Location" section, specify a location where you want to save your project.
  5. Select the "Create Git repository" checkbox in order to initialize the git repository upon creation of the project.
  6. Click the "Create" button to create the Maven project.

 
</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">What is the significance of using Integer "MAX_VALUE" and "MIN_VALUE" in Java and how can they be used in a program?</summary>

  <br> <!-- ✅ -->

  The `Integer.MAX_VALUE` and `Integer.MIN_VALUE` are constants in the Java `Integer` class that represent the largest and smallest values an `int` type can have, respectively.

  The significance of using these values is that they provide a clear and standard way to represent the maximum and minimum values of an `int` type, which can be useful in various situations such as:

  1. **Defining boundaries:** You can use `Integer.MAX_VALUE` and `Integer.MIN_VALUE` to define the upper and lower bounds of an int variable or a range of values.
  2. **Comparisons:** You can use these values to compare an int value with the largest or smallest possible value and make decisions based on the comparison result.

  Here's how you can use `Integer.MAX_VALUE` and `Integer.MIN_VALUE` in a program:

  ```java
  int x = Integer.MAX_VALUE;
  int y = Integer.MIN_VALUE;

  System.out.println("The largest possible value of int is: " + x);
  
  System.out.println("The smallest possible value of int is: " + y);

  if (x > y) {
    System.out.println("x is larger than y");
  }
  ```

 
</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">What is a foreach loop and how can I use it in Java?</summary>

  <br> <!-- ✅ -->

  The `foreach` loop is a type of loop in Java that allows you to iterate over elements in a collection or array without using an explicit index. The syntax for a `foreach` loop is:

  ```java
  for (Type variable : collection) {
    // do something with each element
  }
  ```

  Where `Type` is the type of element in the collection, `variable` is a temporary variable to hold each element and `collection` is the collection or array being iterated over. The `foreach` loop will iterate over each element in the collection from start to end, executing the block of code within the loop for each element.

  Example usage:

  ```java
  int[] numbers = {1, 2, 3, 4, 5};
  for (int number : numbers) {
    System.out.println(number);
  }
  ```

  This will output:

  ```bash
  1
  2
  3
  4
  5
  ```

 
</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">I am unable to push changes to my repository. What should I do?</summary>

  <br> <!-- ✅ -->

  If you are unable to push changes to your repository, here are a few steps that you can follow:

  1. Check your internet connection: Ensure that your internet connection is stable and working.
  1. Verify your repository URL: Make sure that you are using the correct repository URL to push your changes.
  2. Check Git credentials: Ensure that your Git credentials are up-to-date and correct. You can check your credentials using the following command:

  ```bash
  git config --list
  ```

  4. Update your local repository: Before pushing changes, make sure that your local repository is up-to-date with the remote repository. You can update your local repository using the following command:

  ```bash
  git fetch origin
  ```

  5. Check for conflicts: If there are any conflicts between your local repository and the remote repository, resolve them before pushing changes.
  6. Push changes: Once you have resolved any conflicts and updated your local repository, you can try pushing changes again using the following command:

  ```bash
  git push origin <branch_name>
  ```

</details>
