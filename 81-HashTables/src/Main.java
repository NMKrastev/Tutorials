import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

        //Hashtable - A data structure that stores unique keys to values ex.<Integer, String>.
        //Each key/value pair is known as an Entry.
        //FAST insertion, look up, deletion of key/value pairs.
        //Not ideal for small data sets, great with large data sets.

        //hashing - Takes a key and computes an integer (formula will vary based on key & data type).
        //In a Hashtable, we use the hash % capacity to calculate an index number.

        //key.hashCode() % capacity = index

        //bucket - an indexed storage location for one or more Entries
        //	       can store multiple Entries in case of a collision (linked similarly a LinkedList).

        //collision - hash function generates the same index for more than one key
        //			  less collisions = more efficiency.

        //Runtime complexity: Best Case O(1)
        //Worst Case O(n)

        /*Hashtable<Integer, String> table = new Hashtable<>();

        //add student ID and name to the table using Integer and String
        table.put(100, "Peter");
        table.put(123, "John");
        table.put(321, "Andy");
        table.put(555, "Niki");
        table.put(777, "Mario");*/

        Hashtable<String , String> table = new Hashtable<>();

        //add student ID and name to the table using Integer and String
        table.put("100", "Peter");
        table.put("123", "John");
        table.put("321", "Andy");
        table.put("555", "Niki");
        table.put("777", "Mario");

        //remove entry from the table
        //table.remove(321);

        //access on the values
        //System.out.println(table.get(100));
        
        //access all values in the table
        /*for (Integer key : table.keySet()) {
            //get the hasCode - key.hashCode() - it is the same number as the ID
            //if we use modulus % by the size ot the table
            //we'll get the index on where the element is located.
            System.out.println(key + " " + table.get(key));
        }*/

        for (String key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + " " + key + " " + table.get(key));
        }

    }
}
