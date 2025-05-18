package strategy.duck.behaviours.implementation;

import strategy.duck.behaviours.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack(String name) {
        System.out.println(name + " is squeaking....");
    }
}
