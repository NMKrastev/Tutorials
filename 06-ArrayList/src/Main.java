import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //ArrayList - a resizable array.
        //Elements can be added and removed after compilation phase
        //Stores reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("Chicken breasts");
        food.add("Olives");
        food.add("Potatoes");

        //Sets value to a certain index. It replaces Chicken breasts
        food.set(0, "Pork");
        //Removes value from certain index
        food.remove(2);
        //Clears ArrayList
        food.clear();


        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
