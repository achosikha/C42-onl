package lesson_10_obj_more_interfaces;

import java.util.Random;

public class ClassObject {
    private final String className;
    private final String classDestination;

    public ClassObject(String className, String classDestination) {
        this.className = className;
        this.classDestination = classDestination;
    }

    @Override
    public int hashCode() {
        return new Random().nextInt(-2_134_233_000, 0);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
