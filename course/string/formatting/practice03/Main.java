package string.formatting.practice03;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Получаем текущую дату и время
        Date now = new Date();

        // 1. %tA - День недели
        System.out.printf("Сегодня:      %tA%n", now);


        // 2. %tB - Месяц и 3. %tY - Год
        System.out.printf("Текущая дата: %tB %tY года%n", now, now);


        // 4. %tH - Часы и 5. %tM - Минуты
        System.out.printf("Точное время: %tH:%tM%n", now, now);
    }
}
