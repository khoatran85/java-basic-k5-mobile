package Lesson9_1;

public class MIniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
           mallardDuck.performFly();
           mallardDuck.performQuack();

           mallardDuck.disableFlyAbilities();
           mallardDuck.performFly();

    }
}
