public class Main {
    public static void main(String[] args) {

        //static - modifier. A single copy of a variable/method is created and shared
        //The class "owns" the static member

        Friend Bob = new Friend("Bob");
        Friend John = new Friend("John");
        Friend Andrew = new Friend("Andrew");
        Friend Thomas = new Friend("Thomas");


        //Access the static int from the Friend class
        System.out.println(Friend.numberOfFriends);

        //Call displayFriends method
        Friend.displayFriends();
    }
}
