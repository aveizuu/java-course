package types_and_operators.wrapper_classes.practice02;

public class Main {
    public static void main(String[] args) {

        // 1. Использование статических констант
        Boolean constantTrue = Boolean.TRUE;
        Boolean constantFalse = Boolean.FALSE;
        System.out.println("\n1. Статические константы (Boolean.TRUE/FALSE):");
        System.out.println("  TRUE: " + constantTrue);
        System.out.println("  FALSE: " + constantFalse);

        // 2. Использование статического фабричного метода

        // A. Из примитивного boolean
        Boolean valueOfBoolean = Boolean.valueOf(5 > 3); // true
        System.out.println("\n2. Статический метод valueOf(boolean):");
        System.out.println("  valueOf(5 > 3): " + valueOfBoolean);

        // B. Из строки String
        // Анализирует строку: "true" (без учета регистра)
        Boolean valueOfStringTrue = Boolean.valueOf("TRUE");
        Boolean valueOfStringOther = Boolean.valueOf("Yes");
        System.out.println("  valueOf(\"TRUE\"): " + valueOfStringTrue);
        System.out.println("  valueOf(\"Yes\"): " + valueOfStringOther);


        // 3. Автоупаковка
        // Компилятор неявно вызывает Boolean.valueOf() при присвоении
        boolean primitiveValue = (100 == 100); // true
        Boolean autoBoxed = primitiveValue;
        System.out.println("\n3. Автоупаковка (boolean -> Boolean):");
        System.out.println("  autoBoxed (100 == 100): " + autoBoxed);


        // 4. Использование конструктора
        @SuppressWarnings("deprecation")
        Boolean deprecatedConstruct = new Boolean("TruE");
        System.out.println("\n4. Конструктор:");
        System.out.println("  new Boolean(\"TruE\"): " + deprecatedConstruct);
    }
}
