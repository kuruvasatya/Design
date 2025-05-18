package strategy.duck.behaviours.implementation;

import strategy.duck.behaviours.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly(String name) {
        System.out.println(name+ "is flying with wings..");
    }
}
