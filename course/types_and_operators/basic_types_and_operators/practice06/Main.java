package types_and_operators.practice06;

public class Main {
    public static void main(String[] args) {

        // Пример 1: Потеря дробной части
        double d = 10.99;
        int i = (int) d;
        System.out.println("1. double (10.99) -> int: " + i); // 10

        // Пример 2: Переполнение
        int largeInt = 150;
        byte b = (byte) largeInt;
        System.out.println("2. int (150) -> byte: " + b); // -106

        // Пример 3: Потеря точности
        double precise = 1.2345678912345678;
        float imprecise = (float) precise;
        System.out.println("3. double -> float (Исходное): " + precise);
        System.out.println("   double -> float (Результат): " + imprecise);
    }
}
