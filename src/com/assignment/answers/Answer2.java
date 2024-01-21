package com.assignment.answers;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        NumberProcessor numberProcessor = new NumberProcessor();
        int smallestNumber = numberProcessor.findSmallest(num1, num2, num3);

        System.out.println("Smallest number: " + smallestNumber);
    }
}

class NumberProcessor {
    public int findSmallest(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
            return num1;
        }

        int smallest = (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);
        return smallest;
    }
}