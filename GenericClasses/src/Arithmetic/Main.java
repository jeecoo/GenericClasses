package Arithmetic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double n1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double n2 = scanner.nextDouble();

            Arithmetic<Double, Double> arithmetic = new Arithmetic<>(n1, n2);

            System.out.println("Addition: " + arithmetic.add());
            System.out.println("Subtraction: " + arithmetic.subtract());
            System.out.println("Multiplication: " + arithmetic.multiply());
            try {
                System.out.println("Division: " + arithmetic.divide());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Minimum: " + arithmetic.getMin());
            System.out.println("Maximum: " + arithmetic.getMax());
        } catch (InputMismatchException e) {
            System.out.println("Error! Please enter valid numeric inputs.");
        }
    }
}
