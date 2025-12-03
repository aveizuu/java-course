package types_and_operators.operators.practice02;

class Employee {}

class Manager extends Employee {}

public class Main {
    public static void main(String[] args) {

        Employee regularEmployee = new Employee();
        Manager teamManager = new Manager();
        // Ссылка родительского типа, хранящая объект дочернего типа
        Employee managerAsEmployee = new Manager();

        System.out.println("--- 1. Проверка Наследования ---");

        // 1. Прямая проверка
        System.out.println("1. teamManager является Manager?: " + (teamManager instanceof Manager));

        // 2. Проверка наследования (Восходящее преобразование)
        // Объект Manager является и Employee, поскольку Manager наследует Employee.
        System.out.println("2. teamManager является Employee?: " + (teamManager instanceof Employee));

        // 3. Проверка несовместимого типа (Нисходящее преобразование)
        // Объект Employee не является Manager.
        System.out.println("3. regularEmployee является Manager?: " + (regularEmployee instanceof Manager));

        // 4. Проверка через ссылку родителя
        System.out.println("4. managerAsEmployee является Manager?: " + (managerAsEmployee instanceof Manager));


        // Проверка null
        System.out.println("\n--- 2. Проверка null ---");

        // Объявляем объектную ссылку, но не инициализируем ее
        Employee potentialEmployee = null;
        Manager potentialManager = null;

        // 5. Проверка null-ссылки на класс
        boolean checkNullClass = potentialEmployee instanceof Employee;
        System.out.println("5. Является ли null-ссылка Employee экземпляром Employee?: " + checkNullClass);

        // 6. Проверка null-ссылки на дочерний класс
        boolean checkNullManager = potentialManager instanceof Manager;
        System.out.println("6. Является ли null-ссылка Manager экземпляром Manager?: " + checkNullManager);
    }
}
