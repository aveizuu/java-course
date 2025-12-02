package intro.practice02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");

        String name = scan.next();

        System.out.println("Привет, " + name);
    }
}
