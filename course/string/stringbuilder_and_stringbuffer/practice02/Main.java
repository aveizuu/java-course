package string.stringbuilder_and_stringbuffer.practice02;

public class Main {
    public static void main(String[] args) {

        String source = "Hello Java";
        System.out.println("Исходная строка: " + source);

        // String -> В StringBuilder / StringBuffer

        // Используем конструктор
        StringBuilder builder = new StringBuilder(source);
        StringBuffer buffer = new StringBuffer(source);

        System.out.println("1. String -> StringBuilder: " + builder);
        System.out.println("1. String -> StringBuffer:  " + buffer);


        // StringBuilder / StringBuffer -> В String

        // Используем метод toString()
        String strFromBuilder = builder.toString();
        String strFromBuffer = buffer.toString();

        System.out.println("2. StringBuilder -> String: " + strFromBuilder);


        // StringBuilder и StringBuffer

        // Прямое приведение (StringBuffer) builder невозможно
        // Но так как оба реализуют интерфейс CharSequence, можно передать один в конструктор другого

        // StringBuilder -> StringBuffer
        StringBuffer newBuffer = new StringBuffer(builder);

        // StringBuffer -> StringBuilder
        StringBuilder newBuilder = new StringBuilder(buffer);

        System.out.println("3. StringBuilder -> StringBuffer: " + newBuffer);
    }
}
