package inner_class.inner_classes.practice01;

class Bank {

    // 1. public. Доступен всем
    public class ATM {
        public void use() {
            System.out.println("[-public-] Банкомат: Вставьте карту...");
        }
    }

    // 2. protected. Доступен внутри пакета и наследникам класса Bank
    protected class Vault {
        public void open() {
            System.out.println("[-protected-] Хранилище: Доступ получен.");
        }
    }

    // 3. default. Доступен только внутри этого пакета
    class Operation {
        public void process() {
            System.out.println("[-default-] Операция: Обработка документов...");
        }
    }

    // 4. private. Доступен ТОЛЬКО внутри самого класса Bank
    private class SecurityCode {
        void check() {
            System.out.println("[-private-] Секретный код: Проверка пройдена.");
        }
    }

    // Метод внутри Bank имеет доступ к private классу
    public void runSystemCheck() {
        System.out.println("\n--- Внутренняя проверка банка ---");
        SecurityCode code = new SecurityCode();
        code.check();
    }
}

public class Main {
    public static void main(String[] args) {
        Bank myBank = new Bank();

        System.out.println("--- Проверка доступа из Main (тот же пакет) ---");

        // 1. Создаем public класс (Доступно)
        Bank.ATM atm = myBank.new ATM();
        atm.use();

        // 2. Создаем protected класс (Доступно, т.к. один пакет)
        Bank.Vault vault = myBank.new Vault();
        vault.open();

        // 3. Создаем default класс (Доступно, т.к. один пакет)
        Bank.Operation op = myBank.new Operation();
        op.process();

        // 4. Попытка создать private класс
        // ошибка компиляции
        // Bank.SecurityCode sc = myBank.new SecurityCode();
        System.out.println("[-private-] Недоступен из Main (ошибка компиляции)");

        // Но мы можем заставить Bank использовать его внутри себя
        myBank.runSystemCheck();
    }
}
