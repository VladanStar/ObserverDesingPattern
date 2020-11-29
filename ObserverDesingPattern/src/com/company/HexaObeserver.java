package com.company;

public class HexaObeserver implements Observer {

    private Subject subject;

    public HexaObeserver() {
    }

    public HexaObeserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Heksadecimalni observer " + Integer.toHexString(subject.getState()));
    }
}
