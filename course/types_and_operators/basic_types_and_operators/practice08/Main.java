package types_and_operators.practice08;

import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // 1. Пример со строкой
        var message = "Hello, World!";
        System.out.println("Значение: " + message);
        System.out.println("Тип (выведен var): " + message.getClass().getSimpleName());

        // 2. Пример с числом
        var number = 100;
        System.out.println("\nЧисло: " + number);
        System.out.println("Тип (выведен var): " + ((Object)number).getClass().getSimpleName());

        // 3. Объект Date
        // var упрощает инициализацию
        var currentDate = new Date();
        System.out.println("Значение: " + currentDate);
        System.out.println("Тип (выведен var): " + currentDate.getClass().getSimpleName());
    }
}