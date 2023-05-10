package oodp.example.creational;

public class ForestWarriorGameCharacter implements ForestGameCharacter {

    @Override
    public CharacterType getCardType() {
        return CharacterType.Forest;
    }

    @Override
    public CharacterIssuer getCharacterIssuer() {
        return CharacterIssuer.Warrior;
    }

    @Override
    public String getCharacterDescription() {
        return "Forest Warrior";
    }
}
