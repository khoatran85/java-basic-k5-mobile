package LAB9;

public class Tiger extends Animal{

    private String name = "Tiger";
    private boolean isFlyable = false;
    private int maxSpeed = 80;
    int randomSpeed = getSpeed(maxSpeed);

    @Override
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isFlyable() {
        return isFlyable;
    }

    @Override
    int getSpeed() {
        return randomSpeed;
    }

//
//    @Override
//    public int getRandomSpeed() {
//        this.randomSpeed =  new SecureRandom().nextInt(maxSpeed);
//        return randomSpeed;
//    }
}
