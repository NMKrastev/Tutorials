import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        Integer result = calculator.add(firstNum, secondNum);
        System.out.println("Result: " + result);
    }

    public Integer add(Integer firstNum, Integer secondNum) {

        Integer result = firstNum + secondNum;

        return result;
    }
}

