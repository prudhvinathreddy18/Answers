package com.assignment.answers;

import java.util.Scanner;

class NumberSwapper {
    private int first;
    private int second;

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        second = scanner.nextInt();
    }

    public void swapNumbers() {
        // Swap using bitwise XOR operator
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
    }

    public void displayResult() {
        System.out.println("After swapping:");
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);
    }
}

public class Answer3 {
    public static void main(String[] args) {
        NumberSwapper numberSwapper = new NumberSwapper();

        // Get user input
        numberSwapper.getUserInput();

        // Swap numbers using bitwise operator
        numberSwapper.swapNumbers();

        // Display the result
        numberSwapper.displayResult();
    }
}