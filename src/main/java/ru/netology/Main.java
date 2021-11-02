package ru.netology;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (final Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите строку");
            final String inputLine = scanner.nextLine();
            new DictionaryMaker().apply(inputLine).forEach(System.out::println);
        }
    }
}