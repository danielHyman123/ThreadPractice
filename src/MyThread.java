public class MyThread extends Thread {

    //Method1 to make a Thread: Create Thread subclass and make Obj of subclass in main

    @Override   //Not neccassary line
    public void run(){

        for(int i = 10; i>0; i--){
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread #1 is finished");

    }


}
