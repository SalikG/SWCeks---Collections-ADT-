import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Volvo", "Black", 4, 200);
        Vehicle motorcycle1 = new Vehicle("Kawasaki", "Red", 2, 400);
        Vehicle motorcycle2 = new Vehicle("Kawasaki", "Blue", 2, 400);

        Boat boat1 = new Boat("Crownline", "White");

        car.setVehicleStrength(10);
        System.out.println(car.getVehicleStrength());

        Stack<Vehicle> vehicles = new Stack<>();

        vehicles.push(car);
        vehicles.push(motorcycle1);
        vehicles.push(motorcycle2);
        vehicles.push(car);

        System.out.println("Stack size: " + vehicles.size());

        System.out.println("What is on top: " + vehicles.peek());

        //ctrl + z
        //Browser history back
        vehicles.pop();

        System.out.println("What is on top after pop: " + vehicles.peek());
        System.out.println("Stack size: " + vehicles.size());

        //ctrl + shift + z
        //Browser history forward
        vehicles.push(car);

        System.out.println("What is on top after push: " + vehicles.peek());
        System.out.println("Stack size: " + vehicles.size());
        System.out.println("Position of motorcycle1 from top and down: " + vehicles.search(motorcycle1));
    }
}
