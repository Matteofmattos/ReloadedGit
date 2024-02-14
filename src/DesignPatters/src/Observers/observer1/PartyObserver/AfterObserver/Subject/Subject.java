package Observers.observer1.PartyObserver.AfterObserver.Subject;

import java.util.ArrayList;
import java.util.List;
import Observers.observer1.PartyObserver.AfterObserver.Observers.Observer;

public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer){
        observers.add(observer);
    }

    public void notifyObservers(Boolean status){
        for (Observer observer: observers){
            observer.update(status);
        }
    }
    
}
