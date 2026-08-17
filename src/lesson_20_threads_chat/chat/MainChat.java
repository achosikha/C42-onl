package lesson_20_threads_chat.chat;

import javax.swing.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class MainChat {
    public static void main(String[] args){
        // ПОСМОТРЕТЬ ЧТО ЭТО
        BlockingQueue<String> user1 = new LinkedBlockingDeque<>();
        BlockingQueue<String> user2 = new LinkedBlockingDeque<>();

        // Создает мне сразу же два окна рабочих
        SwingUtilities.invokeLater(() -> {
            new ChatWindow("Archil", user1, user2);
            new ChatWindow("External", user2, user1);
        });
    }
}
