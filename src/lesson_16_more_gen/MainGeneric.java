package lesson_16_more_gen;

public class MainGeneric {
    public static void main(String[] args){
        MyGenerics<String> name = new MyGenerics<>("Archil Sikharulidze");
        System.out.println(name.getT());

        MyGenerics<Double> myDoubleDigit = new MyGenerics<>(145.1222);
        System.out.println(myDoubleDigit.getT());

        MyGenerics<Character> letter = new MyGenerics<>('A');
        System.out.println(letter);

        System.out.println("-".repeat(50));
        imitateMap();

        // GenericMAP создайте не просто обобщенные переменные
        // А обобщенные массивы !!!
    }

    public static void imitateMap(){
        GenericMap<Integer, String> genericMap = new GenericMap<>(1, "House");
        System.out.println(genericMap);
    }
}
