package com.comarch.szkolenia.strumienie.anonimowe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", 200));
        cars.add(new Car("BMW", "3", 250));
        cars.add(new Car("Kia", "Ceed", 180));
        cars.add(new Car("Audi", "A5", 400));

        Collections.sort(cars, (c1, c2) -> c1.getPrice() - c2.getPrice());

        System.out.println(cars);

        Collections.sort(cars, (c1, c2) -> -(c1.getPrice() - c2.getPrice()));

        System.out.println(cars);

        Collections.sort(cars, (c1, c2) -> c1.getBrand().compareTo(c2.getBrand()));

        System.out.println(cars);

        JakisMojInterfejs jakisMojInterfejs = new JakisMojInterfejs() {
            @Override
            public void cos() {

            }
        };

        JakisMojInterfejs jakisMojInterfejs2 = () -> System.out.println("cos");
        jakisMojInterfejs2.cos();

        DuzyInterfejs duzyInterfejs = new DuzyInterfejs() {
            @Override
            public void a() {

            }

            @Override
            public void b() {

            }

            @Override
            public void c() {

            }
        };
    }
}
