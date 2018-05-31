public class Car implements Driveable, MakeAndModel{

    private double speed;
    private int wheels;
    private String color;
    private String model;

    public Car(String model, String color, int wheels, double speed){
        this.model = model;
        this.color = color;
        this.wheels = wheels;
        this.speed = speed;
    }

    @Override
    public int getWheels() {
        return wheels;
    }

    @Override
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }
}
