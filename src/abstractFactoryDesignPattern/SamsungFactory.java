package abstractFactoryDesignPattern;

public class SamsungFactory implements AbstractFactory {

	@Override
	public Phone createPhone(String brand, String model, int price) {
		return new SamsungPhone(brand, model, price);
	}

	@Override
	public Watch createWatch(String brand, String model, int price) {
		return new SamsungWatch(brand, model, price);
	}

}
