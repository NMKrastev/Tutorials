public class Cat extends Animal {

    //@Override - good practice letting other users know that this is an overriding method
    @Override
    void speak() {
        System.out.println("The cat meows");
    }

}
