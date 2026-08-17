package lesson_20_threads_chat;

public class MainThreads {
    public static void main(String[] args){
        // Threads - потоки

        // На уровне компьютера у нас есть ПРОЦЕССЫ
        // Процессы ответственны за одновременный запуск разных программ
        // Многопроцессорность - возможно запускать и работать с несколькими программами на операционной системе
        // одновременно

        // Что если, у меня внутри процесса есть еще определенные процессы? Внутренние процессы?
            // Мне нужно, чтобы одновременной с вычислением формулы Х, произошло вычисление формулы Y?
            // Как происходи так, что два и более людей могут пользоваться одним графическим интерфейсом и одновременно
            // обмениваться сообщениями?
        // Внутри процесса (программа) - есть свои другие внутренние процессы, которые одновременно выполняются, вот
        // эти внутренние процессы называются ПОТОКАМИ
        // Когда вы создаете программу у вас есть ГЛАВНЫЙ ПОТОК - Thread, он курирует работу абсолютно всей программы.
        // Если у вас закрывается ГЛАВНЫЙ ПОТОК, то заканчивается и программа, т.е. процесс.
        useDaemonThread();
    }

    public static void useMainThread(){
        // Главный поток создается автоматически, при запуске программы, т.е. процесса
        System.out.println(Thread.currentThread());

        // Обращение к главному потоку идет напрямую через класс Thread - этот класс можно унаследовать, чтобы писать
        // собственные классы с функционалом потока
        // У него важный интерфейс Runnable, который позволяет запускать поток
        // Т.е. у нас класс Thread с функционалом, его можно наследоваться, чтобы формировать собственные классы с
        // потоками. Но этот класс сам внедряет функциональный интерфейс Runnable, который, по сути, просто дает
        // возможность запустить метод run() - это метод отличается тем, что он начинается процесс работы потока

        // Name
        System.out.println(Thread.currentThread().getName());
        // Важность выполнения того или иного потока в первую очередь
        System.out.println(Thread.currentThread().getPriority());
        // Состояние потока
        System.out.println(Thread.currentThread().getState());

        // set
        Thread.currentThread().setName("My Main Thread!!!");
        Thread.currentThread().setPriority(3);

        System.out.println(Thread.currentThread());

        // Заставим потока заснуть на 2 секунды, а поток чтобы-нибудь вывести
        try{
            for(int index = 1; index < 10; index++)
            {
                System.out.println(index + " after 2000 milliseconds == 2 seconds.");
                Thread.sleep(2000); // 2000 millisecond / 1000 = 2 seconds
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createNewThreads(){
        // Anonymous class/interface implementation
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setPriority(2);
                try{
                    for(int index = 1; index <= 10; index++) {
                        System.out.println("t1 with priority -> " + Thread.currentThread().getPriority() + ": " + index);
                        Thread.currentThread().sleep(1500);
                    }
                } catch (RuntimeException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        // Вместо анонимной реализации интерфейса или класса используем лямбду выражение
        // new Thread(....)
            // new Thread((параметры для Runnable))
                // new Thread(() -> { Тело должно иметь кавычка если оно состоит больше одной строки })
        Thread t2 = new Thread(() -> {
            // Стрелочная функция
            Thread.currentThread().setPriority(1);
            try{
                for(int index = 1; index <= 10; index++) {
                    System.out.println("t2 with priority -> " + Thread.currentThread().getPriority() + ": " + index);
                    Thread.currentThread().sleep(1500);
                }
            } catch (RuntimeException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t3 = new Thread(() -> {
            Thread.currentThread().setPriority(5);
            try{
                for(int index = 1; index <= 10; index++) {
                    System.out.println("t3 with priority -> " + Thread.currentThread().getPriority() + ": " + index);
                    Thread.currentThread().sleep(1500);
                }
            } catch (RuntimeException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        // Thread - MAIN
            // t1
            // t2
            // t3
        t1.start();
        t2.start();
        t3.start();

        // Потоки занимаются обоюдным обгоном, каждый старается максимально первым занять РЕСУРС - МОНИТОР
        // И выполниться раньше другого потока - конкуренция потоков. Потоки не выполняются автоматически поочередно
        // Все зависит от программы и того как ляжут карты

        // Следовательно, главная проблема ПОТОКОВ заключается в том, чтобы контролировать какой поток когда начинает,
        // когда заканчивается, и гарантировать, что они не будут друг другу мешать.

        // Когда потоки друг другу мешают, может произойти блокировка монитора/ресурса.

        // РЕСУРС (МОНИТОР) - в него для работы заходит поток и берет над ним управление
        // пока поток внутри, монитор не может быть занят другими потоками
        // следовательно, другие потоки ждут освобождения монитора/ресурса.

        // Если ваш ресурс будет захвачен потоком, нет условия его освобождения - то другие потоки просто окажутся
        // в процесса ожидания, у вас будет бесконечная блокировка ресурса - deadlock

        // Система контроля, которые обеспечивает логическую работу потоков, с учетом очередности, чтобы не было
        // конкуренции между потоками, и блокировки ресурса - называется синхронизация, keyword synchronized
        // Это специальный механизм, который подсказывает как нужно работать в сущесвтующей логике

        // setPriority() - задать приоритет - это просто пожелание, на самом деле, никакого приоритета не будет
    }

    public static void moreBasicThreadExamples(){
        // Just Thread
        MyThread t1 = new MyThread("Поток 1");
        MyThread t2 = new MyThread("Поток 2");
        MyThread t3 = new MyThread("Поток 3");

        t1.start();
        // проверяет жив ли еще поток ?
        System.out.println(t1.isAlive());
        t2.start();
        System.out.println(t2.isAlive());
        t3.start();
        System.out.println(t3.isAlive());

        System.out.println("After my threads...");
        System.out.println("Is my thread t1 alive? " + t1.isAlive());
        System.out.println("Is my thread t2 alive? " + t2.isAlive());
        System.out.println("Is my thread t3 alive? " + t3.isAlive());
    }

    // Use Runnable
    public static void useRunnable(){
        Runnable task = () -> {
            for(int index = 0; index <= 10; index++){
                System.out.println(Thread.currentThread().getName() + " -> " + index);
            }
        };

        Runnable taskLetters = () -> {
            for(int index = 0, letter = 65; index <= 10; index++, letter++){
                System.out.println(Thread.currentThread().getName() + " -> " + (char)letter);
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(taskLetters, "Thread 2");

        try{
            t1.start();
            t2.start();
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    // Use method join() - wait until a thread is over
    public static void useMethodJoin(){
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " начал работать...");

            for (int index = 1; index <= 10; index++){
                System.out.println("Done: " + index);

                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Поток остановлен!");
                }
            }
            System.out.println("Наша работа закончена!");
        });

        t1.start();
        System.out.println("Поток t1 жив? " + t1.isAlive());
        try {
            // join() заставляет поток полностью выполниться, и лишь поток перейти к другим вещам
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Поток t1 жив? " + t1.isAlive());
        System.out.println("T1 поток завершился.");
    }

    // use join() with multiple threads
    public static void useJoinMultipleThreads(){
        MyThread t1 = new MyThread("Поток 1");
        MyThread t2 = new MyThread("Поток 2");
        MyThread t3 = new MyThread("Поток 3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // stop() deprecated вышел из употребления, но остался для обратной совместимости
        // Раньше им останавливали потоки, сейчас используют join(), wait()
        // t2.stop();
    }

    // Потоки-демоны и виртуальные потоки
    // Если что, мой совет для просто понимания прочитать ВИРТУАЛЬНЫЕ ПОТОКИ - Virtual Threads
    // Daemon thread
    public static void useDaemonThread(){
        // Обычный поток не может быть прерван, пока он не завершится
        // JVM обязан дождаться выполнения всех обычных потоков
        // После этого завершится ваша программа
        Thread regularThread = new Thread(() -> {
            for (int index = 1; index <= 15; index++){
                System.out.println("Regular Thread: " + index);
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Your regular Thread has been stopped.");
                    return;
                }
            }
            System.out.println("Your regular Thread has successfully ended.");
        });

        // Прежде, чем создать Демон-поток, надо его сделать из обычного потока
        // Нельзя автоматически создать Демон-поток
        Thread daemonThread = new Thread(() -> {
            int counter = 1;

            while(true){
                System.out.println("Daemon-thread: " + counter);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Your Daemon-thread has been intercepted.");
                    return;
                }
                counter++;
            }
        });

        // Превратим наш поток daemonThread в поток-демон
        // Задать ему статус демона нужна до начала до использования метода start()
        // Потом уже невозможно
        daemonThread.setDaemon(true);

        System.out.println("Is regularThread is daemon thread? " + regularThread.isDaemon());
        System.out.println("Is daemonThread is daemon thread? " + daemonThread.isDaemon());

        // Start
        regularThread.start();
        daemonThread.start();

        System.out.println("Main поток работает отдельно, как главный...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main закончил свою работу...");

        // Демон поток работает в фоновом режиме, выполняет какие-то задачи, но не является
        // ключевым для работы программы - т.е. не по его состоянию учитывается нужно закрыть процесс или нет
        // а по обычным потокам. Их выполнение - обязательно, виртуальная машина не может завершиться без выполнения
        // условия завершения всех ОБЫЧНЫХ ПОТОКОВ
        // Если все обычные потоки завершены, но демоны-потоки продолжают работать, этн не преграда, программа
        // может спокойно завершиться.
    }

    // !!! Самостоятельно обследовать и написать часть кода с ключевым словом synchronized !!!
}
