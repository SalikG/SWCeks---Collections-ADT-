public class Vehicle extends CrashAble implements Driveable, MakeAndModel{

    //denne klasse implementer opførslen fra Drivable og MakeAndModel interfaces og definere implemtationens detaljer.
    private double speed;
    private int wheels;
    private String color;
    private String model;
    private int strength;

    public Vehicle(String model, String color, int wheels, double speed){
        this.model = model;
        this.color = color;
        this.wheels = wheels;
        this.speed = speed;
    }

    @Override
    public int getWheels() {
        return this.wheels;
    }

    @Override
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public double getSpeed() {
        return this.speed;
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
        return this.color;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public void setVehicleStrength(int vehicleStrength) {
        this.strength = vehicleStrength;
    }

    @Override
    public int getVehicleStrength() {
        return this.strength;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", strength=" + strength +
                ", vehicleDriveable=" + vehicleDriveable +
                '}';
    }
}
