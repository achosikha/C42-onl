package lesson_13_regex_except;

public class MyMoreStrings {
    public static void main() {
        System.out.println(checkStringRules());
    }

    public static void getMoreString(){
        // printf()
        // Как конкатенируется строка

        // Добро пожаловать ___________. Подскажите пожалуйста сколько вам лет? ______. Также, нужны данные по
        // весу: _____, росту ______, Должности: ______, вы женатый? ______
        String fullName = "Archil Sikharulidze";
         int age = 37;
         double weight = 81.12;
         double height = 171.1423;
         boolean isMarried = true;

         /*
        System.out.println("Добро пожаловать " + fullName + ". Подскажите пожалуйста сколько вам лет? " + age + ".");
        System.out.println("Укажите ваш вес: " + weight + ". И рост пожалуйста: " + height + ". Вы женаты? + " + isMarried);
          */

        String fullMsg = String.format("Добро пожаловать %s. Подскажите пожалуйста сколько вам лет? %d. " +
                                        "Укажите ваш вес: %.2f. И рост пожалуйста: %.2f. Вы женаты? %b.",
                                        fullName, age, weight, height, isMarried);

        System.out.printf("Добро пожаловать %s. Подскажите пожалуйста сколько вам лет? %d. " +
                        "Укажите ваш вес: %.2f. И рост пожалуйста: %.2f. Вы женаты? %b.",
                        fullName, age, weight, height, isMarried);

        System.out.println("\n");
        // STRING BLOCK
        String blockMSG = """
                Добро пожаловать в СТРОКОВОЙ БЛОК, КОТОРЫЙ БЫЛ НЕДАВНО ДОБАВЛЕН В ЯЗЫК ПРОГРАММИРОВАНИЯ ДЖАВА.
                ЕГО СМЫСЛ ЗАКЛЮЧАЕТСЯ В СОЗДАНИИ ОДНОГО ОБЩЕГО БЛОКА, КОТОРЫЙ НЕ НУЖДАЕТСЯ В ДОПОЛНИТЕЛЬНЫХ
                СПЕЦИФИКАТОРАХ И ПОЗВОЛЯЕТ ФОРМИРОВАТЬ ПОЛНОЦЕННУЮ СТРОКУ С УЧЕТОМ И ПЕРЕХОДА НА СЛЕДУЮЩУЮ
                СТРОКУ!!!
                
                
                |||| ------------------------------------------------------ ||||||||||||||||||||||||||||
                
                
                
                NEX PAGE
                ________________________________-----------------------------------______________________________
                
                
                
                
                
                
                """;

        System.out.println(blockMSG);
    }

    public static String checkStringRules(){
        // 2
        // "2" + "Welcome" = "2Welcome"
        // "2Welcome12"
        System.out.println(1 + 1 + "Welcome" + 1 + 2); // 2Welcome12
        System.out.println(1 + 2 * 2 + "Welcome" + (1 + 2)); // 4+1 = 5Welcome3

        return 2.45 + 1 + 1 + 'c' + ""; // "" - триггерит превращение всего в СТРОКУ
    }
}