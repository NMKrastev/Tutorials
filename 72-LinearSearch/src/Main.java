public class Main {
    public static void main(String[] args) {

        // linear search = Iterate through a collection one element at a time

        /* Runtime complexity: 0(n)
        *
        * Disadvantages:
        * 1. Slow for large data sets
        *
        * Advantages:
        * 1. Fast for searches of small to medium data sets
        * 2. Does not need to be sorted
        * 3. Useful for data structures that don't have random access(Linked list)*/

        int[] array = {5,7,8,4,2,3,9,1,6};
        int index = linearSearch(array, 10);

        if(index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found!");
        }
    }

    private static int linearSearch(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
