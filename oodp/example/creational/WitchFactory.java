package oodp.example.creational;

public class WitchFactory implements CharacterFactory {

    public GameCharacter createCharacter(CharacterType characterType) {
        switch (characterType){
            case Sea:
                return new SeaWitchGameCharacter();

            case Forest:
                return new ForestWitchGameCharacter();
            default:
                throw new RuntimeException(String.format("Unknown character type=[%s]", characterType.name()));


        }
    }
}
