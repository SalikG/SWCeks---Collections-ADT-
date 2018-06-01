import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Volvo", "Black", 4, 200);
        Vehicle motorcycle1 = new Vehicle("Kawasaki", "Red", 2, 400);
        Vehicle motorcycle2 = new Vehicle("Honda", "Blue", 2, 400);
        car.setVehicleStrength(1000);
        motorcycle1.setVehicleStrength(5);
        motorcycle2.setVehicleStrength(6);

        
        Map<String, Vehicle> vehicleMap = new HashMap<>();

        vehicleMap.put(car.getModel(), car);
        vehicleMap.put(motorcycle1.getModel(), motorcycle1);
        vehicleMap.put(motorcycle2.getModel(), motorcycle2);

        vehicleMap.get(motorcycle2.getModel()).youCrashed();

        vehicleMap.equals();

        for(Map.Entry<String, Vehicle> vehicleEntry  : vehicleMap.entrySet()){
            if (vehicleEntry.getKey().contains("Volvo")){
                System.out.print("This is a almost a TANK!!  -->  ");
            }
            System.out.println(vehicleEntry + "\n");
        }
    }
}
