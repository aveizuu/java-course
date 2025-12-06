package functional_interfaces.default_static.practice02;

interface CoachA {
    default void run() {
        System.out.println("Беги быстро");
    }
}

interface CoachB {
    default void run() {
        System.out.println("Беги медленно");
    }
}

// Класс реализует оба интерфейса
class Athlete implements CoachA, CoachB {

    // Если не переопределить метод run(), будет ошибка компиляции

    @Override
    public void run() {
        System.out.println("--- Решение конфликта ---");

        // Вариант 1: Выбрать конкретную реализацию (например, coachA)
        CoachA.super.run();

        // Вариант 2: Можно вызвать и второго, если нужно
        // CoachB.super.run();

        // Вариант 3: Добавить свою логику
        System.out.println("Бегу в своем темпе");
    }
}

public class Main {
    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        athlete.run();
    }
}
