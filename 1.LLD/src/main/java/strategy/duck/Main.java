package strategy.duck;

import strategy.duck.behaviours.implementation.FlyWithWings;
import strategy.duck.behaviours.implementation.Quack;
import strategy.duck.behaviours.implementation.Squeak;

class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setName("Mallard");
        mallardDuck.setFlyBehaviour(new FlyWithWings());
        mallardDuck.setQuackBehaviour(new Quack());

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        // Mallard and Country duck share the common fly behaviour
        // since both are childs of Duck and both share same code, to avoid duplicate code
        // we need to encapsulate what is being varied
        // for duck QuackBehavior and FlyBehaviour changes so we encapsulated it.
        Duck countryDuck = new CountryDuck();
        countryDuck.setName("Country");
        countryDuck.setFlyBehaviour(new FlyWithWings());
        countryDuck.setQuackBehaviour(new Squeak());

        countryDuck.display();
        countryDuck.performFly();
        countryDuck.performQuack();
    }
}