package classes_and_methods.static_methods_and_fields.practice01;

class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("--- 1. Вызов через имя класса ---");
        // Самый правильный способ. Сразу понятно, что метод статический.
        A.printVars();


        System.out.println("\n--- 2. Вызов через экземпляр объекта ---");
        A obj = new A();
        obj.printVars();


        System.out.println("\n--- 3. Вызов через анонимный объект ---");
        // То же самое, что и пункт 2, но без создания переменной.
        new A().printVars();


        System.out.println("\n--- 4. Вызов через null-ссылку ---");
        A nullObj = null;
        nullObj.printVars();
    }
}
