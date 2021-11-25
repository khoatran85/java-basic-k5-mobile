package Lesson8_2;

public class DriverFactory {

    public static MobileDriver getDriver() {
        String platform = System.getenv("platform");
        if(platform.toLowerCase().equals("ios"))
            return new iOSDriver();
        else if(platform.toLowerCase().equals("android"))
            return new androidDriver();
        else
            throw new IllegalArgumentException("not support");
    }

    public static void main(String[] args) {
        MobileDriver driver = DriverFactory.getDriver();
        driver.initDriver();
    }

}
