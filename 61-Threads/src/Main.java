public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*thread - 	A thread of execution in a program (kind of like a virtual CPU)
    				The JVM allows an application to have multiple threads running concurrently
    				Each thread can execute parts of you code in parallel with the main thread
    				Each thread has a priority.
    				Threads with higher priority are executed in preference compared to threads with a lower priority

    			    The Java Virtual Machine continues to execute threads until either of the following occurs
    					1. The exit method of class Runtime has been called
    					2. All user threads have died

    				When a JVM starts up, there is a thread which calls the main method
    				This thread is called “main”

    				Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection
				    JVM terminates itself when all user threads (non-daemon threads) finish their execution
    	 */

        //System.out.println(Thread.activeCount());
        //Thread.currentThread().setName("Main");
        //System.out.println(Thread.currentThread().getName());

        //Thread.currentThread().setPriority(10);
        //System.out.println(Thread.currentThread().getPriority());

        //System.out.println(Thread.currentThread().isAlive());

        /*for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Done!");*/

        MyThread threadTwo = new MyThread();
        //threadTwo.start();
        //threadTwo.run(); - status is false
        //System.out.println(threadTwo.isAlive());
        //threadTwo.setName("Thread Two");
        //System.out.println(threadTwo.getName());
        //it will inherit the priority of the thread that created it
        //System.out.println(threadTwo.getPriority());

        //threadTwo.setPriority(1);

        //System.out.println(Thread.activeCount());
        threadTwo.setDaemon(true);
        System.out.println(threadTwo.isDaemon());
        threadTwo.start();

    }
}
