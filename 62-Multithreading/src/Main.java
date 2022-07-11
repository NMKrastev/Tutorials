public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Multithreading - Process of executing multiple threads simultaneously
        //Helps maximum utilization of CPU
        //Threads are independent, they don't affect the execution of other threads
        //An exception in one thread will not interrupt other threads
        //usefull for serving multiple clients, multiplayer games, or other mutually independent tasks

        MyThread thread1 = new MyThread();
        MyRunnable runnable1 = new MyRunnable();

        Thread thread2 = new Thread(runnable1);

        //thread1.setDaemon(true);
        //thread2.setDaemon(true);

        thread1.start();
        //waits for thread1 to finish before starting thread2
        //thread1.join(3000);
        thread2.start();
    }
}
