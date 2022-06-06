import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        Integer result = calculator.add(num1, num2);
        System.out.println("Result: " + result);
    }

    public Integer add(Integer arg1, Integer arg2) {

        Integer result = arg1 + arg2;

        return result;
    }
}

