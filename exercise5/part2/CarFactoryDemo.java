package FifthExercise;

/**
 * Created by Admin on 09.11.2016.
 */
public class CarFactoryDemo {

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car car;
        car = factory.buildCar(CarType.HATCHBACK);
        car.build();
        car = factory.buildCar(CarType.SEDAN);
        car.build();
        car = factory.buildCar(CarType.WAGON);
        car.build();
    }
}
