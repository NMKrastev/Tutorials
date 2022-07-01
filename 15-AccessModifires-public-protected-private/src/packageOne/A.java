package packageOne;
import packageTwo.*;

public class A {
    protected String protectedMessage = "This is protected";
    public static void main(String[] args) {

        C c = new C();

        System.out.println(c.publicMessage);

        B b = new B();
        //Can't access private message in B class
        System.out.println();

    }
}
