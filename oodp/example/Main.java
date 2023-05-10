package oodp.example;

import oodp.example.behavioral.DefensiveStrategy;
import oodp.example.creational.CharacterFactory;
import oodp.example.creational.CharacterIssuer;
import oodp.example.creational.CharacterType;
import oodp.example.creational.GameCharacter;
import oodp.example.structural.SimpleWeapon;
import oodp.example.structural.SpearDecorator;
import oodp.example.structural.Weapon;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<GameCharacter> gameCharacters = new LinkedList<>();

        final CharacterFactory witchCharacterFactory = CharacterFactory.createCharacterFactory(CharacterIssuer.Witch);
        final CharacterFactory warrirorCharacterFactory = CharacterFactory.createCharacterFactory(CharacterIssuer.Warrior);

        final GameCharacter witchForestCharacter = witchCharacterFactory.createCharacter(CharacterType.Forest);
        gameCharacters.add(witchForestCharacter);

        final GameCharacter warriorSeaCharacter = warrirorCharacterFactory.createCharacter(CharacterType.Sea);
        gameCharacters.add(warriorSeaCharacter);

        for (GameCharacter gameCharacter:gameCharacters){
            System.out.println(gameCharacter.getCharacterDescription());
        }

        DefensiveStrategy defensiveStrategy = new DefensiveStrategy();
        defensiveStrategy.execute(warriorSeaCharacter, witchForestCharacter);

        Weapon weapon = new SimpleWeapon();
        weapon = new SpearDecorator(weapon);

        System.out.println(weapon.attack(witchForestCharacter, warriorSeaCharacter));
    }
}
