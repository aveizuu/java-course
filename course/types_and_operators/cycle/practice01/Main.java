package types_and_operators.cycle.practice01;

public class Main {
    public static void main(String[] args) {
        // Раскомментируйте нужный метод для проверки

        //exampleWhile();
        exampleDoWhile();
    }

    // Тривиальный пример бесконечного while
    // Цикл выполняется, пока условие истинно
    public static void exampleWhile() {
        while (true) {
            System.out.println("while");
        }
    }

    // Тривиальный пример бесконечного do-while
    // Тело цикла выполняется хотя бы один раз, затем проверяется условие
    public static void exampleDoWhile() {
        do {
            System.out.println("do-while");
        } while (true);
    }
}
