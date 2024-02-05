public class Director {
    public void buildSportsCar(Builder builder) {
        builder.setBrand("Porsche 911");
        builder.setSeats(4);
        builder.setEngine("3.8-litre twin-turbo");
        builder.setTripComputer("*displays car info*");
        builder.setGPS("*displays position*");
    }

    public void buildSUVCar(Builder builder) {
        builder.setBrand("Toyota Fortuner");
        builder.setSeats(7);
        builder.setEngine("GR Sport 2,8 L 4x4 AT");
        builder.setTripComputer("*displays car info*");
        builder.setGPS("*displays position*");
    }
}
