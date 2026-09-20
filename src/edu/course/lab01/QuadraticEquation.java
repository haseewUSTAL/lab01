package edu.course.lab01;

public final class QuadraticEquation {
    private QuadraticEquation() {
    }

    public static void solve(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Уравнение имеет бесконечно много решений.");
                } else {
                    System.out.println("Уравнение не имеет решений.");
                }
            } else {
                double x = -c / b;
                System.out.println("Уравнение линейное. Корень x = " + x);
            }
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Два корня: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Один корень: x = " + x);
        } else {
            System.out.println("Вещественных корней нет (дискриминант D < 0).");
        }
    }
}