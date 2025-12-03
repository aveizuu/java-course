package types_and_operators.array.practice02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 30, 15, 0};

        // 1. toString()
        // Преобразует массив в читаемую строку формата "[элем1, элем2, ...]"
        System.out.println("\n1. toString():");
        System.out.println("   Исходный массив: " + Arrays.toString(numbers));


        // 2. sort()
        // Сортирует массив по возрастанию
        Arrays.sort(numbers);
        System.out.println("\n2. sort():");
        System.out.println("   Массив после сортировки: " + Arrays.toString(numbers));


        // 3. binarySearch()
        // Ищет элемент в ОТСОРТИРОВАННОМ массиве.
        // Возвращает индекс элемента или отрицательное число, если не найден.
        System.out.println("\n3. binarySearch():");

        int indexFound = Arrays.binarySearch(numbers, 15);
        System.out.println("   Ищем 15: найден на индексе " + indexFound);

        int indexNotFound = Arrays.binarySearch(numbers, 99);
        // Если не найден, возвращает: -(точка_вставки) - 1
        System.out.println("   Ищем 99: не найден, результат " + indexNotFound);


        // 4. equals()
        // Сравнивает содержимое двух массивов (порядок важен).
        // Возвращает boolean.
        int[] arrA = {1, 2, 3};
        int[] arrB = {1, 2, 3};
        int[] arrC = {1, 2, 10};

        System.out.println("\n4. equals():");
        System.out.println("   arrA " + Arrays.toString(arrA));
        System.out.println("   arrB " + Arrays.toString(arrB));
        System.out.println("   arrC " + Arrays.toString(arrC));

        System.out.println("   arrA equals arrB? -> " + Arrays.equals(arrA, arrB)); // true
        System.out.println("   arrA equals arrC? -> " + Arrays.equals(arrA, arrC)); // false


        // 5. compare()
        // Лексикографическое сравнение. Возвращает int:
        // 0  -> массивы равны
        // <0 -> первый массив "меньше" второго (идет раньше)
        // >0 -> первый массив "больше" второго
        System.out.println("\n5. compare():");

        // Сравним arrA {1, 2, 3} и arrC {1, 2, 10}
        // Так как 3 меньше 10, arrA считается "меньше" arrC
        int compareResult = Arrays.compare(arrA, arrC);

        System.out.print("   Сравнение arrA и arrC: " + compareResult);
        if (compareResult < 0) System.out.println(" (arrA меньше arrC)");
        else if (compareResult > 0) System.out.println(" (arrA больше arrC)");
        else System.out.println(" (Массивы равны)");
    }
}
