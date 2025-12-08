package in_out_streams.byte_and_char_streams.practice01;

import java.io.ByteArrayInputStream;

public class Main {
    public static void main(String[] args) {

        byte[] dataBuffer = "Java".getBytes();

        // Создаем поток, передав ему наши данные
        ByteArrayInputStream inputStream = new ByteArrayInputStream(dataBuffer);

        int byteData;

        // Цикл чтения
        while ((byteData = inputStream.read()) != -1) {

            // Выводим цифровой код байта
            System.out.print("Код: " + byteData);

            // Приводим к типу char, чтобы увидеть букву
            System.out.println(" -> Символ: " + (char) byteData);
        }
    }
}
