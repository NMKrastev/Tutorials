import java.util.*;
public class Main {
    public static void main(String[] args) {

        //2D ArrayList - a dynamic list of lists
        //You can change the size of these lists during runtime
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("flour");
        bakeryList.add("butter");
        bakeryList.add("eggs");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("cucumbers");
        produceList.add("zucchini");

        ArrayList<String> drinkList = new ArrayList();
        drinkList.add("coca-cola");
        drinkList.add("coffee");

        //Adds all the Lists to one Lists
        //Note: It's more organized
        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        //System.out.println(bakeryList.get(0));
        //System.out.println(drinkList);
        System.out.println(groceryList);
        //Get one List from the 2D ArrayList
        System.out.println(groceryList.get(0));
        //Get certain element/value from one List inside 2D ArrayList
        System.out.println(groceryList.get(2).get(0));
    }
}
