package oodp.example.structural.facade;

import oodp.example.creational.GameCharacter;

public class CharacterFacade {
    private CharacterCustomization customization;
    private Magic magic;

    public CharacterFacade() {
        this.customization = new CharacterCustomization();
        this.magic = new Magic();
    }

    public void customizeCharacter(GameCharacter character) {
        customization.customizeAppearance(character);
        customization.equipArmor(character, "Plate");
    }

    public void learnSpell(GameCharacter character) {
        magic.learnSpell(character, "Fireball");
    }

    public void castSpell(GameCharacter character) {
        magic.castSpell(character, "Fireball");
    }
}
