package inheritance_and_polymorphism.final_classes.practice01;

class SecuritySystem {

    public void sayHello() {
        System.out.println("Добро пожаловать в систему безопасности.");
    }

    // final метод - нельзя менять
    // Мы гарантируем, что алгоритм проверки пароля всегда будет именно таким.
    public final void checkPassword(String password) {
        if ("1234".equals(password)) {
            System.out.println("Доступ разрешен.");
        } else {
            System.out.println("Доступ запрещен.");
        }
    }
}

class HackedSystem extends SecuritySystem {

    @Override
    public void sayHello() {
        System.out.println("Система взломана! Добро пожаловать.");
    }

    // Если раскомментировать код ниже, компилятор выдаст ошибку:

    /*
    @Override
    public void checkPassword(String password) {
        System.out.println("Доступ разрешен всем подряд");
    }
    */
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Тест системы ---");

        HackedSystem system = new HackedSystem();

        system.sayHello();

        // Вызовется метод родителя
        system.checkPassword("1234");
    }
}
