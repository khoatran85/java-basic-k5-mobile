package Lesson6;

public class TestRobotCat {

    public static void main(String[] args) {
        RobotCat batterRobotCat = new BatteryRobotCat();
        batterRobotCat.setName("batteryRobotCat");
        batterRobotCat.setProductionDate("11/16/2021");
        System.out.println(batterRobotCat);
        System.out.println(batterRobotCat.charge());

        RobotCat solarEnergyRobotCat = new SolarEnergyRobotCat();
        solarEnergyRobotCat.setName("solarEnergyRobotCat");
        solarEnergyRobotCat.setProductionDate("11/17/2021");
        System.out.println(solarEnergyRobotCat);
        System.out.println(solarEnergyRobotCat.charge());
    }
}
