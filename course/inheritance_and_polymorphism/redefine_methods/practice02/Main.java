package inheritance_and_polymorphism.redefine_methods.practice02;

class Animal {
    public void voice() {
        System.out.println("Животное издает какой-то звук");
    }
}

class Cat extends Animal {
    @Override
    public void voice() {
        System.out.println("мяу :)");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.voice();
    }
}