public class Truck extends Vehicle{
    private int capacity;

    public Truck(String licensePlate, String make, String model, double rentalPrice, int capacity) {
        super(licensePlate, make, model, rentalPrice);
        this.capacity = capacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (rentalPrice * days) + (capacity * 0.5);
    }
    public int getCapacity() {
        return capacity;
    }
}
