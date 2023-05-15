package oodp.example.structural.facade;

import oodp.example.creational.GameCharacter;

public class CharacterCustomization {

    public void customizeAppearance(GameCharacter character) {
        System.out.println("Customizing appearance for " + character.getCharacterDescription());
    }

    public void equipArmor(GameCharacter character, String armorType) {
        System.out.println("Equipping " + armorType + " armor for " + character.getCharacterDescription());
    }
}
