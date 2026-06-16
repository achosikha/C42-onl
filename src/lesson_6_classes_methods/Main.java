package lesson_6_classes_methods;

import lesson_6_classes_methods.human.Person;

public class Main {
    public static void main(String[] args) {
        // Класс вызова

        // У меня есть БАНКОМАТ
        // Хочу достать деньги, или добавить деньги
        // Хочу чтобы в банкомате у меня был счет, и мои данные
        createPersonCallReturn();
    }

    public static void createPersonCallReturn(){
        Person jack = new Person();
        jack.name = "Jack";
        jack.surname = "Jackson";
        jack.age = 21;
        jack.weight = 69.1;
        jack.profession = "Manager";
        jack.letter = 'J';
        jack.isMarried = false;

        System.out.println(jack.getObjectStringInfo());

        System.out.println(jack.name + " do you sleep? " + jack.doYouSleep(true));
        jack.sleep();
        jack.move();
        jack.run(true, 19);
        System.out.println("19 days passed away. Let's call run() again.");
        jack.run();
        System.out.println("-".repeat(70));
        System.out.println("Do you speak any foreign language?");
        jack.speakForeignLanguages();
        System.out.println("Jack spent one year leaning foreign languages.");
        System.out.println("Jack do you speak any foreign language now?");
        jack.speakForeignLanguages(new String[] {"Georgian", "Russian", "English"});
        System.out.println("Do you study any other foreign language?");
        jack.speakForeignLanguages(new String[]{"Georgian", "Russian", "English"},
                                    new String[]{"Arabic", "Turkish", "Hebrew"});

        System.out.println("-".repeat(70));

        System.out.println("I will pass a few values and an unknown amount of String values...");
        String[] args = jack.getAdditionalInformation(109, 'a', "Gamma", "Delta", "Betta", "BOMB");

        for(String el : args){
            System.out.println(el);
        }
    }

    public static void createSimilarObjects(){
        Person ivan = new Person();
        Person unknown = new Person();

        ivan.name = "Ivan";
        ivan.weight = 89.1;

        unknown.name = "Ivan";
        unknown.weight = 89.1;

        ivan.tellMeWhoYouAre();
        unknown.tellMeWhoYouAre();

        System.out.println("Are these objects equal? " + (ivan == unknown));

        if (ivan.age > unknown.age){
            System.out.println("Ivan is older");
        } else if (ivan.age < unknown.age){
            System.out.println("Unknown is older.");
        } else {
            System.out.println("They are of the same age.");
        }
    }

    public static void createPerson(){
        Person archil = new Person();
        Person ivan = new Person();

        // Addresses
        System.out.println(archil);
        System.out.println(ivan);

        // Get actual data
        archil.tellMeWhoYouAre();
        System.out.println("-".repeat(50));
        ivan.tellMeWhoYouAre();

        archil.name = "Archil";
        archil.surname = "Sikharulidze";
        archil.age = 37;
        archil.weight = 83.1;
        archil.profession = "Java Developer";
        archil.letter = 'S';
        archil.isMarried = true;

        System.out.println("-".repeat(50));
        archil.tellMeWhoYouAre();

        ivan.name = "Ivan";
        ivan.surname = "Yakovlev";
        ivan.age = 25;
        ivan.weight = 67.1;
        ivan.profession = "QA Java";
        ivan.letter = 'I';

        System.out.println("-".repeat(50));
        ivan.tellMeWhoYouAre();

        System.out.println("Objects Archil and Ivan");
        // Объекты, которые имеют собственную реализацию не могут быть РАВНЫ
        // Во-первых, у каждого свои собственные ПОЛЯ
        // В-третьих, у каждого свои собственные методы
        System.out.println(archil == ivan);
    }

    public static void readInitialParameters(String[] args){
        System.out.println("Какие заводские настройки вы мне передали?");
        for(String el : args){
            System.out.println("Настройка: " + el);
        }
    }
}
