package packageTwo;
import packageOne.*;

public class C {

    //No access modifiers
    //Anything using default modifier is visible only in the same package
    String defaultMessage = "This is the default";

    //Using public modifier
    //Can be accessed from any package given it's imported
    //Same goes with classes
    public String publicMessage = "This is public";

    //Using protected modifier
    //Can be accessed from another class/package as long as the class trying to access it extends the parent class
    protected String protectedMessage = "This is protected";

    //Using private modifier
    //Only the class that contains the private can assess it
    private String privateMessage = "This is private";

}
