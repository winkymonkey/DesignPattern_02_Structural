package decorator;


public class LuxuryCar extends CarDecorator {
	LuxuryCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println(" Add feature of Luxury Car");
	}
}

