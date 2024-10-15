public class CorporateCustomer extends RegularCustomer{
    private String companyName;

    public CorporateCustomer(String name, String companyName) {
        super(name);
        this.companyName = companyName;
    }
    @Override
    public void rentVehicle(Vehicle vehicle, int days) {
        double discount = 0.1;
        double originalCost = vehicle.calculateRentalCost(days);
        double discountedCost = originalCost * (1 - discount);
        System.out.println(getName() + " from " + companyName + " rented " + vehicle.getMake() + " " + vehicle.getModel() + " for " + days + " days. Discounted cost: " + discountedCost);
        super.getRentedVehicles().add(vehicle);
    }
    public String getCompanyName() {
        return companyName;
    }
}
