package inheritance_and_polymorphism.super_and_this.practice03;

class A {
    int a;
    int b;
    int c;
    int z;

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1;
    }

    public A(int a, int b) {
        this(a, b, 0);
    }

    public A(int a) {
        this(a, 0);
    }

    public A() {
        this(0);
    }

    void printInfo() {
        System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", z=" + z);
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new A(10);

        obj.printInfo();
    }
}
