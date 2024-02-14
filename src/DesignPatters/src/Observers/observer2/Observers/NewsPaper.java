package Observers.observer2.Observers;

import Observers.observer2.Subject.Journalist;
import Observers.observer2.Subject.Subject;

public class NewsPaper implements Observer{

    @Override
    public void update(Subject subject) {
        if ( subject instanceof Journalist){
            System.out.println("Recebendo notificação de Journalist to NewsPaper.");
            System.out.println(subject.toString());
        }
    }
    
}
