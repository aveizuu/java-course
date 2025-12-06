package string.class_string.practice01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Исходная строка
        String originalText = "  Java Programming is powerful!  ";

        System.out.println("Исходная строка: [" + originalText + "]");
        System.out.println("--------------------------------------------------");

        // 1. length()
        // Возвращает длину строки (количество символов, включая пробелы)
        int length = originalText.length();
        System.out.println("1. length(): " + length);


        // 2. trim()
        // Удаляет пробелы в начале и в конце строки.
        // (строка в Java неизменяема, метод возвращает новую строку)
        String trimmedText = originalText.trim();
        System.out.println("2. trim(): [" + trimmedText + "]");


        // 3. toUpperCase()
        // Преобразует все символы строки в верхний регистр.
        String upperText = trimmedText.toUpperCase();
        System.out.println("3. toUpperCase(): " + upperText);


        // 4. charAt(int index)
        // Возвращает символ, находящийся по указанному индексу (нумерация с 0).
        char firstChar = trimmedText.charAt(0); // 'J'
        System.out.println("4. charAt(0): " + firstChar);


        // 5. substring(int beginIndex, int endIndex)
        // Извлекает подстроку.
        // beginIndex - включительно, endIndex - исключительно.
        // "Java Programming..." -> берем с 0 по 4 (0,1,2,3) -> "Java"
        String sub = trimmedText.substring(0, 4);
        System.out.println("5. substring(0, 4): " + sub);


        // 6. replace(CharSequence target, CharSequence replacement)
        // Заменяет все вхождения одной последовательности символов на другую.
        String replaced = trimmedText.replace("Powerful", "Fun");
        System.out.println("6. replace('Powerful', 'Fun'): " + replaced);


        // 7. contains(CharSequence s)
        // Проверяет, содержится ли указанная последовательность символов в строке.
        // Возвращает true или false.
        boolean hasWord = trimmedText.contains("Programming");
        System.out.println("7. contains('Programming'): " + hasWord);


        // 8. startsWith(String prefix)
        // Проверяет, начинается ли строка с указанного префикса.
        boolean startsWithJava = trimmedText.startsWith("Java");
        System.out.println("8. startsWith('Java'): " + startsWithJava);


        // 9. equalsIgnoreCase(String anotherString)
        // Сравнивает строки, игнорируя регистр букв.
        // "java programming is powerful!" == "Java Programming is Powerful!"
        String lowerCaseComparison = "java programming is powerful!";
        boolean isEqual = trimmedText.equalsIgnoreCase(lowerCaseComparison);
        System.out.println("9. equalsIgnoreCase(): " + isEqual);


        // 10. split(String regex)
        // Разделяет строку на массив строк, используя заданный разделитель.
        String[] words = trimmedText.split(" ");
        System.out.println("10. split(' '): Массив слов -> " + Arrays.toString(words));
    }
}
