package Observers.observer1.PartyObserver.AfterObserver.Subject;

public class Doorman extends Subject {

    private Boolean status;

    public void setStatus(Boolean newStatus){
        if ( this.status != newStatus) {
            this.status= newStatus;
            notifyObservers(newStatus);
        }
    }
}
