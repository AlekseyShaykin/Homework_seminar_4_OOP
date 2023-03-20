package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("++++++++ КАЛЬКУЛЯТОР (ДЗ) +++++++++");

        Calc<Integer> calc = new Calc<>();
        System.out.println("Сложение: " + calc.sum(new ArrayList<>(Arrays.asList(1, 3, 4))));

        System.out.println("Умножение: " + calc.multiply1(new ArrayList<>(Arrays.asList(2, 10))));

        System.out.println("Вычитание: " + calc.dedication(10, 8));

        calc.binarSum("text");

        calc.binarSum(2);
    }
}