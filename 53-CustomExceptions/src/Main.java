import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //exception - an event, after, execution, that disrupts the normal flow of a program
        //example: ArithmeticException, ArrayIndexOutOfBoundsException

        //user defined exception = custom exceptions
        //example: DuplicateEmail, InvalidCreditException, AgeException
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("A problem occurred: " + e);
        }
    }

    static void checkAge(int age) throws AgeException {

        if(age < 18) {
            throw new AgeException("\nYou must be 18+ to sign up");
        } else {
            System.out.println("You are now signed up");
        }
    }
}
