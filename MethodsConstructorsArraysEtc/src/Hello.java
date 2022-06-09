public class Hello {
    public static void main(String[] args) {

        String name = "Nikola";
        int age = 30;
        hello(name, age);
        int a = 5;
        int b = 2;
        int c = 7;
        int d = 10;
        double aa = 5.5;
        double bb = 2.2;
        double cc = 7.7;
        double dd = 10.1;
        System.out.println(add(a, b));
        System.out.println(add(a, b, c));
        System.out.println(add(a, b, c, d));

    }

    static void hello(String name, int age) {
        System.out.printf("Hello %s\n", name);
        System.out.printf("You are %d years old\n", age);

    }

    static int add(int a, int b) {
        return  a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static double add(double a, double b) {
        return  a + b;
    }

    static double add(double a, double b, double c){
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }
}