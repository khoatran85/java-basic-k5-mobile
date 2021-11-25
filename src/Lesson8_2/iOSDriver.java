package Lesson8_2;

import java.sql.Driver;

public class iOSDriver extends MobileDriver {

    @Override
    protected void initDriver() {
        System.out.println("Initializing iosDriver");
    }
}
