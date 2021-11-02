package ru.netology;

import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        try (final Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите строку");
            final String inputLine = scanner.nextLine();
            makeDictionary(inputLine, new DictionaryMaker());
        }
    }

    private static void makeDictionary(String inputLine, Function<String, List<String>> function) {
        function.apply(inputLine)
                .forEach(System.out::println);
    }
}