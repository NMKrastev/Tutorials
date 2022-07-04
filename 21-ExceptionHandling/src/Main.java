import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //exception - an event that occurs during the execution of a program that,
        //disrupts the normal flow of instructions.

        try {

            System.out.println("Enter a number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("Result: " + z);
            //It is a good practice to catch specific exception
        } catch(ArithmeticException e) {
            System.out.println("You cannot divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number!");
            //This will catch all exception
            //It is good to use it after all specific exception in case you missed something
        } catch (Exception e) {
            System.out.println("Something went wrong");
            //This will always execute the command in the finally block
        } finally {
            System.out.println("This will always print");
            scanner.close();
        }
    }
}
