package in_out_streams.byte_and_char_streams.practice04;

class SmartDoor implements AutoCloseable {

    public SmartDoor() {
        System.out.println("Дверь открывается");
    }

    public void enter() {
        System.out.println("Кто-то вошел");
    }

    @Override
    public void close() {
        System.out.println("Дверь закрывается автоматически");
    }
}

public class Main {
    public static void main(String[] args) {

        // try-with-resources
        // Ресурс объявляется в круглых скобках после try
        try (SmartDoor door = new SmartDoor()) {

            door.enter();

            // Здесь мы не пишем door.close()
            // Java вызовет его автоматически, когда код дойдет до закрывающей скобки

        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
