package in_out_streams.byte_and_char_streams.practice02;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {

            // 'J'
            outputStream.write(74);

            // 'a'
            outputStream.write(97);

            // 'v'
            outputStream.write(118);

            // 'a'
            outputStream.write(97);

            // Превращаем накопленные байты обратно в строку
            String result = outputStream.toString();

            System.out.println("Результат восстановления строки: " + result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
