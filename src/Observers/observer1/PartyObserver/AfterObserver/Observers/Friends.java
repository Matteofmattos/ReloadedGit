package Observers.observer1.PartyObserver.AfterObserver.Observers;

public class Friends implements Observer{

    @Override
    public void update(Boolean status) {
        if ( status ){
            System.out.println("Look, We've brought you a gift...");
        } else {
            System.out.println("Sleep...");
        }
    }
    
}
