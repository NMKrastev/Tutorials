public class Hero extends Person {

    String power;

    //Passing arguments from Hero object that is in Main class
    //Passing all the arguments here
    Hero(String name, int age, String power) {
        //Using super to call the superclass Person that contains
        //the variables name and age
        super(name, age);
        this.power = power;
    }

    //Calls the toString method in Person super class and
    // return it but this time with + this.power to concatenate with it
    public String toString() {
        return super.toString() + this.power;
    }

}
