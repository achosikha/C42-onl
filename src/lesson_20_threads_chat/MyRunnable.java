package lesson_20_threads_chat;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int index = 0; index <= 10; index++){
            System.out.println(Thread.currentThread().getName() + " -> " + index);
        }
    }
}