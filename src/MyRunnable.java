public class MyRunnable implements Runnable{

    //Method2 to make a Thread: Implement Runnable interface to new class.
    // Create the class object in main. Pass object to new Thread object

    @Override
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread #2 is finished");

    }

}
