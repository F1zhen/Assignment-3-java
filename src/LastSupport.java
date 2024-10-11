public class LastSupport implements SupportInterface {
    private String language;

    public LastSupport(String language) {
        this.language = language;
    }

    @Override
    public void setNextHandler(SupportInterface nextHandler) {
        // No next handler for LastSupport
    }

    @Override
    public void handleRequest(String request) {
        if (language.equals("ru")) {
            switch (request) {
                case "1":
                    System.out.println("Ваш баланс: 1000 рублей");
                    break;
                case "2":
                    System.out.println("Свяжитесь с поддержкой по номеру 123-456");
                    break;
                case "3":
                    System.out.println("Мы вам перезвоним по поводу услуги 'Интернет'");
                    break;
                default:
                    System.out.println("Неверный выбор услуги.");
                    break;
            }
        } else if (language.equals("kz")) {
            switch (request) {
                case "1":
                    System.out.println("Сіздің баланс: 1000 теңге");
                    break;
                case "2":
                    System.out.println("Қолдау қызметіне 123-456 телефоны бойынша хабарласыңыз");
                    break;
                case "3":
                    System.out.println("Біз сізге 'Интернет' бойынша қайта қоңырау шаламыз.");
                    break;
                default:
                    System.out.println("Қате қызмет таңдауы.");
                    break;
            }
        }
    }
}
