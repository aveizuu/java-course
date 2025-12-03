package types_and_operators.conditional_operators.practice01;

public class Main {
    public static void main(String[] args) {

        int a = 2;
        int i;

        // Синтаксис: (Условие 1) ? Значение1 : (Условие 2) ? Значение2 : ЗначениеИначе;
        i = (a == 1) ? 1 : (a == 2) ? 2 : 3;

        // Проверка результата
        System.out.println("При a = " + a + ", результат i = " + i);
    }
}
