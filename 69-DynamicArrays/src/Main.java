import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*Advantages:
        * 1. Random access of elements 0(1)
        * 2. Good locality of reference and data cache utilization
        * 3. Easy to insert/delete at the end*/

        /*Disadvantages:
        * 1. Wastes more memory
        * 2. Shifting elements is time-consuming 0(n)
        * 3. Expanding/Shrinking the array is time-consuming 0(n)*/

        //ArrayList<String> arrayList = new ArrayList<String>();
        DynamicArray dynamicArray = new DynamicArray(5);
        //System.out.println(dynamicArray.capacity);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

        //dynamicArray.insert(0, "N");
        //dynamicArray.delete("A");

        //System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println(dynamicArray.isEmpty());
    }
}
