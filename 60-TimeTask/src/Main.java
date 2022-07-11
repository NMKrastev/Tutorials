import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        //Timer - A facility for threads to schedule tasks
        //for future execution in a background thread

        //TimerTask - A task that can be scheduled for one-time
        //or repeated execution by a Timer

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int count = 10;
            @Override
            public void run() {
                if (count > 0) {
                    System.out.println(count + " seconds");
                    count--;
                } else {
                    System.out.println("Happy New Year!");
                    timer.cancel();
                }
            }
        };

        //timer.schedule(timerTask, 3000);
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2022);
        date.set(Calendar.MONTH, Calendar.JULY);
        date.set(Calendar.DAY_OF_MONTH, 11);
        date.set(Calendar.HOUR, 10);
        date.set(Calendar.MINUTE, 5);
        date.set(Calendar.SECOND, 50);
        date.set(Calendar.MILLISECOND, 0);

        //timer.schedule(timerTask, date.getTime());
        //timer.scheduleAtFixedRate(timerTask, 0, 1000);
        timer.scheduleAtFixedRate(timerTask, date.getTime(), 1000);

    }
}
