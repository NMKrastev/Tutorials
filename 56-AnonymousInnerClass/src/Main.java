public class Main {
    public static void main(String[] args) {

        /*anonymous class - an inner class without a name.
         Only a single object is created from one.
         The object may have “extras” or "changes"
         and no need to create a separate innerclass
         when it only needs it once.
         Helps us to avoid cluttering code with a class name.

         Syntax is similar to a constructor,
         except that there is also a class definition
         within a block of code.
         GREAT FOR LISTENERS
         */

       /* Greeting greeting = new Greeting() {

            @Override
            public void Welcome() {
                System.out.println("Hello, this is inner class!");
            }

        };
        Greeting greeting2 = new Greeting();

        greeting.Welcome();
        greeting2.Welcome();*/

        new Frame();

    }
}
