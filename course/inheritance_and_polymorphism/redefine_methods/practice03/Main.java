package inheritance_and_polymorphism.redefine_methods.practice03;

class EventHandler {
    public void onEvent() {
        System.out.println("Базовая обработка события");
    }
}

class CustomHandler extends EventHandler {

    // Ошибка без @Override
    // допущена ошибка "onEventt" вместо "onEvent".
    // Без аннотации компилятор молчит. Он думает, что это просто новый метод.
    public void onEventt() {
        System.out.println("Моя кастомная обработка (Никогда не вызовется!)");
    }

    // Ошибка с @Override (нужно раскомментировать чтобы увидеть
    // Аннотация заставляет компилятор проверить, есть ли такой метод у родителя.
    // Так как у родителя нет метода "onStop", компиляция упадет с ошибкой.

    /*
    @Override
    public void onStop() {
        System.out.println("Остановка...");
    }
    */
}

public class Main {
    public static void main(String[] args) {
        EventHandler handler = new CustomHandler();

        // Мы ожидаем вызвать метод наследника, но из-за опечатки (onEventt)
        // переопределения не произошло. Вызывается метод родителя.
        handler.onEvent();
    }
}
