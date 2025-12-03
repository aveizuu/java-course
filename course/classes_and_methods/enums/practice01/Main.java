package classes_and_methods.enums.practice01;

enum CoffeeType {

    // Здесь вызывается конструктор для каждого элемента.
    ESPRESSO(150, "Крепкий, без молока"),
    AMERICANO(120, "Эспрессо с водой"),
    CAPPUCCINO(200, "Эспрессо с молочной пеной"),
    LATTE(220, "Много молока, мало кофе");

    private final int price;
    private final String description;

    // Приватный конструктор
    CoffeeType(int price, String description) {
        this.price = price;
        this.description = description;
    }

    // Геттеры для доступа к полям
    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name() + " (Цена: " + price + "р)";
    }
}

public class Main {
    public static void main(String[] args) {

        for (CoffeeType coffee : CoffeeType.values()) {
            System.out.println("Напиток: " + coffee.name());
            System.out.println("  Описание: " + coffee.getDescription());
            System.out.println("  Цена:     " + coffee.getPrice() + " руб.");
            System.out.println();
        }

        CoffeeType myOrder = CoffeeType.LATTE;

        System.out.println("Вы выбрали: " + myOrder);
    }
}
