package com.jugph.contest.domain.pets;

import com.jugph.contest.domain.Pet;

public class Cat extends Pet {

    public Cat(String name) {
        super(name, "Cat");
    }

    @Override
    public void play() {
        System.out.println(getName() + "the cat is playing...");
        setMood("Happy");
    }

    @Override
    public void feed() {
        System.out.println(getName() + "the cat is being fed...");
        setMood("Happy");
    }

    @Override
    public void talk() {
        System.out.println(getName() + " says meow");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " is walking...");
    }


}
