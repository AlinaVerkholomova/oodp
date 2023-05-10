package oodp.example.creational;

import oodp.example.creational.CharacterType;
import oodp.example.creational.GameCharacter;

public interface SeaGameCharacter extends GameCharacter {

    default CharacterType getCharacterType() {
        return CharacterType.Sea;
    }
}
