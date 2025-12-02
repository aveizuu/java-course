package types_and_operators.practice05;

public class Main {
    public static void main(String[] args) {

        // 1. Сложение: int и double
        int a = 10;
        double b = 5.5;
        double result1 = a + b;
        // int 'a' (10) преобразуется в double (10.0).
        System.out.println("1. int (10) + double (5.5) = " + result1);
        System.out.println("   Тип результата: double\n");

        // 2. Вычитание: long и float
        long x = 10000000000L;
        float y = 1.0f;
        float result2 = x - y;
        // long 'x' преобразуется в float. Операция выполняется между float числами.
        System.out.println("2. long (10 млрд) - float (1.0) = " + result2);
        System.out.println("   Тип результата: float\n");

        // 3. Умножение: byte и int
        byte c = 5;
        int d = 3;
        int result3 = c * d;
        // byte 'c' автоматически "повышается" до int.
        System.out.println("3. byte (5) * int (3) = " + result3);
        System.out.println("   Тип результата: int (т.к. byte повысился до int)\n");

        // 4. Деление: int и int с ЯВНЫМ преобразованием в double
        int e = 10;
        int f = 4;
        // Явное преобразование '(double)e' выполняется первым, заставляя все последующее деление быть делением с плавающей точкой.
        double result4 = (double)e / f;
        System.out.println("4. (double)int (10) / int (4) = " + result4);
        System.out.println("   Тип результата: double (получили 2.5)\n");

        // 5. Деление: int и int (Целочисленное деление для сравнения)
        int result5 = e / f;
        System.out.println("5. int (10) / int (4) = " + result5);
        System.out.println("   Тип результата: int (получили 2)\n");
    }
}
