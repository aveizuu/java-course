package types_and_operators.switch_operator;


public class Main {

    enum Day { MONDAY, FRIDAY, SUNDAY }

    public static void main(String[] args) {

        // -- Примитивы --
        System.out.println("--- 1. Примитивы (int, char, byte, short) ---");
        int score = 5;
        switch (score) {
            case 1: System.out.println("Плохо"); break;
            case 5: System.out.println("Отлично"); break;
            default: System.out.println("Нормально");
        }

        // -- Классы-обёртки --
        System.out.println("\n--- 2. Классы-обертки (Integer, Character и др.) ---");
        Integer wrapperValue = 10; // Автоупаковка
        // Важно: если wrapperValue будет null, вылетит NullPointerException
        switch (wrapperValue) {
            case 10: System.out.println("Это десятка (Integer)"); break;
            case 20: System.out.println("Это двадцатка (Integer)"); break;
        }

        // -- Строки --
        System.out.println("\n--- 3. Строки (String) [с Java 7] ---");
        String command = "START";
        switch (command) {
            case "START": System.out.println("Запуск системы..."); break;
            case "STOP":  System.out.println("Остановка..."); break;
            default:      System.out.println("Неизвестная команда");
        }

        // -- enum --
        System.out.println("\n--- 4. Перечисления (Enum) ---");
        Day today = Day.FRIDAY;
        switch (today) {
            case MONDAY: System.out.println("Понедельник"); break;
            case FRIDAY: System.out.println("Пятница!"); break;
            case SUNDAY: System.out.println("Воскресенье"); break;
        }

        // -- Сопоставление с образцом в switch --
        System.out.println("\n--- 5. Pattern Matching и Object ---");
        Object obj = "Hello Java 21"; // Может быть любым объектом

        // Современный синтаксис switch expression с проверкой типов
        String result = switch (obj) {
            case Integer i -> "Это целое число: " + i;
            case String s  -> "Это строка длиной: " + s.length();
            case Long l    -> "Это Long: " + l;
            case null      -> "Это null!";
            default        -> "Неизвестный тип объекта";
        };
        System.out.println("Результат Pattern Matching: " + result);
    }
}
