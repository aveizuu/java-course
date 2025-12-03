package types_and_operators.cycle.practice02;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            // 1. Демонстрация continue
            // Задача: Пропускать (не печатать) четные числа.
            if (i % 2 == 0) {
                System.out.println("  -> (continue) Пропускаем четное число: " + i);
                continue; // Мгновенный переход к следующей итерации (i++), код ниже не выполняется
            }

            // 2. Демонстрация break
            // Задача: Полностью остановить цикл, если встретили число 7.
            if (i == 7) {
                System.out.println("  -> (break) Встречено число 7. Остановка цикла");
                break; // Полный выход из тела цикла
            }

            // Основное действие (выполнится, только если не сработал continue и break)
            System.out.println("Обработка нечетного числа: " + i);
        }

        System.out.println("Цикл завершен");
    }
}
