import java.util.Scanner;

public class checkForEquality {
    public static void main(String[] args) {

        //user greeting and explanation of program functions
        String greeting = "Welcome"
                + System.lineSeparator() + "This program will compare three numbers and output 'OK' if any two numbers are equal."
                + System.lineSeparator() + "If all numbers are equal or all numbers are different the output will be 'NOT OK'."
                + System.lineSeparator();
        System.out.println(greeting);

        // Menu was added to allow running multiple times without having to restart the program.
        // However adding the menu caused the program to loop, so I added an option to quit.
        checkForEquality.optionMenu();
    }

    private static void optionMenu() {

        Scanner menuInput = new Scanner(System.in);

        // Display the menu
        System.out.println("1.\t Run Program");
        System.out.println("2.\t Quit");
        System.out.print("Input your selection and press enter: ");

        // Get users choice
        int choice = menuInput.nextInt();

        // Process user input and move to chosen step
        switch (choice) {
            case 1: checkForEquality.equalityCalc();
                break;
            case 2: System.out.println("Goodbye");
                break;
            default: System.out.println("Invalid choice");
                checkForEquality.optionMenu();
        menuInput.close();
        }
    }
    // This method collects input and checks for equality of at least 2 but not more than 2 numbers.
    private static void equalityCalc() {
        Scanner calcInput = new Scanner(System.in);

        // Allows input of 3 integers by the user
        System.out.print("Enter first number -->\t ");
        int a = calcInput.nextInt();

        System.out.print("Enter second number -->\t ");
        int b = calcInput.nextInt();

        System.out.print("Enter third number -->\t ");
        int c = calcInput.nextInt();

        // performs the logic and prints the result to the console.
        String result = "";
        if(a > 0 && b > 0 && c > 0) {
            if(((a == b || a == c) && (b != c)) || ((a != b && b == c))) {
                result = "OK";
            } else {
                result = "NOT OK";
            }
            System.out.println("Your result is: " + result);
            checkForEquality.optionMenu();
        } else {
            System.out.println("Please use valid 'Natural' numbers. (1,2,3,4,...)");
            checkForEquality.equalityCalc();
        }
        calcInput.close();
    }

}