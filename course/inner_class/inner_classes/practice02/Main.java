package inner_class.inner_classes.practice02;

class Outer {
    public int publicVar = 10;
    private int privateVar = 99;

    private void privateMethod() {
        System.out.println("Вызван приватный метод внешнего класса");
    }

    class Inner {
        void demoAccess() {
            System.out.println("--- Изнутри Inner ---");

            System.out.println("publicVar: " + publicVar);

            System.out.println("privateVar: " + privateVar);

            privateMethod();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        inner.demoAccess();
    }
}
