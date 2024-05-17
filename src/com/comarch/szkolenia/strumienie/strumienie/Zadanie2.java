package com.comarch.szkolenia.strumienie.strumienie;

import java.util.List;

public class Zadanie2 {
    /* Mamy liste imion.
    Usuń wszystkie imiona zaczynające się na "A" i wypisz wszystkie pozostałe imiona
    w kolejności alfabetycznej tylko małymi literami.
    */
    public static void main(String[] args) {
        List<String> names = List.of(
                "Janusz",
                "Wiesiek",
                "Adam",
                "Zyta",
                "Karolina",
                "Borys",
                "Tadeusz"
        );

        names.stream()
                .filter(imie -> !imie.startsWith("a"))
                .filter(imie -> !imie.startsWith("A"))
                .map(String::toLowerCase)
                .sorted()
                .forEach(System.out::println);
    }
}
