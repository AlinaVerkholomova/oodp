package oodp.example.creational;

public interface ForestGameCharacter extends GameCharacter {

    default CharacterType getCharacterType() {
        return CharacterType.Forest;
    }
}
