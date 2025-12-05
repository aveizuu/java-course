package inner_class.nested_classes.practice01;

interface SecuritySystem {

    void checkAccess(String user);

    // вложенный класс
    // классы внутри интерфейса всегда public и static.
    class KeyGenerator {

        public void createKey() {
            System.out.println(">> Сгенерирован новый ключ шифрования: [A1-B2-C3]");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Использование класса внутри интерфейса ---");

        // Обращаемся к классу через имя интерфейса: Interface.Class
        // Создавать экземпляр самого интерфейса SecuritySystem не надо
        SecuritySystem.KeyGenerator generator = new SecuritySystem.KeyGenerator();

        generator.createKey();
    }
}