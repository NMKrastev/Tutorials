public class Friend {

    String name;
    //static variable that all instances of the Class will share
    static int numberOfFriends;
    Friend(String name) {
        this.name = name;
        //Increments the number of friends each time a new friend is added
        numberOfFriends++;
    }

    //Created method to display the number of friends
    static void displayFriends() {
        System.out.println("You have "+numberOfFriends+" friends");
    }

}
