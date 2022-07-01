package packageTwo;
import packageOne.*;

public class Asubclass extends A {
    public static void main(String[] args) {

        C c = new C();

        //Default modifier can be accessed because it's in the same package
        System.out.println(c.defaultMessage);

        //Can access the protected message because this class extends A class
        Asubclass aSubclass = new Asubclass();
        System.out.println(aSubclass.protectedMessage);

    }
}
