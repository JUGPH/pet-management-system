package com.jugph.contest.domain.pets;

import com.jugph.contest.domain.Pet;

public class Dog extends Pet {

    public Dog(String name) {
        super(name, "Dog");
    }

    @Override
    public void play() {
        System.out.println(getName() + "the dog is playing...");
        setMood("Happy");
    }

    @Override
    public void feed() {
        System.out.println(getName() + "the dog is being fed...");
        setMood("Happy");
    }

    @Override
    public void talk() {
        System.out.println(getName() + " says Aw aw");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " is Walking...");
    }


}
