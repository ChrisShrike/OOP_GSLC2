package glasses;

abstract class Glasses{
	protected String brand;
	protected String model;
	protected double price;

	public Glasses(String brand, String model, double price){
	    this.brand = brand;
	    this.model = model;
	    this.price = price;
	}

	public void wear(){
		System.out.println("Wearing " + brand + " " + model + " glasses");
	}

	public void remove(){
		System.out.println("Removing " + brand + " " + model + " glasses");
	}

	public abstract void clean();
}
