package types_and_operators.wrapper_classes.practice03;

public class Main {
    public static void main(String[] args) {

        // 1. Инициализация объекта-оболочки значением null
        Integer nullableInteger = null;

        System.out.println("Попытка выполнить автораспаковку null...");

        try {
            // 2. Автораспаковка
            // Компилятор неявно преобразует: int primitive = nullableInteger.intValue();
            int primitive = nullableInteger;

            System.out.println("Этот код не будет выполнен.");

        } catch (NullPointerException e) {
            System.out.println("Ошибка, NullPointerException при автораспаковке:");
            System.out.println("Причина: Попытка вызвать метод .intValue() на ссылке, равной null.");
        }
    }
}
