package ru.otus;

import com.google.common.base.Joiner;

import java.util.Arrays;
import java.util.List;

public class HelloOtus {
    public static void main(String... args) {
        List<String> fruits = Arrays.asList("apple", "watermelon", "orange", "pear", "cherry");
        System.out.println(Joiner.on(",").join(fruits));
    }
}
