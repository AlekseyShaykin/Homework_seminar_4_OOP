package org.example;

import java.util.List;

public class Calc<T extends Number> {


    // Sum
    public Double sum(List<T> items) {
        double sum = 0;
        for (T i : items)
            sum += i.doubleValue();
        return sum;

    }

    // Multiply

    public Double multiply1(List<T> items) {
        double resMult = 1;
        for (T i : items) {
            resMult = resMult * i.doubleValue();

        }
        return resMult;
    }

    // Dedication

    public Double dedication(double i, double j) {
        return i - j;
    }

    public void binar(String text) {


        int d[] = new int[255];
        for (int i = 0; i < text.length(); i++) {
            d[i] = Integer.valueOf(text.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : text.getBytes()) {
            System.out.print(
                    String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0')
            );
        }
        System.out.println(sb.toString());
    }


    public void binarNumber(int number) {
        String convert = Integer.toBinaryString(number);
        System.out.println(convert);
    }


    public void binarSum(Object j) {
        if (j instanceof Number) {
                int number;
                number = (int) j;
                String convert = Integer.toBinaryString(number);
                System.out.println("Бинарное представление числа " + j+ " равно " + convert);
            } else {
                String text;
                text = j.toString();
                int d[] = new int[255];
                for (int i = 0; i < text.length(); i++) {
                    d[i] = Integer.valueOf(text.charAt(i));
                }
                StringBuilder sb = new StringBuilder();
                for (byte b : text.getBytes()) {
                    System.out.print(
                            String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0')
                    );
                }
                System.out.println(sb.toString() + " - это бинарное представление строки "+ j);

            }

        }
    }






