package edu.course.lab01;

public final class TextTasks {
    private TextTasks() {
    }

    public static void printReverse(String input) {
        // Собственный алгоритм разворота строки через цикл
        char[] chars = input.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed.append(chars[i]);
        }
        System.out.println(reversed.toString());
    }

    public static void checkPalindrome(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        // Используем собственный алгоритм и для проверки палиндрома
        char[] chars = cleaned.toCharArray();
        boolean isPalindrome = true;
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}