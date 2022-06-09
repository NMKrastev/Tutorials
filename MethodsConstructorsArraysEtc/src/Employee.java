public class Employee extends Manager {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.salary = 1000;
        System.out.println("Employee salary: " + emp.salary);

        Manager manager = new Manager();
        manager.salary = 10000;
        System.out.println("Manager salary: " + manager.salary);
    }
}
