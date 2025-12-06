package string.formatting.practice01;

public class Main {
    public static void main(String[] args) {

        // Подготовка данных
        char groupCode = 'A';
        double electronMass = 0.000910938;
        int successRate = 98;
        int quantity = 5;
        Object secretObject = new Object();

        // 1. %c - Вставляет один символ
        System.out.printf("Код группы:      %c%n", groupCode);

        // 2. %e - Экспоненциальная запись
        System.out.printf("Масса частицы:   %e кг%n", electronMass);

        // 3. %% - Вставка знака процента
        System.out.printf("Вероятность:     %d%%%n", successRate);

        // 4. %h - Хэш-код
        System.out.printf("ID объекта:      %h%n", secretObject);

        // 5. %d - Вставляет целое число (quantity)
        System.out.printf("Количество: %d шт.%n", quantity);
    }
}
