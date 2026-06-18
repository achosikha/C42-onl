package homework_4;

import java.util.Scanner;

public class StudentHomework {
    public static void main() {
        CreatingTwoArray();
        CreationChess();
    }
    public static void CreatingTwoArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvwdite kol-vo strok: ");
        int rows = scanner.nextInt();
        System.out.println("Vvedite kol-vo stolbcov: ");
        int cols = scanner.nextInt();

        int [][] array = new int[rows][cols];
        System.out.println("Ishodnii massive: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Vvedite chislo dobavlenija: ");
        int x = scanner.nextInt();
        int sum = 0;
        System.out.println("Novii massive: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] +=x;
                sum += array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Summa vseh elementov: " + sum);
        System.out.println("----------------------");
    }

    public static void CreationChess(){
        System.out.println("2.");
        String[][] board = new String[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if ((i + j) % 2 == 0) {
                    board[i][j] = "W";
                } else {
                    board[i][j] = "B";
                }

                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
