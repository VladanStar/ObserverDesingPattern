package com.company;

import javax.swing.*;

public class OctalObserver implements Observer {
    private Subject subject;

    public OctalObserver() {
    }

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Oktalni observer " + Integer.toOctalString(subject.getState()));

    }
}
