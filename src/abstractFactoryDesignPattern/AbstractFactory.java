package abstractFactoryDesignPattern;

public interface AbstractFactory {
	Phone createPhone(String brand, String model, int price);

	Watch createWatch(String brand, String model, int price);
}
