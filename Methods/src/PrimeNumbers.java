import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number: ");
        int secondNum = Integer.parseInt(scanner.nextLine());

       printPrime(firstNum, secondNum);

    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int firstNum, int secondNum) {
        for (int i = firstNum; i <= secondNum; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
