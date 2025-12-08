package in_out_streams.scanner_class.practice01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/in_out_streams/scanner_class/practice01/data.txt");

        // Используем try-with-resources
        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNext()) {

                // Если следующий элемент - целое число
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    System.out.println("Найдено число: " + number);
                }
                // Иначе читаем как строку
                else {
                    String word = scanner.next();
                    System.out.println("Найдено слово: " + word);
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден. Проверьте путь");
        }
    }
}
