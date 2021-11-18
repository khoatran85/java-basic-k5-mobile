package Lesson6_1;

public class RobotDog {

    //SHARED
    protected static int dofId = 0;
    protected static String defaultName = "Robot Dog";
    public RobotDog() {
        dofId++;
    }

    protected int getDofId(){
        return dofId;
    }

    public static String getDefaultName(){
        return defaultName;
    }
}
