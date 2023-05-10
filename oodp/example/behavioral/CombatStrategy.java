package oodp.example.behavioral;

import oodp.example.creational.GameCharacter;

public interface CombatStrategy {
    void execute(GameCharacter character, GameCharacter enemy);
}
