package creational.factory;

public class CarFactory {
	
	public static Car buildCar(CarType carType) {
		Car car = null;
		switch (carType) {
			case SMALL -> car = new SmallCar();
			case SEDAN -> car = new SedanCar();
			case LUXURY -> car = new LuxuryCar();
			default -> System.out.println("Invalid CarType");
		}
		return car;
	}
}
