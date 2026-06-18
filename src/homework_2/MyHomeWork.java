package homework_2;

public class MyHomeWork {
    static void main() {
        Calculator();
        SumOfDigitsOfTwoDigit();
        SumOfDigitsThree();
        RoundingNumbers();
        DivisionWithRemainder();
        IntegerChanges();
    }

    public static void Calculator() {
        int b = 7;
        int c = 8;
        int a = 4 * (b + c - 1) / 2;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a = " + a);
    }
    public static void SumOfDigitsOfTwoDigit(){
        int n = 26;
        if (n <10 || n > 99) {
            System.out.println();
            return;
        }
        int firstDigit = n /10;
        int secondDigit = n% 10;
        int sum = firstDigit + secondDigit;
        System.out.println("Число:" + n);
        System.out.println("Сумма цифр:" + sum);
    }

    public static void SumOfDigitsThree(){
        int n = 126;
        int firstDigit = n / 100;
        int secondDigit = (n / 10)%  10;
        int thirdDigit = n% 10;
        int sum = firstDigit + secondDigit + thirdDigit;
        System.out.println (" Сумма цифры числа " + n + " равна " + sum);
    }

    public static void RoundingNumbers() {
        double value = 14.777775;
        double result = Math.ceil(value);
        System.out.println((result));

    }

    public static void DivisionWithRemainder(){
        int q = 21;
        int w = 8;
        int quotient = q / w;
        int remainder = q% w;
        System.out.println(q + "/" + w + " = " + quotient + " и " + remainder);
    }

    public static void IntegerChanges() {
        int a = 1;
        int b = 2;
        System.out.println("До обмена: a = " + a +", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("После обмена: a = " + a +", b = " + b);
    }
}