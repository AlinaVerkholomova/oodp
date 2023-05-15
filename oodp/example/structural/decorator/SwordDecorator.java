package oodp.example.structural.decorator;

import oodp.example.creational.GameCharacter;

public class SwordDecorator extends WeaponDecorator{
    public SwordDecorator(Weapon customWeapon) {
        super(customWeapon);
    }

    public String attack(GameCharacter character, GameCharacter enemy){
        return customWeapon.attack(character, enemy) + sword();
    }

    private String sword() {
        return " with sword!";
    }
}
