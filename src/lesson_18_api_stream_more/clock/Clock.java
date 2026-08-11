package lesson_18_api_stream_more.clock;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// JavaFX
// Swing
public class Clock extends JFrame{
    JLabel timeLabel; // Блок куда дам время в текстовом виде - 09:08:11 + Дату
    JLabel dateLabel; // Блок куда дам дату в текстовом
    SimpleDateFormat timeFormatter; // Этот класс отвечает на определенный формат вывода времени
    SimpleDateFormat dateFormat; // Этот класс отвечает на определенный формат вывода даты

    // Например: 21:11:01 && 09:11:01
    // Например дата: Tue 8 11 2026 && 11.08.2026 Tue

    String time;
    String date;

    // extends JFrame -> получить доступ к визуальным элементам, в нашем случае возможность создавать ОКНА/Рамки
    // Это позволяет нам напрямую обращаться через this. - к его элементам
    public Clock(){
        // BLOCK 1: Нарисовать окно и все нужные вещи
        // Название окна
        this.setTitle("TeachMeSkills Clock");

        // Когда создается окно у него автоматические параметры вывода на ваш экран X & Y координаты
        // В нашем случае дефолтное это 0, 0 - т.е. верхний угол

        // Когда создастся экземпляр класса мы нарисуем графику
        this.setSize(450, 300); // Задать размеры окна, ширина и высота

        // Запретить изменение размера моего окна
        this.setResizable(false);

        // Механизм закрытия главного ПОТОКА
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Задать Layout
        this.setLayout(new FlowLayout());

        // Без этого элемента ни одно окно не появится, поскольку в дефолтном состоянии
        // все графические окна указаны как НЕВИДИМЫЕ, надо указать true, чтобы окно появилось
        // Process finished with exit code 0 - успешное завершение нашей программы
        // Все, что не является 0 здесь - это окончание с ошибкой !!! Это не успешное завершение программы,
        // а завершение из-за фатальной ошибки
        // Выключая рисунок, вы не прерываете сам процесс
        // В моей ИДЕШКЕ ИДЕТ ПРОЦЕСС (УРОВЕНЬ ПРОГРАММА), но внутри самой программы (процесса) есть ТОЛЬКО ПОТОКИ
        // Это микро процессы внутри программы. Когда я запускаю здесь графический интерфейс включается основной поток
        // Если НАДО ЗАХЛОПНУТЬ ВМЕСТЕ С ГРАФИЧЕСКИМ ИНТЕРФЕЙСОМ - СВЯЗАТЬ ДВЕ ЭТИ ВЕЩИ !!!
        this.setVisible(true);

        // Block 2 - Задать формат вывода времени и даты
        // hh:mm:ss - дай мне пока часы, потом минуты, потом секунды
        // a - 09:10:11 AM/PM, 21:10:11
        timeFormatter = new SimpleDateFormat("hh:mm:ss a");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 50));
        timeLabel.setForeground(new Color(0x0001FF));
        timeLabel.setBackground(Color.GREEN);
        timeLabel.setOpaque(true); // Показать рамку моего блока

        // Day Pattern Symbols, E - short day MON, TUE
        dateFormat = new SimpleDateFormat("EEEE");
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
        dateLabel.setBackground(Color.CYAN);
        dateLabel.setOpaque(true);

        // Когда мы создаем дополнительные элементы, мы их должны определить, описать, но самое главное
        // ДОБАВИТЬ НА ГЛАВНУЮ РАМКУ через метод add()
        this.add(timeLabel);
        this.add(dateLabel);

        setMyTime(); // Этот метод будет обрабатывать наше время и давать нам каждую секунду обновленные данные
    }

    private void setMyTime(){
        // Самый простой вариант имитирования работы часов - это потоки, мы можем просто брать каждую секунда НОВОЕ
        // время из нашей операционной системы

        // Числа от 1 до 10 с разницей в одну секунду
        // Для этого мне нужно использовать главный поток Thread и заставить его приостанавливать работу на одну секунду
        // Как только загружается программа в Идешку уже существует главный поток, через класс Thread я к нему обращаюсь

        // У меня бесконечный цикл работы программы, где данные могут меняться до того момента, пока я не выключу программу
        while(true){
            // Через формат достает или время или дату
            time = timeFormatter.format(Calendar.getInstance().getTime()); // Даем время в нужном формате
            timeLabel.setText(time); // Задает блоку время это ВРЕМЯ

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000); // 1000 milliseconds == 1 second
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}