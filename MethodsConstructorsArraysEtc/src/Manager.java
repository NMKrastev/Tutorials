public class Manager {
    double salary;

    public void display(Integer valueToBePrinted) {
        System.out.println("Printing Integer value " + valueToBePrinted);
    }

    public void display(String valueToBePrinted) {
        System.out.println("Printing String value " + valueToBePrinted);
    }

    public static void main(String[] args) {
        Manager seniorManager = new Manager();
        seniorManager.display(100);
        seniorManager.display("grade 2");
    }
}
