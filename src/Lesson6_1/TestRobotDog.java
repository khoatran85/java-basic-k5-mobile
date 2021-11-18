package Lesson6_1;

import Lesson6.SolarEnergyRobotCat;

public class TestRobotDog {
    public static void main(String[] args) {
        BatteryRobotDog robotDog1 = new BatteryRobotDog();
        SolarRobotDog solarRobotDog = new SolarRobotDog();
        System.out.println("ID = " + robotDog1.getDofId());
//        System.out.println("ID = " + solarRobotDog.getDofId());
        System.out.println(robotDog1.getDefaultName());
//        System.out.println(robotDog2.getDefaultName());
    }

}