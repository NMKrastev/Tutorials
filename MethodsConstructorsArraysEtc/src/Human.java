public class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {

        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    void eat() {
        System.out.println(this.name + " is eating");
    }

    void drink() {
        System.out.println(this.name + " is drinking");
    }

    void introduction() {
        System.out.printf("Hello, my name is %s. I'm %d years old. My weight is %.2f", this.name, this.age, this.weight);
    }
}
