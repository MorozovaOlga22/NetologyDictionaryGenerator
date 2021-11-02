package ru.netology;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DictionaryMaker implements Function<String, List<String>> {
    @Override
    public List<String> apply(String phrase) {
        return Arrays.stream(phrase.split(" "))
                .sorted()
                .collect(Collectors.toList());
    }
}
