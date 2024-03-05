package abstractFactoryDesignPattern;

public class Main {

	public static void main(String[] args) {
		AbstractFactory appleFactory = new AppleFactory();
		AbstractFactory samsungFactory = new SamsungFactory();

		Phone iphone11 = appleFactory.createPhone("apple", "11", 25000);
		Watch appleWacthGen7 = appleFactory.createWatch("apple", "gen7", 7000);

		Phone samsungGalaxy = samsungFactory.createPhone("samsung", "galaxy", 25000);
		Watch galaxyWacth = samsungFactory.createWatch("samsung", "galaxy watch", 7000);
		
		System.out.println("---Apple Products---");
		System.out.println("Iphone:");
		iphone11.showPhoneInfo();
		System.out.println("Watch:");
		appleWacthGen7.showWatchInfo();
		System.out.println("---Samsung Products---");
		System.out.println("Samsung Galaxy Phone");
		samsungGalaxy.showPhoneInfo();
		System.out.println("Galaxy Watch");
		galaxyWacth.showWatchInfo();
	}

}
