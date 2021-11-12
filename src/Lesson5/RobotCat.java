package Lesson5;

//User-defind class
public class RobotCat {

    private String name; //default = null

    // constructor ko doi so
    public RobotCat() {
    }

    // constructor co doi so
    public RobotCat(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return this.name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    //Access Modifier | return type | Method name | () {....}
    public void run() {
        System.out.println("Running...");
    }

    public int getMaxValue() {
        return 20;
    }

    //Speed: parameter
    public void runWithSpeed(int speed) {
        if (speed > 20) return; // => return : thoat ra khoi method
        else
            System.out.println("Run with speed: " + speed);
    }


}
