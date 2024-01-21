package com.assignment.answers;

import java.util.Scanner;

class SkyAirlines {
     String customerName;
     String source;
     String destination;

    // Method to get customer details
    public void getCustomerDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name");
        customerName = scanner.nextLine();

        System.out.println("Enter source");
        source = scanner.nextLine();

        System.out.println("Enter destination");
        destination = scanner.nextLine();
    }

    // Method to print the message
    public void printMessage() {
        System.out.println("Dear " + customerName + ",");
        System.out.println("Thank you for choosing Sky Airlines.");
        System.out.println("Your flight from " + source + " to " + destination + " is confirmed.");
        System.out.println("We wish you a pleasant journey!");
    }
}

public class Answer1 {
    public static void main(String[] args) {
        SkyAirlines skyAirlines = new SkyAirlines();
        skyAirlines.getCustomerDetails();
        skyAirlines.printMessage();
    }
}