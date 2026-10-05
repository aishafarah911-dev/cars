package Assignment;

public class Car {

    private String plateNumber;
    private String carModel;
    private double dailyRate;
    private boolean rent;

    // Static members
    public final static String companyName = "JUST Rentals";
    public static int totalCars = 0;

    //  Constructor
    public Car() {
        plateNumber = "UNKNOWN";
        carModel = "UNKNOWN";
        dailyRate = 0.0;
        rent = false;
        totalCars++;
    }

    // Parameter constructor
    public Car(String plateNumber, String carModel, double dailyRate, boolean rent) {
        this.plateNumber = plateNumber;
        this.carModel = carModel;

        if (dailyRate >= 0)
            this.dailyRate = dailyRate;
        else
            this.dailyRate = 0;

        this.rent = rent;
        totalCars++;
    }

    // Getters
    public String getPlateNumber() {
        return plateNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public boolean isRent() {
        return rent;
    }

    // Setter
    public void setDailyRate(double dailyRate) {
        if (dailyRate >= 0)
            this.dailyRate = dailyRate;
    }

    // Rent
    public void rent() {
        if (rent) {
            System.out.println("Car is already rented.");
        } else {
            rent = true;
            System.out.println("Car rented successfully.");
        }
    }

    // Return
    public void returnCar() {
        rent = false;
        System.out.println("Car is returned.");
    }

    // Display
    public void displayInfo() {
        System.out.println("Plate: " + plateNumber);
        System.out.println("Model: " + carModel);
        System.out.println("Rate: " + dailyRate);
        System.out.println("Rented: " + rent);
    }

    // Static methods
    public static void showCompany() {
        System.out.println("Company: " + companyName);
    }

    public static void showTotalCars() {
        System.out.println("Total Cars: " + totalCars);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        // Create two cars
        Car car1 = new Car();
        Car car2 = new Car("123456", "parada", 60, false);

        // Display information
        car1.displayInfo();
        System.out.println();

        car2.displayInfo();
        System.out.println();

        // Rent car
        car2.rent();

        // Try to rent again
        car2.rent();

        // Return car
        car2.returnCar();

        // Change daily rate
        car2.setDailyRate(60);

        // Display again
        car2.displayInfo();

        // Company and total cars
        showCompany();
        showTotalCars();
    }
}
