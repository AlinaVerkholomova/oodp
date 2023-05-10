package oodp.example.creational;

public class SeaWarriorGameCharacter implements SeaGameCharacter {

    @Override
    public CharacterType getCardType() {
        return CharacterType.Sea;
    }

    @Override
    public CharacterIssuer getCharacterIssuer() {
        return CharacterIssuer.Warrior;
    }

    @Override
    public String getCharacterDescription() {
        return "Sea Warrior";
    }
}
