package Fightable;

import Ninja.Ninja;

public interface Fightable<T> {
    boolean fight(T other);

    boolean fight(Ninja other);

    boolean isAlive();
}