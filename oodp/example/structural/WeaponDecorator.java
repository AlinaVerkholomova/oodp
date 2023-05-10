package oodp.example.structural;

import oodp.example.creational.GameCharacter;

public abstract class WeaponDecorator implements Weapon{

    protected Weapon customWeapon;

    public WeaponDecorator(Weapon customWeapon) {
        this.customWeapon = customWeapon;
    }

    public String attack(GameCharacter character, GameCharacter enemy) {
        return customWeapon.attack(character, enemy);
    }
}
