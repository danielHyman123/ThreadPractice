public class Main {

    public static void main(String[] args){

        //Thread 1 counts from 10 to 0 using method 1 in MyThread class
        MyThread thread1 = new MyThread();    //Will execute run() in MyThread

        //Thread 2 counts from 0 to 10 using method 2 in MyRunnable class
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);


        //Now that both threads are made, I can execute them
        thread1.start();
        thread2.start();

    }
}
