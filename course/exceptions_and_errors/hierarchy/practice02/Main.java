package exceptions_and_errors.hierarchy.practice02;

public class Main {
    public static void main(String[] args) {

        handleArithmetic();
        handleArrayIndex();
        handleIllegalArgument();
        handleClassCast();
        handleNullPointer();
    }

    // 1. ArithmeticException
    // Возникает при недопустимых арифметических операциях, например, деление на ноль
    private static void handleArithmetic() {
        System.out.print("1. ArithmeticException: ");
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка. Нельзя делить на ноль");
            // e.printStackTrace(); // Можно вывести полный стек ошибки
        }
    }

    // 2. ArrayIndexOutOfBoundsException
    // Возникает при обращении к несуществующему индексу массива
    private static void handleArrayIndex() {
        System.out.print("2. ArrayIndexOutOfBounds: ");
        try {
            int[] numbers = {1, 2, 3};
            // Индексы: 0, 1, 2. Мы просим 5-й.
            int wrong = numbers[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка. Выход за пределы массива, индекс не существует");
        }
    }

    // 3. IllegalArgumentException
    // Выбрасывается явно, когда методу передан некорректный аргумент
    private static void handleIllegalArgument() {
        System.out.print("3. IllegalArgumentException: ");
        try {
            setHumanAge(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка валидации: " + e.getMessage());
        }
    }

    // Вспомогательный метод для п.3
    private static void setHumanAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }

    // 4. ClassCastException
    // Возникает при попытке привести объект к классу, которым он не является
    private static void handleClassCast() {
        System.out.print("4. ClassCastException: ");
        try {
            Object text = "Я строка";
            Integer number = (Integer) text;
        } catch (ClassCastException e) {
            System.out.println("Ошибка. Невозможно превратить String в Integer");
        }
    }

    // 5. NullPointerException (NPE)
    // Возникает при попытке вызвать метод или поле у объекта, который равен null
    private static void handleNullPointer() {
        System.out.print("5. NullPointerException: ");
        try {
            String emptyRef = null;
            // Пытаемся узнать длину "ничего"
            emptyRef.length();
        } catch (NullPointerException e) {
            System.out.println("Ошибка. Обращение к объекту, который равен null");
        }
    }
}
