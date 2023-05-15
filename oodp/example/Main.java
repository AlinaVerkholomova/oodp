package oodp.example;

import oodp.example.behavioral.DefensiveStrategy;
import oodp.example.creational.CharacterFactory;
import oodp.example.creational.CharacterIssuer;
import oodp.example.creational.CharacterType;
import oodp.example.creational.GameCharacter;
import oodp.example.structural.decorator.SimpleWeapon;
import oodp.example.structural.decorator.SpearDecorator;
import oodp.example.structural.decorator.Weapon;
import oodp.example.structural.facade.CharacterFacade;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* creational pattern abstract factory
            defining list of game characters
         */
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

        // behavioral pattern strategy
        DefensiveStrategy defensiveStrategy = new DefensiveStrategy();
        defensiveStrategy.execute(warriorSeaCharacter, witchForestCharacter);

        // structural pattern decorator
        Weapon weapon = new SimpleWeapon();
        weapon = new SpearDecorator(weapon);

        System.out.println(weapon.attack(witchForestCharacter, warriorSeaCharacter));

        // structural pattern facade
        CharacterFacade characterFacade = new CharacterFacade();
        characterFacade.customizeCharacter(witchForestCharacter);
        characterFacade.learnSpell(witchForestCharacter);
        characterFacade.castSpell(witchForestCharacter);

    }
}
