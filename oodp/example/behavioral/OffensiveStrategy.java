package oodp.example.behavioral;

import oodp.example.creational.GameCharacter;

public class OffensiveStrategy implements CombatStrategy {
    @Override
    public void execute(GameCharacter character, GameCharacter enemy) {
        System.out.println(character.getCharacterDescription() + " is choosing attacking strategy against "
                + enemy.getCharacterDescription());
    }
}
