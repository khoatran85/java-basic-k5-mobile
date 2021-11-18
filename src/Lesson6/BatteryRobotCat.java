package Lesson6;

public class BatteryRobotCat extends RobotCat{
    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }


    private String batteryType;

    @Override
    public String charge() {
        return super.charge() + " with solar energy";
    }
}
