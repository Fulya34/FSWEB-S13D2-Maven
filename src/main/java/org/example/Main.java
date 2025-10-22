package org.example;

public class Main {

    public static boolean isPalindrome(int sayi) {
        String[] chars = Integer.toString(Math.abs(sayi)).split("");
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        return Integer.parseInt(reversed) == Math.abs(sayi);
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0)
            return false;

        int toplam = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                toplam += i;
            }
        }
        return number == toplam;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"};

        String[] digits = String.valueOf(number).split("");
        StringBuilder result = new StringBuilder();

        for (String d : digits) {
            int rakam = Integer.parseInt(d);
            result.append(words[rakam]).append(" ");
        }

        return result.toString().trim();
    }
}