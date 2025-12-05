package inheritance_and_polymorphism.super_and_this.practice01;

class Parent {
    String message = "Поле Родителя";

    // Конструктор родителя
    Parent(String text) {
        System.out.println("[1] Вызван конструктор Parent: " + text);
    }

    void showInfo() {
        System.out.println("Метод showInfo() из класса Parent");
    }
}

class Child extends Parent {
    // Это поле скрывает (shadows) поле message из Parent
    String message = "Поле Потомка";

    Child() {
        // 1. Вызов конструктора суперкласса
        // Должен быть всегда первой строкой в конструкторе.
        super("Привет от наследника!");
    }

    @Override
    void showInfo() {
        System.out.println("\n--- Внутри метода Child ---");

        // 2. Вызов метода суперкласса
        // Используется, чтобы выполнить старую логику перед (или после) новой.
        super.showInfo();

        System.out.println("Дополнительная логика в Child");
    }

    void printFields() {
        System.out.println("\n--- Доступ к полям ---");
        System.out.println("this.message:  " + this.message);

        // 3. Доступ к скрытому полю суперкласса
        // Используется, если имена полей совпадают.
        System.out.println("super.message: " + super.message);
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();

        child.showInfo();
        child.printFields();
    }
}