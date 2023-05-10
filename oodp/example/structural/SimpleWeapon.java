package oodp.example.structural;

import oodp.example.creational.GameCharacter;

public class SimpleWeapon implements Weapon{
    @Override
    public String attack(GameCharacter character, GameCharacter enemy) {
        return String.format("%s attacks %s",
                character.getCharacterDescription(),
                enemy.getCharacterDescription());
    }
}
