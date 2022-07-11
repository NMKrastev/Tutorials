import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1;
    String name;
    transient String password;

    public void sayHello() {
        System.out.printf("Hello, %s\n", name);
    }
}


