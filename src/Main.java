public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int clientOS = 1;

        switch (clientOS) {
            case 0:
                System.out.println("Установите приложение для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите приложение для Android по ссылке");
                break;
            default:
                System.out.println("Ваша операционная система не может быть распознана");
        }
        int clientDeviceYear = 2014;
        int usersSystem = 1;
        if (clientDeviceYear >= 2015 && usersSystem == 1) {
            System.out.println("Установите приложение для iOS по следующей ссылке");
        } else if (usersSystem == 1) {
            System.out.println("Установите облегченную версию приложения для iOS");
        }
        if(clientDeviceYear >= 2015 && usersSystem < 1) {
            System.out.println("Установите приложение для Android по следующей ссылке");
        } else if (usersSystem < 1) {
            System.out.println("Установите облегченную версию приложения для Android по следующей ссылке");
        }
    }
}