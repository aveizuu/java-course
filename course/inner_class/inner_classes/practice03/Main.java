package inner_class.inner_classes.practice03;

class Outer {

    // Метод внешнего класса
    void accessInnerSecret() {
        // 1. Чтобы получить доступ, нужно создать экземпляр
        Inner inner = new Inner();

        System.out.println("--- Внутри внешнего класса Outer ---");

        // 2. Обращение к public полю
        System.out.println("Вижу Public: " + inner.publicData);

        // 3. Обращение к private полю
        System.out.println("Вижу Private: " + inner.privateData);

        // 4. Вызов private метода
        inner.secretMethod();
    }

    class Inner {
        public String publicData = "Открытые данные";
        private String privateData = "Секретные данные";

        private void secretMethod() {
            System.out.println("Вызван приватный метод Inner!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.accessInnerSecret();
    }
}
