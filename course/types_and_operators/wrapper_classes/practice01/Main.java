package types_and_operators.wrapper_classes.practice01;

public class Main {
    public static void main(String[] args) {

        // 1. Десятичное представление
        // Строка просто содержит десятичные цифры.
        Integer base10Value = Integer.decode("2025");
        System.out.println("Десятичное число (2025) -> " + base10Value);


        // 2. Шестнадцатеричные числа
        // Integer.decode() распознает префиксы 0x, 0X или #.

        // Префикс 0X
        Integer hexValue1 = Integer.decode("0X1A");
        System.out.println("Hex (0X1A) -> " + hexValue1); // 1*16 + 10 = 26

        // Префикс #
        Integer hexValue2 = Integer.decode("#100");
        System.out.println("Hex (#100) -> " + hexValue2); // 1*256 = 256


        // 3. Восьмеричное число
        // Распознает префикс 0.
        Integer octalValue = Integer.decode("027");
        System.out.println("Octal (027) -> " + octalValue); // 2*8 + 7 = 23


        // 4. Отрицательные числа
        // Знак '-' должен стоять перед префиксом (если он есть) или самим числом.
        Integer negativeHex = Integer.decode("-0xA");
        System.out.println("Отрицательное Hex (-0xA) -> " + negativeHex); // -(10) = -10
    }
}
