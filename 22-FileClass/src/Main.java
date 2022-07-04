import java.io.File;

public class Main {
    public static void main(String[] args) {

        //file - an abstract representation of file and directory pathname

        //File file = new File("C:\\Users\\n.krastev\\Documents\\GitHub\\Tutorials\\22-FileClass\\secret_message.txt");
        File file = new File("secret_message.txt");

        if (file.exists()) {
            System.out.println("That file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //Deletes the file after running the program
            //file.delete();
        } else {
            System.out.println("That file does not exist");
        }
    }
}
