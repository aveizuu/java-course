package string.stringbuilder_and_stringbuffer.practice01;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Демонстрация StringBuilder и StringBuffer ---");

        StringBuilder sb = new StringBuilder("Java");
        System.out.println("Исходная строка: " + sb);


        // 1. append(String str)
        // Добавляет строку в конец текущей последовательности
        sb.append(" is Best");
        System.out.println("1. append: " + sb);


        // 2. insert(int offset, String str)
        // Вставляет строку в указанную позицию (сдвигая остальное вправо)
        sb.insert(8, "the ");
        System.out.println("2. insert: " + sb); // "Java is the Best"


        // 3. replace(int start, int end, String str)
        // Заменяет часть строки от start до end
        sb.replace(0, 4, "Coding");
        System.out.println("3. replace: " + sb);


        // 4. delete(int start, int end)
        // Удаляет символы в заданном диапазоне.
        sb.delete(10, 14);
        System.out.println("4. delete: " + sb); // "Coding is Best"


        // 5. reverse()
        // Переворачивает строку задом наперед.
        sb.reverse();
        System.out.println("5. reverse: " + sb);

        // Вернем обратно для читаемости
        sb.reverse();


        // 6. setCharAt(int index, char ch)
        // Заменяет одиночный символ по индексу.
        sb.setCharAt(0, 'M');
        System.out.println("6. setCharAt: " + sb);


        // 7. capacity()
        // Возвращает текущий размер выделенного буфера памяти.
        int cap = sb.capacity();
        System.out.println("7. capacity(): " + cap);


        // 8. length()
        // Возвращает реальную длину содержащегося текста.
        System.out.println("8. length(): " + sb.length());


        // 9. setLength(int newLength)
        // Принудительно меняет длину строки.
        sb.setLength(6); // Оставляем только "Moding"
        System.out.println("9. setLength(6): " + sb);


        // 10. toString()
        // Преобразует изменяемый StringBuilder обратно в неизменяемый String.
        String result = sb.toString();
        System.out.println("10. toString(): Результат зафиксирован -> " + result);
    }
}
