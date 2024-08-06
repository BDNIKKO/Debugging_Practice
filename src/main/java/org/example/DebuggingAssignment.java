package org.example;
public class DebuggingAssignment {
    // Method to calculate the average of an array of integers
    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        // Test the method with an array containing 1, 2, 3, 4, 5
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("The average is: " + calculateAverage(numbers));

        // Introduce a null pointer exception
        try {
            numbers = null;
            System.out.println("The average is: " + calculateAverage(numbers));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }

        // Introduce an array index out of bounds exception
        try {
            int[] invalidNumbers = {1, 2, 3, 4, 5};
            for (int i = 0; i <= invalidNumbers.length; i++) {
                System.out.println(invalidNumbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        // Introduce a logic error
        try {
            int[] logicErrorNumbers = {1, 2, 3, 4, 5};
            System.out.println("The incorrect average is: " + calculateIncorrectAverage(logicErrorNumbers));
        } catch (Exception e) {
            System.out.println("Logic error detected.");
        }
    }

    // Method to introduce a logic error
    public static double calculateIncorrectAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / (numbers.length - 1);  // Intentional logic error
    }
}