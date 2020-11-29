package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Subject subject = new Subject();
        Observer hex = new HexaObeserver(subject);
        Observer bin = new BinaryObserver(subject);
        Observer oct = new OctalObserver(subject);
        System.out.println("Promena");
        subject.setState(15);
        System.out.println("Promena");
        subject.setState(5550);
        System.out.println("Promena");
        subject.setState(3000);

    }
}
