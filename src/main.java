import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        SupportInterface firstSupport = new FirstSupport();
        SupportInterface serviceSupport = new ServiceSupport();
        SupportInterface ruServiceSupport = new LastSupport("ru");
        SupportInterface kzServiceSupport = new LastSupport("kz");


        firstSupport.setNextHandler(serviceSupport);
        serviceSupport.setNextHandler(ruServiceSupport);
        serviceSupport.setNextHandler(kzServiceSupport);


        System.out.println("Выберите язык:\n1. Русский\n2. Казахский");
        String languageChoice = scanner.nextLine();
        firstSupport.handleRequest(languageChoice);


        String serviceChoice = scanner.nextLine();


        if (languageChoice.equals("1")) {
            ruServiceSupport.handleRequest(serviceChoice);
        } else if (languageChoice.equals("2")) {
            kzServiceSupport.handleRequest(serviceChoice);
        } else {
            System.out.println("Неверный выбор языка.");
        }

        scanner.close();
    }
}
