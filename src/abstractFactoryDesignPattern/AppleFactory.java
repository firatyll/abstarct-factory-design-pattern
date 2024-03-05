package abstractFactoryDesignPattern;

public class AppleFactory implements AbstractFactory {

	@Override
	public Phone createPhone(String brand, String model, int price) {
		return new ApplePhone(brand, model, price);
	}

	@Override
	public Watch createWatch(String brand, String model, int price) {
		return new AppleWatch(brand, model, price);
	}

}
