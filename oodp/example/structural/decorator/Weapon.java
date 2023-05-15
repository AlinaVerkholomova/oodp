package oodp.example.structural.decorator;

import oodp.example.creational.GameCharacter;

public interface Weapon {

    String attack(GameCharacter character, GameCharacter enemy);
}
