package oodp.example.structural.decorator;

import oodp.example.creational.GameCharacter;

public abstract class WeaponDecorator implements Weapon{

    protected Weapon customWeapon;

    public WeaponDecorator(Weapon customWeapon) {
        this.customWeapon = customWeapon;
    }

    public String execute(GameCharacter character) {
        return customWeapon.execute(character);
    }
}
