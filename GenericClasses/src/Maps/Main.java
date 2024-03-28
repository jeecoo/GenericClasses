package Maps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyMap<String, Integer> countryCodes = new MyMap<>();

        boolean continueAction = true;

        while (continueAction) {
            try {
                System.out.println("[1] Add a country");
                System.out.println("[2] Remove a country");
                System.out.println("[3] Get country code");
                System.out.println("[4] Display all countries");
                System.out.println("[5] Exit");

                System.out.print("Choose an action: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter country name: ");
                        String country = scanner.nextLine();
                        if (!country.matches("[a-zA-Z]+")) {
                            throw new IllegalArgumentException("Country name must be a string.");
                        }
                        System.out.print("Enter country code: ");
                        int code = scanner.nextInt();
                        scanner.nextLine();
                        countryCodes.put(country, code);
                        System.out.println("Country added successfully.");
                        break;
                    case 2:
                        System.out.print("Enter country name to remove: ");
                        String countryToRemove = scanner.nextLine();
                        if (!countryToRemove.matches("[a-zA-Z]+")) {
                            throw new IllegalArgumentException("Country name must be a string.");
                        }
                        Integer removedCode = countryCodes.remove(countryToRemove);
                        if (removedCode != null) {
                            System.out.println("Country '" + countryToRemove + "' removed successfully.");
                        } else {
                            System.out.println("Country not found.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter country name to get code: ");
                        String countryToGet = scanner.nextLine();
                        if (!countryToGet.matches("[a-zA-Z]+")) {
                            throw new IllegalArgumentException("Country name must be a string.");
                        }
                        Integer retrievedCode = countryCodes.get(countryToGet);
                        if (retrievedCode != null) {
                            System.out.println("Country code for '" + countryToGet + "': " + retrievedCode);
                        } else {
                            System.out.println("Country not found.");
                        }
                        break;
                    case 4:
                        System.out.println("**ALL COUNTRIES**:");
                        countryCodes.displayAll();
                        break;
                    case 5:
                        continueAction = false;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
                if (continueAction) {
                    System.out.print("Do you want to perform another action? (yes/no): ");
                    String userInput = scanner.nextLine();
                    continueAction = userInput.equalsIgnoreCase("yes");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Exiting the program. Thank you!");
    }
}
