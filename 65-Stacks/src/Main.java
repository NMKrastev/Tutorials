import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //stack = LIFO data structure. Last-In First-Out (LIFO).
        //Store objects into a sort of "vertical tower".
        //push() to add objects to the top.
        //pop() to remove objects from the top.

        //uses of stacks?
        //1. undo/redo features in text editors
        //2. moving back/forward through browser history
        //3. backtracking algorithms (maze, file directories)
        //4. calling functions (call stack)

        Stack<String> stack = new Stack<String>();

        //System.out.println(stack.empty());

        stack.push("Angry Men (1957)");
        stack.push("The Godfather: Part II (1974)");
        stack.push("The Dark Knight (2008)");
        stack.push("The Godfather (1972)");
        stack.push("The Shawshank Redemption (1994)");

        //stack.pop();

        //The top element of the stack can be assigned to a variable
        //String movie = stack.pop();

        //System.out.println(stack);
        //System.out.println(movie);

        //stack.peek() show the top element of the stack
        //System.out.println(stack.peek());
        //System.out.println(stack);

        //search the stack for a specific element
        //returns an integer; top element is 1 and so on;
        //for an element that's not in the stack it returns -1
        System.out.println(stack.search("The Shawshank Redemption (1994)"));

    }
}
