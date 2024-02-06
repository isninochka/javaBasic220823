package lessons.lesson16;

public class Car {
    private String marka;
     private String model;

    private int maxSpeed;

    public Car (String marka, String model, int maxSpeed) {
        this.marka = marka;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    public String getMarka (){
        return marka;
    }
    public String getModel (){
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}

