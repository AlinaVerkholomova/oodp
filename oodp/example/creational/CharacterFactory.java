package oodp.example.creational;

public interface CharacterFactory {

    GameCharacter createCharacter(CharacterType characterType);

    static CharacterFactory createCharacterFactory(CharacterIssuer characterIssuer) {
        switch (characterIssuer) {
            case Warrior:
                return new WarriorFactory();
            case Witch:
                return new WitchFactory();
            default:
                throw new RuntimeException(String.format("Unknown character type=[%s]", characterIssuer.name()));

        }
    }
}
