package com.comarch.szkolenia.strumienie.strumienie;

import java.util.List;
import java.util.OptionalDouble;

public class Zadanie3 {

    /*
    Mamy liste liczb. Policz średnią tylko parzystych liczb.
    */

    public static void main(String[] args) {
        List<Integer> list = List.of(2,453,5,23,56,43,2,545,43,34,43,45,254,4565,65,4,23);

        OptionalDouble avgBox = list.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(i -> i)
                .average();
        System.out.println((int) (avgBox.getAsDouble() * 100) / 100.0);
        //System.out.println(Math.round(avgBox.getAsDouble()));
    }
}
