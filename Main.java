package com.company;

import com.lab.Character;
import com.lab.Warlock;
import com.lab.Wizard;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks\n");

        Wizard Aries = new Wizard("Aries", 15, 150, 200);
        Warlock Draco = new Warlock("Draco", 10, 100, 150);
        Aries.nameDisplay();
        Draco.nameDisplay();

        Aries.hailStorm(Draco);
        Aries.showStats();
        Draco.showStats();

        Draco.maelStorm(Aries);
        Aries.showStats();
        Draco.showStats();

        Aries.healSpell();
        Aries.showStats();
        Draco.showStats();

        Draco.fireBall(Aries);
        Aries.showStats();
        Draco.showStats();

        Aries.kulam(Draco);
        Aries.levelUp();
    }
}
