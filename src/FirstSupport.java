public class FirstSupport implements SupportInterface {
    private SupportInterface nextHandler;

    @Override
    public void setNextHandler(SupportInterface nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("1")) {
            System.out.println("Вы выбрали русский язык.");

            if (nextHandler != null) {
                nextHandler.handleRequest("ru");
            }
        } else if (request.equals("2")) {
            System.out.println("Вы выбрали казахский язык.");

            if (nextHandler != null) {
                nextHandler.handleRequest("kz");
            }
        } else {
            System.out.println("Неверный выбор языка.");
        }
    }
}
