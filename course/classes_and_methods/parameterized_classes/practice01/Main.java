package classes_and_methods.parameterized_classes.practice01;

class DataHolder<T> {
    private T data;

    public DataHolder(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataHolder{" + data + "}";
    }
}

public class Main {
    public static void main(String[] args) {

        DataHolder<Double> numHolder = new DataHolder<>(3.14);
        DataHolder<String> textHolder = new DataHolder<>("Test");


        // Мы спрашиваем: "Это DataHolder с каким-либо типом?"
        if (numHolder instanceof DataHolder<?>) {
            System.out.println("numHolder является DataHolder<?> (Корректно)");
        }

        // Мы спрашиваем: "Это вообще DataHolder?"
        if (textHolder instanceof DataHolder) {
            System.out.println("textHolder является DataHolder (Корректно, но raw type)");
        }


        // Проверка конкретного типа
        // Если раскомментировать строки ниже, код не скомпилируется, так как конкретный параметр типа в рантайме стирается.

        /*
        if (numHolder instanceof DataHolder<Double>) {
            System.out.println("Это DataHolder конкретно для Double");
        }
        */

        /*
        if (textHolder instanceof DataHolder<String>) {
            System.out.println("Это DataHolder конкретно для String");
        }
        */

        System.out.println("\nНельзя проверить конкретный тип");
    }
}
