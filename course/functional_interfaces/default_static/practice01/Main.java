package functional_interfaces.default_static.practice01;

interface AdvancedInterface {

    // Абстрактный метод. Класс обязан его реализовать.
    void doWork();


    // Неабстрактный метод (default)
    // Имеет тело. Класс наследует его, может использовать "как есть" или переопределить.
    // Вызывается через экземпляр реализующего класса.
    default void defaultInfo() {
        System.out.println("[default] Сработала стандартная реализация из интерфейса.");
    }


    // Статический метод (static)
    // Принадлежит лично интерфейсу. Не наследуется классом.
    // Вызывается только через имя интерфейса.
    static void staticUtility() {
        System.out.println("[static] Сработал статический метод интерфейса.");
    }
}


class Worker implements AdvancedInterface {

    @Override
    public void doWork() {
        System.out.println("[impl] Работа выполнена классом Worker.");
    }

    // defaultInfo() мы не переопределяем, поэтому Worker будет использовать версию из интерфейса.
}

public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker();

        System.out.println("--- Вызов обычного (абстрактного) метода ---");
        worker.doWork();

        System.out.println("\n--- Вызов неабстрактного метода ---");
        worker.defaultInfo();

        // Если бы у нас была ссылка типа интерфейса, это тоже сработало бы:
        AdvancedInterface inter = new Worker();
        inter.defaultInfo();

        System.out.println("\n--- 3. Вызов статического метода ---");
        // Только через имя интерфейса
        AdvancedInterface.staticUtility();
    }
}
