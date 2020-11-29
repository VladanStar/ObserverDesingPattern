package com.company;

public class BinaryObserver implements Observer {

   private Subject subject;

    public BinaryObserver() {
    }

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Broj u binarnom obliku " + Integer.toBinaryString(subject.getState()));

    }
}
