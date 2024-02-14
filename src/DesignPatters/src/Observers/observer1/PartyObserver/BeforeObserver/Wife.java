package Observers.observer1.PartyObserver.BeforeObserver;

public class Wife {
    
    private Doorman doorman;

    public Wife(Doorman doorman){
        this.doorman=doorman;
    }

    public void startPartyIfPossible(){
        if ( doorman.getStatus()){
            partyTime();
        } else {
            System.out.println("Hold...");
        }
    }

    public static void partyTime(){
        System.out.println("Party time!!");
    }

}
