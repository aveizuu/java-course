package classes_and_methods.methods.practice01;

// --- 1. ПЕРЕГРУЗКА (Overloading) ---
// Класс имеет несколько методов с именем 'send', но разными аргументами.
// Компилятор выбирает нужный метод по типу и количеству переданных данных.
class NotificationService {

    // Вариант 1: Просто текст
    void send(String message) {
        System.out.println("Рассылка всем: " + message);
    }

    // Вариант 2: Текст + конкретный получатель
    void send(String message, String recipient) {
        System.out.println("Личное сообщение для " + recipient + ": " + message);
    }
}

// --- 2. ПЕРЕОПРЕДЕЛЕНИЕ (Overriding) ---
// Изменение поведения метода, унаследованного от родительского класса.

// Базовый класс
class Transport {
    void move() {
        System.out.println("Транспорт перемещается как-то...");
    }
}

class Car extends Transport {

    // Полностью меняем реализацию метода move()
    @Override
    void move() {
        System.out.println("Машина едет по дороге");
    }
}

class Plane extends Transport {

    @Override
    void move() {
        System.out.println("Самолёт летит в небе");
    }
}

public class Main {
    public static void main(String[] args) {

        // --- Тест Перегрузки ---
        System.out.println("--- Перегрузка (NotificationService) ---");
        NotificationService notifier = new NotificationService();

        notifier.send("Сервер запущен");           // Вызов метода с 1 строкой
        notifier.send("Привет!", "Admin");         // Вызов метода с 2 строками

        // --- Тест Переопределения ---
        System.out.println("\n--- Переопределение (Transport) ---");

        // 1. Родительский объект
        Transport genericTransport = new Transport();
        genericTransport.move(); // Базовая логика

        // 2. Дочерний объект 
        Transport myCar = new Car();
        myCar.move(); // Логика Car

        // 3. Другой дочерний объект
        Transport myPlane = new Plane();
        myPlane.move(); // Логика Plane
    }
}