package edu.course.lab01;

public final class SeriesCalculator {
    private SeriesCalculator() {
    }

    public static void calculate(int n) {
        if (n <= 0) {
            System.out.println("Ошибка: количество элементов должно быть положительным числом.");
            return;
        }

        double sum = 0.0;
        for (int k = 1; k <= n; k++) {
            sum += 1.0 / ((double) k * k);
        }

        System.out.println("Сумма ряда (n = " + n + "): " + sum);
    }
}