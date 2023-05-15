package oodp.example.behavioral.command;

import oodp.example.creational.GameCharacter;
import oodp.example.structural.decorator.Weapon;

public class AttackCommand implements Command {
    private final GameCharacter character;

    private final GameCharacter enemy;
    private final Weapon weapon;

    public AttackCommand(GameCharacter character, GameCharacter enemy, Weapon weapon) {
        this.character = character;
        this.enemy = enemy;
        this.weapon = weapon;
    }

    @Override
    public void execute() {
        String result = weapon.execute(character);
        System.out.println(result + " and attacks " + enemy.getCharacterDescription());
    }
}