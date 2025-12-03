package classes_and_methods.final_modifier.practice01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Все способы инициализации final поля:");

        // 1. Через конструктор
        A_Constructor obj1 = new A_Constructor(1);
        System.out.println("1. Конструктор: " + obj1.a);

        // 2. Через логический блок
        A_Block obj2 = new A_Block();
        System.out.println("2. Блок инициализации: " + obj2.a);
    }
}

// --- Вариант 1: Инициализация в конструкторе ---
// Если конструкторов несколько, переменная должна быть инициализирована в каждом из них.
class A_Constructor {
    public final int a;

    // Конструктор 1
    public A_Constructor(int value) {
        this.a = value;
    }

    // Конструктор 2
    public A_Constructor() {
        this.a = 0;
    }
}

// --- Вариант 2: Инициализация в логическом блоке ---
// Этот блок выполняется перед любым конструктором.
class A_Block {
    public final int a;

    // Логический блок инициализации
    {
        a = 2;
    }
}