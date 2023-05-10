package oodp.example.creational;

public class ForestWitchGameCharacter implements ForestGameCharacter {

    @Override
    public CharacterType getCardType() {
        return CharacterType.Forest;
    }

    @Override
    public CharacterIssuer getCharacterIssuer() {
        return CharacterIssuer.Witch;
    }

    @Override
    public String getCharacterDescription() {
        return "Forest Witch";
    }
}
