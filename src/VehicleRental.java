import java.util.List;

public class VehicleRental {
    public static void main(String[] args) {
        // Create vehicles
        Vehicle car1 = new Car("656223203", "Audi", "Corolla", 100.0, "Sedan");
        Vehicle truck1 = new Truck("65689001", "Skoda", "FH16", 200.0, 3000);

        Customer customer1 = new RegularCustomer("Miriam");
        Customer customer2 = new CorporateCustomer("Ester", "TechCorp");

        customer1.rentVehicle(car1, 3); // Regular customer rents car
        customer2.rentVehicle(truck1, 5); // Corporate customer rents truck

        showRentedVehicles(customer1);
        showRentedVehicles(customer2);
    }
    public static void showRentedVehicles(Customer customer) {
        List<Vehicle> vehicles = customer.getRentedVehicles();
        System.out.println(customer.getName() + " has rented the following vehicles:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getMake() + " " + vehicle.getModel());
        }
    }
}
