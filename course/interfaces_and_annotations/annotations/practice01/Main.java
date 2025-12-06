package interfaces_and_annotations.annotations.practice01;

class OldCalculator {

    // @Deprecated
    // Сообщаем, что этот метод устарел и лучше использовать новый (sum)
    @Deprecated
    public int oldSum(int a, int b) {
        System.out.println("старый алгоритм");
        return a + b;
    }

    public int smartSum(int a, int b) {
        System.out.println("новый алгоритм");
        return a + b;
    }
}

class ModernCalculator extends OldCalculator {

    // 1. @Override
    // Гарантируем, что мы переопределяем метод родителя.
    // Если мы напишем 'smartSmm', компилятор выдаст ошибку.
    @Override
    public int smartSum(int a, int b) {
        System.out.println("супер-быстрый алгоритм");
        return a + b;
    }
}

public class Main {
    // 3. @SuppressWarnings
    // Мы знаем, что oldSum устарел, но нам ОЧЕНЬ нужно его вызвать здесь.
    // Мы просим компилятор не выдавать предупреждение "deprecation".
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        ModernCalculator calc = new ModernCalculator();

        // Вызов переопределенного метода
        calc.smartSum(5, 10);

        // Вызов устаревшего метода 
        // Благодаря @SuppressWarnings("deprecation") над методом main,
        // компилятор не будет ругаться на эту строку.
        calc.oldSum(5, 10);
    }
}
