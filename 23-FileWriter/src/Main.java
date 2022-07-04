import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("file.txt");
            writer.write("First line of text that will be written to the file\n" +
                    "Second line of text that will be written to the file\n" +
                    "Third line of text that will be written to the file");
            writer.append("\n(A file by me)");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
