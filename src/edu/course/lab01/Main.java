package edu.course.lab01;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            printUsage();
            return;
        }

        String command = args[0].toLowerCase();

        switch (command) {
            case "fizzbuzz":
                FizzBuzz.run();
                break;

            case "reverse":
                if (args.length < 2) {
                    System.out.println("Ошибка: укажите строку для реверса.");
                    System.out.println("Использование: reverse <строка>");
                    return;
                }
                TextTasks.printReverse(args[1]);
                break;

            case "quadratic":
                if (args.length < 4) {
                    System.out.println("Ошибка: укажите коэффициенты a, b, c.");
                    System.out.println("Использование: quadratic <a> <b> <c>");
                    return;
                }
                try {
                    double a = Double.parseDouble(args[1]);
                    double b = Double.parseDouble(args[2]);
                    double c = Double.parseDouble(args[3]);
                    QuadraticEquation.solve(a, b, c);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: коэффициенты должны быть числами.");
                }
                break;

            case "series":
                int count = 100;
                if (args.length >= 2) {
                    try {
                        count = Integer.parseInt(args[1]);
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка: количество элементов должно быть целым числом. Используем 100.");
                    }
                }
                SeriesCalculator.calculate(count);
                break;

            case "palindrome":
                if (args.length < 2) {
                    System.out.println("Ошибка: укажите строку для проверки.");
                    System.out.println("Использование: palindrome <строка>");
                    return;
                }
                TextTasks.checkPalindrome(args[1]);
                break;

            default:
                System.out.println("Неизвестная команда: " + args[0]);
                printUsage();
                break;
        }
    }

    private static void printUsage() {
        System.out.println("""
                Использование программы:
                  fizzbuzz                — вывод чисел от 1 до 100 с заменой Fizz/Buzz/FizzBuzz
                  reverse <строка>        — переворот строки
                  quadratic <a> <b> <c>  — решение квадратного уравнения ax^2 + bx + c = 0
                  series [n]              — вычисление суммы числового ряда
                  palindrome <строка>     — проверка строки на палиндром
                """);
    }
}