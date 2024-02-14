package Observers.observer1.PartyObserver.AfterObserver;

import Observers.observer1.PartyObserver.AfterObserver.Observers.Friends;
import Observers.observer1.PartyObserver.AfterObserver.Observers.Wife;
import Observers.observer1.PartyObserver.AfterObserver.Subject.Doorman;

public class Teste2 {

    public static void main(String[] args) {
        Doorman dorman = new Doorman();

        dorman.add(new Wife());
        dorman.add(new Friends());

        dorman.notifyObservers(false);
        dorman.notifyObservers(true);
    }
    
}
