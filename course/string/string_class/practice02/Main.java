package string.class_string.practice02;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- 1. Простой разделитель ---");
        // Конструктор принимает только разделитель
        StringJoiner csvJoiner = new StringJoiner("; ");

        csvJoiner.add("Apple");
        csvJoiner.add("Banana");
        csvJoiner.add("Orange");

        System.out.println(csvJoiner.toString());


        System.out.println("\n--- 2. Разделитель + Префикс + Суффикс ---");
        // Удобно для создания массивов [A, B, C]
        StringJoiner arrayJoiner = new StringJoiner(", ", "[", "]");

        arrayJoiner.add("Red");
        arrayJoiner.add("Green");
        arrayJoiner.add("Blue");

        System.out.println(arrayJoiner.toString());


        System.out.println("\n--- 3. Обработка пустого значения ---");
        StringJoiner emptyJoiner = new StringJoiner(", ", "{", "}");

        // По умолчанию, если ничего не добавить, он вернет префикс + суффикс ("{}")
        // Но мы можем задать специальное значение для пустого состояния:
        emptyJoiner.setEmptyValue("пусто");

        System.out.println("Без элементов: " + emptyJoiner.toString());

        emptyJoiner.add("Data");
        System.out.println("С элементом:   " + emptyJoiner.toString());


        System.out.println("\n--- 4. Объединение ---");
        StringJoiner joiner1 = new StringJoiner(", ", "[", "]");
        joiner1.add("1").add("2");

        StringJoiner joiner2 = new StringJoiner(" - ", "(", ")");
        joiner2.add("3").add("4");

        // При слиянии joiner2 в joiner1:
        // 1. Используется разделитель из joiner1 (", ")
        // 2. Префикс и суффикс joiner2 игнорируются
        joiner1.merge(joiner2);

        System.out.println(joiner1.toString());
    }
}
