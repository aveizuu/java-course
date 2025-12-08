package exceptions_and_errors.handle_exceptions.practice01;

public class Main {
    public static void main(String[] args) {

        // 1. Исключение, которое будет перехвачено
        try {
            System.out.println("Делим на ноль");
            int result = 10 / 0; // Генерируется ArithmeticException
        } catch (ArithmeticException e) {
            // Мы ловим ошибку, выводим сообщение и гасим ошибку
            System.out.println("Ошибка: Деление на ноль, но мы продолжаем");
        }

        System.out.println("\nПрограмма жива и работает дальше\n");

        // 2. Исключение, которое приведет к аварийной остановке
        // Здесь нет блока try-catch.
        System.out.println("Лезем за границы массива");

        int[] list = {1, 2, 3};
        int crash = list[10]; // Генерируется ArrayIndexOutOfBoundsException

        System.out.println("это не выведется никогда");
    }
}
