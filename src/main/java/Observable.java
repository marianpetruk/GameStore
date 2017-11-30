import java.util.ArrayList;
import java.util.List;

public class Observable {

    List<Observer> observers = new ArrayList<>();

    public Observable() {

    }

    public boolean addObserver(Observer observer) {
        observers.add(observer);
        return true;
    }

    public boolean removeObserver(Observer observer) {
        observers.remove(observer);
        return true;
    }

    public boolean notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
        return true;
    }
}
