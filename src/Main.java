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
    }
}