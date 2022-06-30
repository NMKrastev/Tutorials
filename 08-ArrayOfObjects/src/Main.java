public class Main {
    public static void main(String[] args) {

        //Standard arrays with size
        int[] numbers = new int[5];
        char[] characters = new char[5];
        String[] strings = new String[5];

        //Array of objects with size
        //Food[] refrigerator = new Food[3];

        Food foodOne = new Food("Meat");
        Food foodTwo = new Food("Coca-Cola");
        Food foodThree = new Food("Ketchup");
        //Another way to store values in array of objects
        Food[] refrigerator = {foodOne, foodTwo, foodThree};

        //refrigerator[0] = foodOne;
        //refrigerator[1] = foodTwo;
        //refrigerator[2] = foodThree;

        //Display one of the elements of the array of objects
        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }
}
