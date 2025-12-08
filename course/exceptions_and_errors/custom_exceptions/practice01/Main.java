package exceptions_and_errors.custom_exceptions.practice01;

class InvalidDataException extends Exception {

    public InvalidDataException() {
        super("Ошибка данных");
    }

    // Конструктор с сообщением
    public InvalidDataException(String message) {
        super(message);
    }

    // Конструктор с сообщением и причиной
    public InvalidDataException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Проверка email");
        try {
            // Пытаемся зарегистрировать пользователя без символа '@'
            registerUser("ivan_mail.ru");
        } catch (InvalidDataException e) {
            System.out.println("Перехвачена ошибка: " + e.getMessage());
        }

        System.out.println("\nИмитация сбоя базы данных");
        try {
            saveToDatabase(null);
        } catch (InvalidDataException e) {
            System.out.println("Перехвачена ошибка: " + e.getMessage());
            System.out.println("    Причина (cause): " + e.getCause());
        }
    }

    // Метод использует 2 конструктор
    public static void registerUser(String email) throws InvalidDataException {
        if (!email.contains("@")) {
            throw new InvalidDataException("Email должен содержать символ '@': " + email);
        }
        System.out.println("Пользователь зарегистрирован: " + email);
    }

    // Метод использует 3 Конструктор
    public static void saveToDatabase(String data) throws InvalidDataException {
        try {
            // Имитируем системную ошибку (обращение к null)
            int length = data.length();
        } catch (NullPointerException systemError) {
            throw new InvalidDataException("Сбой при сохранении в БД", systemError);
        }
    }
}
