package oodp.example.behavioral;

import oodp.example.creational.GameCharacter;

public class DefensiveStrategy implements CombatStrategy {
    @Override
    public void execute(GameCharacter character, GameCharacter enemy) {
        System.out.println(character.getCharacterDescription() + " is choosing defensive strategy against " + enemy.getCharacterDescription());
    }
}
