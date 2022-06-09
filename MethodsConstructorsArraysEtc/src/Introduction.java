import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {

        System.out.print("Enter your name and age: ");
        System.out.print(getName() + " " + getAge());

    }

    public static String getName() {
        return new Scanner(System.in).nextLine();
    }

    public static int getAge() {
        return new Scanner(System.in).nextInt();
    }
}
