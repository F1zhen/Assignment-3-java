public interface SupportInterface {
    void setNextHandler(SupportInterface nextHandler);
    void handleRequest(String issue);
}