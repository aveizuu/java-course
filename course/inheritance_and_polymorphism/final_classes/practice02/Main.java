package inheritance_and_polymorphism.final_classes.practice02;

final class SecureConfiguration {
    private final String accessKey = "XYZ123";

    public String getKey() {
        return accessKey;
    }
}

// 2. Подкласс, который не может наследовать SecureConfiguration
/*
Если убрать комментарии, компилятор выдаст ошибку

class NewConfiguration extends SecureConfiguration {
    public void newFeature() {
        System.out.println("Новая функция добавлена.");
    }
}
*/

public class Main {
    public static void main(String[] args) {

        SecureConfiguration config = new SecureConfiguration();

    }
}
