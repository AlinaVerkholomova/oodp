package oodp.example.structural;

import oodp.example.creational.GameCharacter;

public interface Weapon {

    String attack(GameCharacter character, GameCharacter enemy);
}
