package types_and_operators.practice04;

public class Main {
    static class DataObject {
        private int id;

        public DataObject(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "DataObject[ID=" + id + "]";
        }
    }

    public static void main(String[] args) {

        // 1. Исходные переменные
        String prefix = "Результат: ";
        int integerValue = 42;          // Базовый тип
        double doubleValue = 3.14;      // Базовый тип
        DataObject obj = new DataObject(101); // Объектный тип

        // 2. Демонстрация конкатенации

        // СТРОКА + ПРИМИТИВ:
        String result1 = prefix + integerValue;
        System.out.println("1. String + int: " + result1);

        // ПРИМИТИВ + СТРОКА:
        String result2 = doubleValue + " равно " + integerValue;
        System.out.println("2. double + String + int: " + result2);

        // СТРОКА + ОБЪЕКТ:
        String result3 = "Объект: " + obj;
        System.out.println("3. String + Object: " + result3);

        // СЛОЖЕНИЕ С ПРИОРИТЕТОМ:
        String result4 = "Сумма = " + (integerValue + 8);
        System.out.println("4. (int + int) + String: " + result4);

        // СЛОЖЕНИЕ БЕЗ ПРИОРИТЕТА (слева направо):
        String result5 = "Значение " + integerValue + 8;
        System.out.println("5. String + int + int: " + result5);
    }
}
