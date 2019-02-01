package com.divashchenko;

/*
1. Написать класс для работы с длинными числами которые заданы как String.
Реализовать оснонвые операции: +,-,/,*,%, корень квадратный, возведение в степень, округление.
Пример:
String result = LongArithmetic.add("234234.45", "-345345345.6756");
*/

public class Main {

    public static void main(String[] args) {

        String result = LongArithmetic.add("234234.45", "-345345345.6756");
        System.out.println(result);

        result = LongArithmetic.del("2172.8", "-8291.274");
        System.out.println(result);

        result = LongArithmetic.division("851023.901748", "274.271");
        System.out.println(result);

        result = LongArithmetic.multiply("34723", "2371832.23871");
        System.out.println(result);

        result = LongArithmetic.euclideanDivision("8761298.238", "2376182");
        System.out.println(result);

        result = LongArithmetic.squareRoot("129824027.238712");
        System.out.println(result);

        result = LongArithmetic.exponentiation("251232", "3");
        System.out.println(result);

        result = LongArithmetic.rounding("2718462.58261926");
        System.out.println(result);

        result = LongArithmetic.add("daf", "2913"); // Error!
        System.out.println(result);
    }
}
