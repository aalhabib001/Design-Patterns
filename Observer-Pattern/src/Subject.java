public interface Subject {

    void register(Observer observer);

    void unRegister(Observer observer);

    void notifyObserver();
}
