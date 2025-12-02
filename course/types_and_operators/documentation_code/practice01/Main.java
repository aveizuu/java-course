package types_and_operators.documentetion_code.practice01;

/**
 * Главный класс приложения, содержащий точку входа (метод main).
 * Этот класс служит для демонстрации работы утилиты Javadoc
 * и показывает, как документировать точку запуска программы.
 */
public class Main {

    /**
     * Основной метод приложения (точка входа).
     * <p>Этот метод выполняет простую печать в консоль,
     * подтверждая успешный запуск программы.</p>
     * @param args Аргументы командной строки.
     */
    public static void main(String[] args) {
        System.out.println("Программа успешно запущена. Демонстрация Javadoc");
    }

    /**
     * Константа для значения Пи.
     */
    public static final double PI = 3.14159;

    /**
     * Вычисляет площадь окружности.
     * @param radius радиус окружности.
     * @return площадь окружности.
     * @throws IllegalArgumentException если радиус отрицателен.
     */
    public double calculateArea(double radius) throws IllegalArgumentException {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным.");
        }
        return PI * radius * radius;
    }
}