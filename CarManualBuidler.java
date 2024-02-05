public class CarManualBuidler implements Builder{
    private CarManual carManual;

    CarManualBuidler() {
        this.reset();
    }

    @Override
    public void reset() {
        this.carManual = new CarManual();
    }

    @Override
    public void setBrand(String brand) {
        this.carManual.setBrand(brand);
    }

    @Override
    public void setSeats(int number) {
        this.carManual.setSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        this.carManual.setEngine(engine);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        this.carManual.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(String gps) {
        this.carManual.setGPS(gps);
    }

    public CarManual getResult() {
        CarManual product = this.carManual;
        this.reset();
        return product;
    }
}
