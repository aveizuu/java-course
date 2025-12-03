package classes_and_methods.parameterized_classes.practice02;

import java.util.ArrayList;
import java.util.List;

class Fruit {
    @Override public String toString() { return "Фрукт"; }
}

class Apple extends Fruit {
    @Override public String toString() { return "Яблоко"; }
}

class Citrus extends Fruit {
    @Override public String toString() { return "Цитрус"; }
}

public class Main {

    public static void main(String[] args) {

        List<Apple> appleBox = new ArrayList<>();
        appleBox.add(new Apple());

        List<Fruit> mixedFruitBox = new ArrayList<>();
        mixedFruitBox.add(new Citrus());

        // <? extends T>
        // Метод принимает коробку с любыми фруктами
        System.out.println("--- Чтение (extends) ---");
        printFruits(appleBox);
        printFruits(mixedFruitBox);


        // <? super T>
        // Метод принимает коробку, куда можно положить Яблоко
        // Это может быть коробка чисто для Яблок или коробка для Цитрусовых
        System.out.println("\n--- Запись (super) ---");

        addApple(appleBox);      // Можно положить яблоко к яблокам
        addApple(mixedFruitBox); // Можно положить яблоко к цитрусовым

        System.out.println("Смешанная коробка теперь: " + mixedFruitBox);
    }


    // <? extends Fruit>
    public static void printFruits(List<? extends Fruit> box) {
        for (Fruit f : box) {
            System.out.println("Осмотр: " + f);
        }
    }


    // <? super Apple>
    public static void addApple(List<? super Apple> box) {
        box.add(new Apple());
        System.out.println("Добавлено свежее яблоко.");
    }
}