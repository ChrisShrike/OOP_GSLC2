package glasses;

class ComputerGlasses extends Glasses{
    public ComputerGlasses(String brand, String model, double price){
        super(brand, model, price);
    }

    public void clean(){
        System.out.println("Cleaning the lenses of " + brand + " " + model + " computer glasses");
    }
}
