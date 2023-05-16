package oodp.example.structural.decorator;

import oodp.example.creational.GameCharacter;

public class SwordDecorator extends WeaponDecorator{
    public SwordDecorator(Weapon customWeapon) {
        super(customWeapon);
    }

    public String execute(GameCharacter character){
        return customWeapon.execute(character) + sword();
    }

    private String sword() {
        return " a sword";
    }
}
