package homework_9.Figures;

public class Circle extends Figure {
    public final double P = 3.14;
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return P * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * P * radius;
    }
}
