import java.util.Random;

public class DiceRoller {
    //Visible throughout the whole class
    Random random;
    int number;
    DiceRoller() {
        //Visible only in this method
        //Random random = new Random();
        //int number = 0;
        random = new Random();
        roll(random, number);
    }

    void roll(Random random, int number) {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
