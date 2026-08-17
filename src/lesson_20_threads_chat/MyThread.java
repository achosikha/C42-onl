package lesson_20_threads_chat;

// Мой класс с наследованием класса Thread
public class MyThread extends Thread{
    private final String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for(int index = 1; index <= 10; index++){
            System.out.println(this.threadName + " поток: " + index);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
