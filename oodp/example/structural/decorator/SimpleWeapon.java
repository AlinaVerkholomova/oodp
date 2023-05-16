package oodp.example.structural.decorator;

import oodp.example.creational.GameCharacter;

public class SimpleWeapon implements Weapon{
    @Override
    public String execute(GameCharacter character) {
        return String.format("%s has",
                character.getCharacterDescription());
    }
}
