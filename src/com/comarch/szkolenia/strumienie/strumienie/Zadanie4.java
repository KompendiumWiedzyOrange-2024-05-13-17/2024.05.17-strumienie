package com.comarch.szkolenia.strumienie.strumienie;

import java.util.List;
import java.util.OptionalDouble;

public class Zadanie4 {
    /*
    Stwórz listę stringów ( 10 dowolnych stringów)
    napisz program który wyświetla jaka jest
    średnia długość stringów które nie zawierają
    spacji i wielkich liter po usunięciu ze stringów
    kropek i przecinków.
    */
    public static void main(String[] args) {
        List<String> strings = List.of(
                "lkajhsdg fasgdjgas",
                "kjaysgdjFygasjsg",
                "oifwuahfoias",
                "aisydbiay.hbsduyb",
                "ia67sdg8Yagsdiuygf",
                "lkasjhdlfiuhasd",
                "KUT FSF",
                "uasy,dgu",
                "go8asydguyf",
                "ajshdg.fkjhag,sl kh"
        );

        OptionalDouble resultBox = strings.stream()
                .filter(n -> !n.contains(" "))
                .filter(n -> n.equals(n.toLowerCase()))
                .map(n -> n.replace(".",""))
                .map(n -> n.replace(",",""))
                //.peek(System.out::println)
                //.map(n -> n.length())
                //.peek(System.out::println)
                .mapToInt(String::length)
                .average();

        System.out.println(resultBox.getAsDouble());
    }
}
