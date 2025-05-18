package strategy.duck;

import strategy.duck.behaviours.FlyBehaviour;
import strategy.duck.behaviours.QuackBehaviour;

abstract class Duck {
    private String name;
    private QuackBehaviour quackBehaviour;
    private FlyBehaviour flyBehaviour;

    public abstract void display();
    public void swim() {
        System.out.println(this.name + " is swimming..");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void performFly() {
        this.flyBehaviour.fly(name);
    }
    public void performQuack() {
        this.quackBehaviour.quack(name);
    }
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
