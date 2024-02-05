public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.buildSportsCar(carBuilder);
        Car sportsCar = carBuilder.getResult();
        System.out.println(sportsCar.toString());

        director.buildSUVCar(carBuilder);
        Car suvCar = carBuilder.getResult();
        System.out.println(suvCar.toString());
    }
}
