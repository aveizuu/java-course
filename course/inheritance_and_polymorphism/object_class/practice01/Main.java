package inheritance_and_polymorphism.object_class.practice01;

import java.util.Objects;

class Book {
    private String title;
    private String author;
    private int publicationYear; // Это поле не будет влиять на equals

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // --- Переопределение equals ---
    @Override
    public boolean equals(Object obj) {
        // 1. Рефлексивность
        if (this == obj) return true;

        // 2. Проверка на null и соответствие классов
        if (obj == null || getClass() != obj.getClass()) return false;

        // 3. Приведение типа (Casting)
        // Теперь мы уверены, что obj — это Book, и можем его привести.
        Book otherBook = (Book) obj;

        // 4. Сравнение полей
        // Используем Objects.equals для безопасного сравнения строк.
        return Objects.equals(title, otherBook.title) &&
                Objects.equals(author, otherBook.author);
    }

    // Обязательно переопределяем hashCode в паре с equals
    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Книга '" + title + "' (" + author + ", " + publicationYear + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем три книги
        Book book1 = new Book("Мастер и Маргарита", "М. Булгаков", 1967);
        Book book2 = new Book("Мастер и Маргарита", "М. Булгаков", 2020); // Переиздание (год другой)
        Book book3 = new Book("Война и мир", "Л. Толстой", 1869);

        System.out.println("book1: " + book1);
        System.out.println("book2: " + book2);

        System.out.println("\n--- Результаты сравнения ---");

        // Сравнение ссылок
        // Вернет false, так как это два разных объекта в памяти (new Book... new Book...)
        System.out.println("Ссылки (book1 == book2): " + (book1 == book2));

        // Сравнение содержимого (.equals)
        // Вернет true, так как Название и Автор совпадают
        System.out.println("Содержимое (book1.equals(book2)): " + book1.equals(book2));

        // Сравнение разных книг
        System.out.println("Другая книга (book1.equals(book3)): " + book1.equals(book3));
    }
}