package glasses;

class ReadingGlasses extends Glasses{
    public ReadingGlasses(String brand, String model, double price){
        super(brand, model, price);
    }

    public void clean(){
        System.out.println("Cleaning the lenses of " + brand + " " + model + " reading glasses");
    }
}