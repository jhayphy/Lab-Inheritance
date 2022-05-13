package com.lab;

public class Warlock extends Character{
    public Warlock(String name, int newLevel, int newHealth, int newMana){
        super(name,newLevel,newHealth,newMana);
    }
    public void maelStorm(Character enemyCharacter) {
        int damagePoints = 50;
        int manaCost = 30;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with maelStorm (Damage - 50)");
        damageTarget(enemyCharacter, damagePoints);
    }
    public void fireBall(Character enemyCharacter){
        int damagePoints = 70;
        int manaCost = 45;
        manaPoints -= manaCost;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with fireBall (Damage - 70)");
        damageTarget(enemyCharacter, damagePoints);
    }
    public void healthRegen(){
        int heal=80;
        int manaRegen=60;

        healthPoints += heal;
        manaPoints += manaRegen;

        System.out.println(super.characterName +" use Spell Regen (Health +"+ heal +")" + " (Mana +"+ manaRegen +")");
    }

}