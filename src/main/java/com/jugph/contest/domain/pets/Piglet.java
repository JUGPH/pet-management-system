package com.jugph.contest.domain.pets;

import com.jugph.contest.domain.Pet;

public class Piglet extends Pet {

    public Piglet(String name) {
        super(name, "Dog");
    }

    @Override
    public void play() {
        System.out.println(getName() + " the piglet is playing...");
        setMood("Happy");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " the piglet is being fed...");
        setMood("Happy");
    }

    @Override
    public void talk() {
        System.out.println(getName() + " says oink oink");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " is walking...");
    }


}
