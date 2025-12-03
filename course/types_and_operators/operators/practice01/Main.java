package types_and_operators.operators.practice01;

public class Main {
    public static void main(String[] args) {

        // Переменные для демонстрации
        int a = 10;
        int b = 3;
        int i = 5;
        boolean isSunny = true;
        boolean isRaining = false;
        String s1 = "Hello";
        String s2 = " World";
        int[] numbers = {1, 2, 3};

        int resultInt;
        boolean resultBool;

        System.out.println("--- Демонстрация Операторов Java ---");
        System.out.println("Исходные значения: a=" + a + ", b=" + b + ", i=" + i + ", s1=\"" + s1 + "\"\n");

        // Группа 1: Операторы Присваивания и Составного Присваивания (Низший Приоритет)

        System.out.println("1. Операторы Присваивания (=, +=, -=, *=, /=, %=)");

        // 1.1. = (Присваивание)
        int x = 50;
        System.out.println("  = Присваивание (x): " + x);

        // 1.2. += (Сложение и присваивание)
        a += 2; // a = 12
        System.out.println("  += int: " + a);
        s1 += s2; // s1 = "Hello World"
        System.out.println("  += String (Конкатенация): \"" + s1 + "\"");

        // 1.3. -= (Вычитание и присваивание)
        a -= 5; // a = 7
        System.out.println("  -= int: " + a);

        // 1.4. *= (Умножение и присваивание)
        a *= 2; // a = 14
        System.out.println("  *= int: " + a);

        // 1.5. /= (Деление и присваивание)
        a /= 3; // a = 4 (целочисленное деление)
        System.out.println("  /= int: " + a);

        // 1.6. %= (Остаток от деления и присваивание)
        a %= 3; // a = 1 (4 % 3)
        System.out.println("  %= int: " + a);

        // Группа 2: Условный Оператор (?:)

        System.out.println("\n2. Условный Оператор (?:)");

        // ?: (Условное выражение)
        String status = (a > b) ? "a больше b" : "b больше или равно a"; // 1 > 3 -> False
        System.out.println("  ?: (b > a): " + status);

        // Группа 3: Логические Операторы (||, &&)

        System.out.println("\n3. Логические Операторы (||, &&)");

        // || (Логическое ИЛИ)
        resultBool = isSunny || isRaining; // true || false -> true
        System.out.println("  || (ИЛИ): " + resultBool);

        // && (Логическое И)
        resultBool = isSunny && isRaining; // true && false -> false
        System.out.println("  && (И): " + resultBool);

        // Группа 4: Побитовые Операторы (|, ^, &)

        System.out.println("\n4. Побитовые Операторы (|, ^, &) [a=1, b=3]");

        // | (Побитовое ИЛИ)
        resultInt = a | b; // 0001 | 0011 = 0011 (3)
        System.out.println("  | (Побитовое ИЛИ): " + resultInt);

        // ^ (Побитовое Исключающее ИЛИ)
        resultInt = a ^ b; // 0001 ^ 0011 = 0010 (2)
        System.out.println("  ^ (Побитовое XOR): " + resultInt);

        // & (Побитовое И)
        resultInt = a & b; // 0001 & 0011 = 0001 (1)
        System.out.println("  & (Побитовое И): " + resultInt);

        // Группа 5: Операторы Равенства и Сравнения (==, !=, >, <, >=, <=)

        System.out.println("\n5. Операторы Сравнения (==, !=, >, <, >=, <=)");

        // == (Равенство)
        resultBool = (a == b); // 1 == 3 -> false
        System.out.println("  == Равенство: " + resultBool);

        // != (Неравенство)
        resultBool = (a != b); // 1 != 3 -> true
        System.out.println("  != Неравенство: " + resultBool);

        // > (Больше)
        resultBool = (10 > 5);
        System.out.println("  > Больше: " + resultBool);

        // >= (Больше или равно)
        resultBool = (10 >= 10);
        System.out.println("  >= Больше или равно: " + resultBool);

        // < (Меньше)
        resultBool = (a < b); // 1 < 3 -> true
        System.out.println("  < Меньше: " + resultBool);

        // <= (Меньше или равно)
        resultBool = (5 <= 10);
        System.out.println("  <= Меньше или равно: " + resultBool);

        // Группа 6: Операторы Сдвига (>>, >>>, <<)

        System.out.println("\n6. Операторы Сдвига (>>, >>>, <<) [b=3]");

        // >> (Сдвиг вправо со знаком)
        resultInt = b >> 1; // 3 (0011) >> 1 = 1 (0001)
        System.out.println("  >> Сдвиг вправо: " + resultInt);

        // >>> (Сдвиг вправо без знака)
        resultInt = b >>> 1; // Для положительных чисел результат тот же
        System.out.println("  >>> Сдвиг вправо без знака: " + resultInt);

        // << (Сдвиг влево)
        resultInt = b << 2; // 3 (0011) << 2 = 12 (1100)
        System.out.println("  << Сдвиг влево: " + resultInt);

        // Группа 7: Арифметические Операторы (+, -, *, /, %)

        System.out.println("\n7. Арифметические Операторы (+, -, *, /, %)");

        // + (Сложение/Конкатенация)
        resultInt = 5 + 3;
        System.out.println("  + Сложение: " + resultInt);
        String s3 = s1 + 123; // Конкатенация
        System.out.println("  + Конкатенация String: \"" + s3 + "\"");

        // - (Вычитание)
        resultInt = 5 - 3;
        System.out.println("  - Вычитание: " + resultInt);

        // * (Умножение)
        resultInt = 5 * 3;
        System.out.println("  * Умножение: " + resultInt);

        // / (Деление)
        resultInt = 5 / 3; // 1 (Целочисленное)
        System.out.println("  / Деление: " + resultInt);

        // % (Остаток от деления)
        resultInt = 5 % 3;
        System.out.println("  % Остаток от деления: " + resultInt);

        // Группа 8: Унарные Операторы (++, --, ~, !)

        System.out.println("\n8. Унарные Операторы (++, --, ~, !)");

        // ++ (Инкремент)
        i = 5; // Сброс i
        resultInt = ++i; // Префикс: Сначала i=6, потом resultInt=6
        System.out.println("  ++ Префикс (i=6, res=6): " + resultInt);

        i = 5; // Сброс i
        resultInt = i++; // Постфикс: Сначала resultInt=5, потом i=6
        System.out.println("  ++ Постфикс (i=6, res=5): " + resultInt);

        // -- (Декремент)
        i = 5; // Сброс i
        resultInt = --i; // Префикс: Сначала i=4, потом resultInt=4
        System.out.println("  -- Префикс (i=4, res=4): " + resultInt);

        i = 5; // Сброс i
        resultInt = i--; // Постфикс: Сначала resultInt=5, потом i=4
        System.out.println("  -- Постфикс (i=4, res=5): " + resultInt);

        // ~ (Побитовое НЕ)
        resultInt = ~10; // Инвертирует все биты: -(10+1) = -11
        System.out.println("  ~ Побитовое НЕ (~10): " + resultInt);

        // ! (Логическое НЕ)
        resultBool = !isSunny; // !true -> false
        System.out.println("  ! Логическое НЕ (!true): " + resultBool);

        // Группа 9: Операторы Вызова и Индексации ((), []) (Высший Приоритет)

        System.out.println("\n9. Операторы Вызова и Индексации ((), [])");

        // ( ) - Вызов метода
        int len = s1.length();
        System.out.println("  ( ) Вызов метода length(): " + len);

        // [ ] - Индексация массива
        int element = numbers[2]; // Получение элемента с индексом 2 (значение 3)
        System.out.println("  [ ] Индексация массива numbers[2]: " + element);
    }
}
