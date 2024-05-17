package com.comarch.szkolenia.strumienie.strumienie;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,2,5,6,7,9,8,9,1,10,10,11,12);
        System.out.println(list);
        List<Integer> list2 = list.stream()
                .distinct()
                .toList();
        System.out.println(list2);
    }
}
