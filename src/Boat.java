public class Boat implements MakeAndModel {
    private String color;
    private String model;

    public Boat(String model, String color){
        this.model = model;
        this.color = color;
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
}
