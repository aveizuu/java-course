package exceptions_and_errors.multiple_exceptions.practice01;

class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class Main {
    public static void main(String[] args) {

        System.out.println("Одинаковая обработка");
        String[] inputs = {null, "NotANumber"};

        for (String input : inputs) {
            try {
                // Пытаемся превратить строку в число
                // Если input == null -> вылетит NullPointerException
                // Если input == "text" -> вылетит NumberFormatException
                int number = Integer.parseInt(input);
                System.out.println("Число: " + number);

            } catch (NumberFormatException | NullPointerException e) {
                System.out.println("Ошибка валидации данных: " + e.getClass().getSimpleName());
            }
        }


        System.out.println("\nИерархия исключений");
        try {
            generateException(3);

        }
        catch (Ex3 e) {
            System.out.println("Ex3 (Самый глубокий наследник)");
        }
        catch (Ex2 e) {
            System.out.println("Ex2 (Промежуточный класс)");
        }
        catch (Ex1 e) {
            System.out.println("Ex1 (Базовый класс)");
        }
        catch (Exception e) {
            System.out.println("какое-то другое исключение");
        }
    }

    public static void generateException(int level) throws Ex1 {
        switch (level) {
            case 1 -> throw new Ex1();
            case 2 -> throw new Ex2();
            case 3 -> throw new Ex3();
        }
    }
}
