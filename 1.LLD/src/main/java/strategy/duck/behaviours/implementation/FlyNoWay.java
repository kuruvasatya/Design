package strategy.duck.behaviours.implementation;

import strategy.duck.behaviours.FlyBehaviour;

class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly(String name) {
        System.out.println(name + " cannot fly..lol");
    }
}
