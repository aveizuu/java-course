package classes_and_methods.variable_params.practice01;

public class Main {
    public static void main(String[] args) {

        // 1. Вызов с одним строковым аргументом
        log("Одиночное сообщение");


        // 2. Вызов с несколькими аргументами
        log("Первое", "Второе", "Третье");


        // 3. Вызов без аргументов
        log();


        // 4. Вызов смешанного метода (int, String...)
        log(404, "Page Not Found", "Critical Error");
    }


    // Вариант 1: Принимает переменное количество строк
    static void log(String... messages) {
        System.out.print("[VARARGS] Записано сообщений: " + messages.length + " -> ");
        for (String m : messages) {
            System.out.print("'" + m + "' ");
        }
        System.out.println();
    }

    // Вариант 2: Принимает ровно одну строку
    static void log(String singleMessage) {
        System.out.println("[EXACT]   Одиночная запись: " + singleMessage);
    }

    // Вариант 3: Смешанные параметры
    static void log(int errorCode, String... details) {
        System.out.println("[MIXED]   Ошибка #" + errorCode + ". Подробности: " + String.join(", ", details));
    }
}
