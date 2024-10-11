public class ServiceSupport implements SupportInterface {
    private SupportInterface nextHandler;

    @Override
    public void setNextHandler(SupportInterface nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("ru")) {
            System.out.println("Выберите услугу:\n1. Баланс\n2. Поддержка\n3. Интернет");
        } else if (request.equals("kz")) {
            System.out.println("Қызметті таңдаңыз:\n1. Баланс\n2. Қолдау\n3. Баптаулар");
        }
    }}