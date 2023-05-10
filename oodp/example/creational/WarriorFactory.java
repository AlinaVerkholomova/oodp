package oodp.example.creational;

public class WarriorFactory implements CharacterFactory {

    public GameCharacter createCharacter(CharacterType characterType) {
        switch (characterType){
            case Sea:
                return new SeaWarriorGameCharacter();
            case Forest:
                return new ForestWarriorGameCharacter();
            default:
                throw new RuntimeException(String.format("Unknown character type=[%s]", characterType.name()));


        }
    }
}
