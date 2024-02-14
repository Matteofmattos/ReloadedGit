package Observers.observer1.PartyObserver.AfterObserver.Observers;

public class Wife implements Observer {

    @Override
    public void update(Boolean status) {
        if ( status ){
            System.out.println("Start the party!!");
        } else {
            System.out.println("Hold...");
        }
    }
    
}
