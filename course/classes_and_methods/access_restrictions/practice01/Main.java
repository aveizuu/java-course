package classes_and_methods.access_restrictions.practice01;

public class Main {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        System.out.println("--- Доступ из класса Main (тот же пакет) ---");

        // 1. Public - Доступен
        System.out.println("1. " + data.publicVar);

        // 2. Protected - Доступен (так как мы в том же пакете)
        System.out.println("2. " + data.protectedVar);

        // 3. Default - Доступен (так как мы в том же пакете)
        System.out.println("3. " + data.defaultVar);

        // 4. Private - не доступен
        // Следующая строка вызовет ошибку компиляции: "privateVar has private access in AccessData"
        // System.out.println(data.privateVar);
        System.out.println("4. Private недоступен");

        System.out.println();

        // Вызов метода, который находится внутри AccessData и имеет доступ ко всему
        data.printInternal();
    }
}
