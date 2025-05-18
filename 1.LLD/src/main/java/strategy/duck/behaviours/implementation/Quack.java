package strategy.duck.behaviours.implementation;

import strategy.duck.behaviours.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack(String name) {
        System.out.println(name + " is quacking...");
    }
}
