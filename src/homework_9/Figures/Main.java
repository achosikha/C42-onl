package homework_9.Figures;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Circle(5);
        figures[1] = new Rectangle(2, 3);
        figures[2] = new Triangle(2, 3, 4);
        figures[3] = new Circle(6);
        figures[4] = new Rectangle(3, 4);

        System.out.println("Информация о фигурах:");
        System.out.println("==============================================");

        double totalPerimeter = 0;

        for (Figure figure : figures) {
            System.out.println(figure.getClass().getSimpleName() +
                    ": Площадь = " + figure.getArea() +
                    ", Периметр = " + figure.getPerimeter());
            totalPerimeter += figure.getPerimeter();
        }

        System.out.println("==============================================");
        System.out.printf("Сумма периметров всех фигур: %.2f\n", totalPerimeter);
    }
}

