package oodp.example.structural.decorator;

import oodp.example.creational.GameCharacter;

public class SpearDecorator extends WeaponDecorator{
    public SpearDecorator(Weapon customWeapon) {
        super(customWeapon);
    }

    public String execute(GameCharacter character){

        return customWeapon.execute(character) + spear();
    }

    private String spear() {
        return " a spear";
    }
}
