package classes_and_methods.access_restrictions.practice01;

public class AccessData {
    // 1. PUBLIC: Виден всем
    public String publicVar = "Public (Общедоступный)";

    // 2. PROTECTED: Виден в пакете и наследникам
    protected String protectedVar = "Protected (Защищенный)";

    // 3. DEFAULT: Виден только в пакете
    String defaultVar = "Default (Пакетный/По умолчанию)";

    // 4. PRIVATE: Виден только внутри этого класса
    private String privateVar = "Private (Приватный)";

    // Метод внутри того же класса имеет доступ ко ВСЕМ переменным
    public void printInternal() {
        System.out.println("--- Внутри класса AccessData ---");
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar); // Здесь private доступен
    }
}
