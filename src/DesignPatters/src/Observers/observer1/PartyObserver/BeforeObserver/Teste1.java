package Observers.observer1.PartyObserver.BeforeObserver;

public class Teste1 {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();
        Wife wife = new Wife(doorman);

        wife.startPartyIfPossible();

        System.out.println("5 minutes later...");
        wife.startPartyIfPossible();

        System.out.println("10 minutes later...");
        wife.startPartyIfPossible();

        System.out.println("15 minutes later...");
        wife.startPartyIfPossible();

        System.out.println("20 minutes later...Husband is coming!");
        doorman.setStatus(true);
        wife.startPartyIfPossible();
    }
    
}
