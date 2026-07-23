package lesson_13_regex_except;

public class MyMain {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args){
        // COMMENTS
        makeStringRed();
    }

    public static void makeStringRed(){
        System.out.println(RED + "Welcome to BASIC CALCULATOR." + RESET);
        System.out.println(YELLOW + "-".repeat(50));
        System.out.println("-".repeat(50) + RESET);
        System.out.println(BLUE + "\t\t\t\tinstruction".toUpperCase());
        System.out.println("\t\tJava BASIC CALCULATOR..." + RESET);

        System.out.println(GREEN);

        for(int row = 0; row < getTable().length; row++){
            for(int col = 0; col < getTable()[row].length; col++){
                System.out.printf("\t\t%c\t\t", getTable()[row][col]);
            }
            System.out.println("\n");
        }
    }

    public static char[][] getTable(){
        return new char[][]{
                {'*', '*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*'}
        };
    }
}
