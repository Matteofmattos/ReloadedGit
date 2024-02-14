package Observers.observer2.Subject;

import Observers.observer2.Observers.Observer;

public interface Subject {

    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers( );
}
