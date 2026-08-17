package lesson_20_threads_chat.chat;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.BlockingQueue;

// Сама графическая реализация чата
public class ChatWindow extends JFrame {
    private TextArea messagesAre;
    private JTextField messagesField;
    private JButton send;

    private String userName;

    // Специальный контейнер, который обрабатывает потоки и позволяет синхронизировать их работу
    // Обезопасить меня от возможных ошибок
    private BlockingQueue<String> myMessages;
    private BlockingQueue<String> externalMessages;

    public ChatWindow(String userName, BlockingQueue<String> myMessages, BlockingQueue<String> externalMessages) {
        this.userName = userName;
        this.myMessages = myMessages;
        this.externalMessages = externalMessages;

        setTitle("Chat - " + userName);
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        messagesAre = new TextArea();
        messagesAre.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(messagesAre);

        messagesField = new JTextField();

        send = new JButton("Send");

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(messagesField, BorderLayout.CENTER);
        bottomPanel.add(send, BorderLayout.EAST);

        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        // Прикрепляем к кнопке действие через метод sendMessage()
        send.addActionListener(e -> sendMessage());

        // Для каждой реализации добавляет ПОТОК
        startMessageThread();

        setVisible(true);
    }

    public void sendMessage(){
        String msg = messagesField.getText();

        if(!msg.isEmpty()){
            messagesAre.append("ME: " + msg + "\n");
        }

        externalMessages.offer(userName.toUpperCase() + ": " + msg);

        // ОШИБКА ВОТ ЗДЕСЬ.... ВАША ЗАДАЧА, РАЗОБРАТЬСЯ С КОДОМ И ИСПРАВИТЬ
        // !!! ЧТО ДОЛЖНО БЫТЬ: в большом окне должно появиться мой ЮзерНеим и плюс мое сообщение !!!
        messagesField.setText("");
    }

    public void startMessageThread(){
        Thread messageThread = new Thread(() -> {
            while(true){
                try{
                    String msg = myMessages.take();

                    // !!! Swing компонент SwingUtilities.invokerLater()
                    SwingUtilities.invokeLater(() -> messagesAre.append(msg + "\n"));
                } catch (InterruptedException e) {
                    System.out.println("Поток прерван!");
                    return;
                }
            }
        });
        messageThread.start();
    }
}
