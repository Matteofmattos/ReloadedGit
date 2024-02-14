package Observers.observer2.Subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Observers.observer2.Observers.Observer;



public class Journalist implements Subject{

    public List<Observer> observers = new ArrayList<>();

    public Journalist(String title, String summary, String image, String text) {
        this.title = title;
        this.summary = summary;
        this.image = image;
        this.text = text;
    }

    private String title,summary,image,text;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> { 
            observer.update(this);
        });
    }

    @Override
    public String toString() {
        return "{" +
            ", title='" + getTitle() + "'" +
            ", summary='" + getSummary() + "'" +
            ", image='" + getImage() + "'" +
            ", text='" + getText() + "'" +
            "}";
    }

    
}
