package lesson_6_classes_methods.human;

public class Person {
    // Объект - это ШАБЛОН тех свойств (качеств) и возможностей (действий), которые может быть У БОЛЬШИНСТВА ЛЮДЕЙ
    // Когда вы создаете ШАБЛОН ЧЕЛОВЕК/ЖИВОТНОГО - вы в него вставляете ПОКА ВСЕ ОБЩЕЕ

    // Свойства/качества объекта, которые прописываются на уровне КЛАССА
    // Переменные уровня класса называются - ПОЛЯМИ КЛАССА (или ед. поле класса) - ГЛОБАЛЬНАЯ ПЕРЕМЕННАЯ УРОВНЯ КЛАСС
    public String name;
    public String surname;
    public int age;
    public double weight;
    public String profession;
    public char letter;
    public boolean isMarried;

    // Здесь, я не уверен какое количество однотипных данных я могу получить
    // Возможно н-число ИНТ или СТРОЧЕК - vararg
    public String[] getAdditionalInformation(int xCoordinate, char letter, String... args){
        // String... args == String[] args
        return args;
    }

    // Способности - бегать, прыгать, говорить, орать, кушать
    public void move(){
        System.out.println("Where to GO?");
    }

    // Перегрузка метода - method overload
    public void run(){
        System.out.println("I am not injured. I can easily run. Would you like me to start?");
    }

    public void run(boolean isInjured, int daysForRecover){
        if (isInjured){
            System.out.println("Yes, I am injured.");
            System.out.println("How many days I need to recover? " + daysForRecover);
        }
    }

    public void speakForeignLanguages(){
        System.out.println("I don't speak any foreign language!");
    }

    public void speakForeignLanguages(String[] foreignLanguages){
        System.out.println("I can speak the following languages: ");

        for(String language : foreignLanguages){
            System.out.println("\t" + language);
        }
    }

    public void speakForeignLanguages(String[] foreignLanguages, String[] studyingForeignLanguages){
        System.out.println("I can speak the following languages: ");

        for(String language : foreignLanguages){
            System.out.println("\t" + language);
        }

        System.out.println("\nAnd also, I am currently learning the following new foreign languages: ");

        for(String language : studyingForeignLanguages){
            System.out.println("\t" + language);
        }
    }

    // run()
    // run(), run(int)
    // run(), run(int x) & run(double y) - ERROR
    // run(int, double, char) - run(char, double, int)

    public void sleep(){
        System.out.println("I am sleeping.");
    }

    public boolean doYouSleep(boolean answer){
        return answer;
    }

    // Получить данные об объекте - Человек
    public void tellMeWhoYouAre(){
        System.out.println("My name is: " + name);
        System.out.println("My surname is: " + surname);
        System.out.println("My age is: " + age);
        System.out.println("My weight is: " + weight);
        System.out.println("My profession is: " + profession);
        System.out.println("What is your letter: " + letter);
        System.out.println("Are you married? " + isMarried);
    }

    // Return STRING from METHOD
    public String getObjectStringInfo(){
        return "Person:\n" +
                "\tName: " + name +
                "\n\tSurname: " + surname +
                "\n\tAge: " + age +
                "\n\tWeight: " + weight +
                "\n\tProfession: " + profession +
                "\n\tLetter: " + letter +
                "\n\tAre you married? " + isMarried;
    }
}