import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException {

        //Serialization - The process of converting an object into a byte stream.
        //Persists (saves the state) the object after program exits
        //This byte stream can be saved as a file or sent over a network
        //Byte stream can be saved as a file (.ser) which is platform independent
        //(Think of this as if you're saving a file with the object's information)

        //Steps to Serialize
        //---------------------------------------------------------------
        //1. Your class should implement Serializable interface
        //2. add import java.io.Serializable;
        //3. FileOutputStream fileOut = new FileOutputStream(file path)
        //4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
        //5. out.writeObject(objectName)
        //6. out.close(); fileOut.close();
        //					---------------------------------------------------------------

        //IMPORTANT NOTES:
        //1. Child classes of a parent class that implements Serializable will do so as well
        //2. Static fields are not serialized (they belong to the class, not an individual object)
        //3. Fields declared as "transient" aren't serialized, they're ignored
        //4. The class's definition ("class file") itself is not recorded, cast it as the object type
        //5. serialVersionUID is a unique version ID

        //SerialVersionUID - serialVersionUID is a unique ID that functions like a version #
        //Verifies that the sender and receiver of a serialized object,
        //have loaded classes for that object that are compatible.
        //Ensures object will be compatible between machines.
        //Number must match. Otherwise, this will cause a InvalidClassException.
        //A SerialVersionUID will be calculated based on class properties, members, etc.
        //A serializable class can declare its own serialVersionUID explicitly (recommended).

        User user = new User();

        user.name = "Niki is coding";
        user.password = "PASSword1234";
        user.sayHello();

        FileOutputStream fileOut = new FileOutputStream("59-Serialization\\UserInfo.ser");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

        objectOut.writeObject(user);
        objectOut.close();
        fileOut.close();

        System.out.println("Object info saved");

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);

    }
}
