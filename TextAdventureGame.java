package textAdventureGame;

import java.util.Scanner;

public class TextAdventureGame {

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a mystical forest, surrounded by ancient trees and strange sounds.");
        System.out.println("Before you lies three paths. Choose your fate wisely:");

        // First decision point
        System.out.println("1. Take the left path.");
        System.out.println("2. Take the middle path.");
        System.out.println("3. Take the right path.");

        int firstChoice = getUserChoice(scanner, 3);

        if (firstChoice == 1) {
            System.out.println("As you travel down the left path, you encounter a wise old hermit.");
            System.out.println("What will you do?");
            System.out.println("1. Ask for advice.");
            System.out.println("2. Ignore the hermit and continue.");

            int hermitChoice = getUserChoice(scanner, 2);

            if (hermitChoice == 1) {
                System.out.println("The hermit shares ancient wisdom and guides you to a hidden cave. You win!");
            } else {
                System.out.println("You decide to ignore the hermit and continue. The adventure continues...");
            }

        } else if (firstChoice == 2) {
            System.out.println("Taking the middle path, you encounter a magical bridge guarded by a mystical creature.");
            System.out.println("What will you do?");
            System.out.println("1. Answer a riddle to cross the bridge.");
            System.out.println("2. Attempt to sneak past the creature.");

            int bridgeChoice = getUserChoice(scanner, 2);

            if (bridgeChoice == 1) {
                System.out.println("You successfully answer the riddle and cross the bridge. The adventure continues...");
            } else {
                System.out.println("Your attempt to sneak past the creature fails, and you are sent back to the beginning.");
                startGame(); // Restart the game
                return;
            }

        } else {
            System.out.println("Taking the right path, you stumble upon a mystical portal.");
            System.out.println("What will you do?");
            System.out.println("1. Enter the portal.");
            System.out.println("2. Ignore the portal and continue.");

            int portalChoice = getUserChoice(scanner, 2);

            if (portalChoice == 1) {
                System.out.println("The portal transports you to a parallel world. You encounter friendly beings. You win!");
            } else {
                System.out.println("You decide to ignore the portal and continue. The adventure continues...");
            }
        }

        System.out.println("As you journey deeper into the forest, you encounter a fork in the road.");
        System.out.println("1. Take the path leading to a dark cave.");
        System.out.println("2. Follow the path that goes uphill.");

        int secondChoice = getUserChoice(scanner, 2);

        if (secondChoice == 1) {
            System.out.println("Entering the dark cave, you discover a hidden treasure. You win!");
        } else {
            System.out.println("Climbing uphill, you find a majestic waterfall.");
            System.out.println("What will you do?");
            System.out.println("1. Rest by the waterfall.");
            System.out.println("2. Attempt to climb the waterfall.");

            int waterfallChoice = getUserChoice(scanner, 2);

            if (waterfallChoice == 1) {
                System.out.println("Resting by the waterfall, you find a hidden path behind it. The adventure continues...");
            } else {
                System.out.println("Your attempt to climb the waterfall is challenging, but you reach the top. The adventure continues...");
            }
        }

        System.out.println("You've reached the end of your journey. Thank you for playing!");

        scanner.close();
    }

    public static int getUserChoice(Scanner scanner, int maxChoice) {
        int choice = -1;

        while (choice < 1 || choice > maxChoice) {
            System.out.print("Enter your choice (1-" + maxChoice + "): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice < 1 || choice > maxChoice) {
                    System.out.println("Invalid input. Please enter a valid choice.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume invalid input
            }
        }

        return choice;
    }
}

