package types_and_operators.practice01;

public class Main {
    public static void main(String[] args) {

        // --- 1. Примитивные типы (хранят значение, не могут быть null) ---

        // Целые числа
        byte myByte = 100;
        short myShort = 30000;
        int myInt = 1000000;
        long myLong = 9999999999L;

        // Дробные числа
        float myFloat = 10.5f;
        double myDouble = 8.5;

        // Символ
        char myChar = 'Z';

        // Логический тип
        boolean myBoolean = true;

        // --- "Нулевые" значения примитивов (начальные значения) ---
        int zeroInt = 0;
        char zeroChar = '\u0000'; // Код символа 0
        boolean zeroBool = false;

        // --- 2. Ссылочные типы (хранят ссылку, могут быть null) ---

        // Класс String
        String myString = "Привет, Мир!";

        // Классы-оболочки для примитивов
        Integer wrapperInt = 500;
        Boolean wrapperBool = Boolean.TRUE;

        // --- Присвоение null ---

        String nullString = null;     // Отсутствие объекта String
        Integer nullInteger = null;   // Отсутствие объекта Integer
        Double nullDouble = null;     // Отсутствие объекта Double

        System.out.println("--- Примитивные типы (Значения) ---");
        System.out.println("byte: " + myByte);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);

        System.out.println("\n--- Примитивные 'нулевые' значения ---");
        System.out.println("zeroInt: " + zeroInt);
        System.out.println("zeroChar (пусто): [" + zeroChar + "]");
        System.out.println("zeroBool: " + zeroBool);

        System.out.println("\n--- Ссылочные типы (Объекты) ---");
        System.out.println("String: " + myString);
        System.out.println("Wrapper Integer: " + wrapperInt);

        System.out.println("\n--- Ссылочные типы (null) ---");
        System.out.println("nullString: " + nullString);
        System.out.println("nullInteger: " + nullInteger);
        System.out.println("nullDouble: " + nullDouble);
    }
}
