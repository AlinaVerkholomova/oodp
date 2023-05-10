package oodp.example.creational;

public class SeaWitchGameCharacter implements SeaGameCharacter {

    @Override
    public CharacterType getCardType() {
        return CharacterType.Sea;
    }

    @Override
    public CharacterIssuer getCharacterIssuer() {
        return CharacterIssuer.Witch;
    }

    @Override
    public String getCharacterDescription() {
        return "Sea Witch";
    }
}
