package glasses;

class Sunglasses extends Glasses{
	public Sunglasses(String brand, String model, double price){
        super(brand, model, price);
    }

    public void clean(){
        System.out.println("Cleaning the lenses of " + brand + " " + model + " sunglasses");
    }
}
