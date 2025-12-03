package classes_and_methods.enums.practice02;

enum MathOperation {

    SUM("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String symbol;

    // Конструктор
    MathOperation(String symbol) {
        this.symbol = symbol;
    }

    // Этот метод позволяет enum'у самому выполнять действие.
    // Мы используем switch(this), чтобы понять, какая именно константа вызывает метод.
    public double execute(double x, double y) {
        switch (this) {
            case SUM:
                return x + y;
            case SUBTRACT:
                return x - y;
            case MULTIPLY:
                return x * y;
            case DIVIDE:
                if (y == 0) return 0;
                return x / y;
            default:
                throw new UnsupportedOperationException("Операция не реализована");
        }
    }

    public String getSymbol() {
        return symbol;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Калькулятор на основе Enum ---");

        double num1 = 10.0;
        double num2 = 5.0;

        for (MathOperation op : MathOperation.values()) {

            // Вызываем доп метод
            double result = op.execute(num1, num2);

            System.out.printf("Операция: %s %s %s = %.1f%n",
                    num1,
                    op.getSymbol(),
                    num2,
                    result);
        }
        
        MathOperation myOp = MathOperation.MULTIPLY;
        System.out.println("Умножение 6 * 7 = " + myOp.execute(6, 7));
    }
}
