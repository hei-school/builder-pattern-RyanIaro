public class Car {
    private String brand;
    private int seats;
    private String engine;
    private String tripComputer;
    private String GPS;

    Car() {
    }
    
    public String getBrand() {
        return this.brand;
    }

    public int getSeats() {
        return this.seats;
    }

    public String getEngine() {
        return this.engine;
    }

    public String getTripComputer() {
        return this.tripComputer;
    }

    public String getGPS() {
        return this.GPS;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPS(String gps) {
        GPS = gps;
    }

    @Override
    public String toString() {
        return "Car: {brand: " + this.brand + ",seats: " + this.seats + ",engine: " + this.engine + ",trip computer: " + this.tripComputer + ",GPS: " + this.GPS + "}";
    }
}
