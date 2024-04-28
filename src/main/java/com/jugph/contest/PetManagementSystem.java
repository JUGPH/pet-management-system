/**
 * MIT License
 * Copyright (c) 2024 Tristan Mahinay
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * <p>
 * pet-management-system
 *
 * @author rjtmahinay
 * 2024
 */
package com.jugph.contest;

import com.jugph.contest.domain.Owner;
import com.jugph.contest.domain.Pet;
import com.jugph.contest.domain.pets.Cat;
import com.jugph.contest.domain.pets.Dog;
import com.jugph.contest.domain.pets.Piglet;

public class PetManagementSystem {

    public static void main(String[] args) {

        /*
         * This is the main class. This will be used for printing the results.
         */

        Pet dog = new Dog("Eloy");
        Pet cat = new Cat("Ming ming");
        Pet piglet = new Piglet("Ton ton");

        Owner owner1 = new Owner("Miguel");
        owner1.addPet(dog);
        owner1.addPet(cat);

        Owner owner2 = new Owner("Luka");
        owner1.addPet(dog);
        owner1.addPet(piglet);
        owner1.addPet(cat);

        dog.play();
        cat.feed();
        piglet.play();
        piglet.feed();

        System.out.println("Owner: " + owner1.getName());
        System.out.println("Owner: " + owner2.getName());

        for (Pet pet: owner1.getPets()) {
            System.out.println("Pet: " + pet.getName() + "\nType: " + pet.getType() + "\nMood: " + pet.getMood() +"\n");
            pet.talk();
            pet.walk();
        }

        for (Pet pet: owner2.getPets()) {
            System.out.println("Pet: " + pet.getName() + "\nType: " + pet.getType() + "\nMood: " + pet.getMood() + "\n");
            pet.talk();
            pet.walk();
        }

    }
}
