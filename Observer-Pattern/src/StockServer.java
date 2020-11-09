import java.util.ArrayList;

public class StockServer implements Subject {

    ArrayList<Observer> observers;
    int ibmPrice;
    int applePrice;
    int googlePrice;

    public StockServer() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer:observers){
            observer.update(ibmPrice,applePrice,googlePrice);
        }
    }

    public void setIbmPrice(int ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setApplePrice(int applePrice) {
        this.applePrice = applePrice;
        notifyObserver();
    }

    public void setGooglePrice(int googlePrice) {
        this.googlePrice = googlePrice;
        notifyObserver();
    }
}
