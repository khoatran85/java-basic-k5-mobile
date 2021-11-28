package Lesson9_1;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void disableFlyAbilities() {
        flyBehaviour = new FlyNoWay();
    }
}
