package Observers.observer2;

import Observers.observer2.Observers.NewsPaper;
import Observers.observer2.Observers.TV;
import Observers.observer2.Subject.Journalist;

public class Teste2 {
    public static void main(String[] args) {
        Journalist journalist = new Journalist("Der King der Lowe", "6615", "image.png","texto1.txt");

        NewsPaper newsPaper = new NewsPaper();
        TV tv = new TV();

        journalist.addObserver(newsPaper);
        journalist.addObserver(tv);

        journalist.notifyObservers();
    }
}
