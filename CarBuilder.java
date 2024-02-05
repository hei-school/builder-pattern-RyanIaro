public class CarBuilder implements Builder{
    private Car car;

    CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setBrand(String brand) {
        this.car.setBrand(brand);
    }

    @Override
    public void setSeats(int number) {
        this.car.setSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        this.car.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(String gps) {
        this.car.setGPS(gps);
    }
    
    public Car getResult(){
        Car product = this.car;
        this.reset();
        return product;
    }
}
