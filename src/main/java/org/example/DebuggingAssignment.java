package org.example;

public class DebuggingAssignment {
    public static double calculateAverage(int[] numbers) {
        // Uncomment to introduce a null pointer exception
        // int length = numbers.length;

        // Uncomment to introduce an array index out of bounds exception
        // int sum = 0;
        // for (int i = 0; i <= numbers.length; i++) {
        //     sum += numbers[i];
        // }

        // Uncomment to introduce a logic error
        // return (double) sum / (numbers.length - 1);

        // Correct implementation
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
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("The average is: " + calculateAverage(numbers));
    }
}

// ### Null Pointer Exception
// Line: int length = numbers.length;
// Fix: Check if 'numbers' is null before accessing its length.
// Debugger: Set a breakpoint, run debugger, inspect 'numbers' variable.

// ### Array Index Out of Bounds Exception
// Line: sum += numbers[i];
// Fix: Ensure loop condition is i < numbers.length.
// Debugger: Set a breakpoint at the loop, run debugger, step through loop, check value of 'i'.

// ### Logic Error
// Line: return (double) sum / (numbers.length - 1);
// Fix: Use (double) sum / numbers.length for correct average.
// Debugger: Set a breakpoint at return statement, run debugger, inspect 'sum' and 'numbers.length'.
