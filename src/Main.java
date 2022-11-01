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
        if (clientDeviceYear >= 2015 && usersSystem < 1) {
            System.out.println("Установите приложение для Android по следующей ссылке");
        } else if (usersSystem < 1) {
            System.out.println("Установите облегченную версию приложения для Android по следующей ссылке");
        }
        int year = 2004;
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear) {
            System.out.println(year + " это високосный год.");
        } else {
            System.out.println(year + " это невисокосный год.");

        }
        int deliveryDistance = 95;
        int deliveryTerm = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Срок доставки составит: " + deliveryTerm + " сутки.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Срок доставки составит: " + deliveryTerm * 2 + " суток.");
        } else {
            System.out.println("Срок доставки составит: " + deliveryTerm * 3 + " суток.");

        }
        int monthNumber = 4;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}

