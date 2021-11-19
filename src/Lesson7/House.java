package Lesson7;

public class House {

    private String color = "white";
    private int mainDoors;
    private String topRoof;

    public House(String color) {
        this.color = color;
    }

    public House(int mainDoors) {
        this.mainDoors = mainDoors;
    }

    public House(String color, String topRoof) {
        this.color = color;
        this.topRoof = topRoof;
    }

    public House(String color, int mainDoors, String topRoofColor) {
        if (color != null)
            this.color = color;
        if (mainDoors > 0)
            this.mainDoors = mainDoors;
        if (topRoofColor != null)
            this.topRoof = topRoofColor;
    }


    public static void main(String[] args) {
        House house1 = new House(null,2,"Blue");
        House house2 = new House("Blue",0,null);

    }

}
