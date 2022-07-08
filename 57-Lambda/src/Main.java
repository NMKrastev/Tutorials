public class Main {
    public static void main(String[] args) {

        /*lambda expression - feature for Java 8 and above,
		Also known as an anonymous method.
		A shorter way to write anonymous classes with only one method.
		Need to use a functional interface or use a pre-defined functional interface
		They contain only one abstract method
		ex. ActionListener, Runnable, (user-defined)

		A Lambda expression can be used in any place where a functional interface is required
		How to use a lambda expression:
		(arguments) -> {statement/s}*/

        /*String name = "Niki";
        char symbol = '!';
        Interface face = (nameX, symbolX) -> {
            System.out.println("Hello " + nameX + symbolX);
            System.out.println("It's a nice day!");
        };*/

        new Frame();
    }
}
