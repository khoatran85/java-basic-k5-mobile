package Lesson7;

public class HouseBuilder {

    private String color = "white";
    private int mainDoors = 1;
    private String topRoofColor;

    public HouseBuilder() {
    }

    private HouseBuilder(Builder builder) {
        color = builder.color;
        mainDoors = builder.mainDoors;
        topRoofColor = builder.topRoofColor;
    }

    public String getColor() {
        return color;
    }

    public int getMainDoors() {
        return mainDoors;
    }

    public String getTopRoofColor() {
        return topRoofColor;
    }

    // Customer Service | Inner Class

    public static class Builder {

        private String color = "white";
        private int mainDoors = 1;
        private String topRoofColor;

//        Method chaining
        public Builder withColor(String color) {
            this.color = color;
            return this;
        }
//        public void withColor(String color) {
//            this.color = color;
//        }

        public Builder doorNumbers(int mainDoors) {
            this.mainDoors = mainDoors;
            return this;
        }
//        public void doorNumbers(int mainDoors) {
//            this.mainDoors = mainDoors;
//        }

        public Builder withTopRoofColor(String topRoofColor) {
            this.topRoofColor = topRoofColor;
            return this;
        }
//        public void withTopRoofColor(String topRoofColor) {
//            this.topRoofColor = topRoofColor;
//        }

        public HouseBuilder build() {
            return new HouseBuilder(this);
        }


    }

}
