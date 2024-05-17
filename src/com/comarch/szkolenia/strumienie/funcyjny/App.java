package com.comarch.szkolenia.strumienie.funcyjny;

import com.comarch.szkolenia.strumienie.anonimowe.Car;

import java.util.function.*;

public class App {
    public static void main(String[] args) {
        Function<Integer, String> function = i -> i + "";

        String s1 = function.apply(5);
        String s2 = function.apply(10);

        System.out.println(s1);
        System.out.println(s2);

        UnaryOperator<Integer> unaryOperator = x -> x * 55;

        System.out.println(unaryOperator.apply(7));
        System.out.println(unaryOperator.apply(14));
        System.out.println(unaryOperator.apply(3));

        BiFunction<String, Integer, Boolean> biFunction = (s, i) -> s.length() > i;

        System.out.println(biFunction.apply("Mateusz", 3));
        System.out.println(biFunction.apply("Mateusz", 7));
        System.out.println(biFunction.apply("Mateusz", 13));

        Predicate<String> predicate = s -> s.length() < 10;

        System.out.println(predicate.test("abc"));
        System.out.println(predicate.test("asdfasdf"));
        System.out.println(predicate.test("asdfasdfasdf"));

        Supplier<Car> defautCarSupplier = () -> new Car("default", "default", 0);

        System.out.println(defautCarSupplier.get());
        System.out.println(defautCarSupplier.get());

        Consumer<Car> consumer = c -> System.out.println(c);

        consumer.accept(new Car("BMW", "5", 200));
        consumer.accept(defautCarSupplier.get());
    }
}
