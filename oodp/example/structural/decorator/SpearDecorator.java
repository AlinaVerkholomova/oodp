package oodp.example.structural.decorator;

import oodp.example.creational.GameCharacter;

public class SpearDecorator extends WeaponDecorator{
    public SpearDecorator(Weapon customWeapon) {
        super(customWeapon);
    }

    public String attack(GameCharacter character, GameCharacter enemy){

        return customWeapon.attack(character, enemy) + spear();
    }

    private String spear() {
        return " with spear!";
    }
}
