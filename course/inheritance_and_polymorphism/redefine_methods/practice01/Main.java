package inheritance_and_polymorphism.redefine_methods.practice01;

class SearchService {

    // 1. Поиск по ID (тип аргумента - int)
    String find(int id) {
        return "Результат поиска по ID #" + id;
    }

    // 2. Поиск по Названию (тип аргумента - String)
    String find(String name) {
        return "Результат поиска по названию: '" + name + "'";
    }

    // 3. Расширенный поиск (два аргумента)
    String find(String category, double maxPrice) {
        return "Товары из категории [" + category + "] до " + maxPrice + " руб.";
    }
}

public class Main {
    public static void main(String[] args) {
        SearchService searcher = new SearchService();

        System.out.println(searcher.find(5501));
        System.out.println(searcher.find("Ноутбук"));
        System.out.println(searcher.find("Смартфоны", 89999.9));
    }
}