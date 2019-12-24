package com.css.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>(3);
    private int state;

    public void notifyAllObservers () {
        for (int i = 0; i < observers.size(); i ++) {
            Observer observer = observers.get(i);
            observer.update();
        }
    }

    public void attach (Observer observer) {
        observers.add(observer);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
}
