package oodp.example.structural.facade;

import oodp.example.creational.GameCharacter;

public class Magic {

    public void learnSpell(GameCharacter character, String spell) {
        System.out.println(character.getCharacterDescription() + " is learning the spell: " + spell);
    }

    public void castSpell(GameCharacter character, String spell) {
        System.out.println(character.getCharacterDescription() + " is casting the spell: " + spell);
    }
}
