package glasses;

class SafetyGlasses implements Wearable{
    private String brand;
    private String model;

    public SafetyGlasses(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void wear(){
        System.out.println("Wearing " + brand + " " + model + " safety glasses");
    }

    public void remove(){
        System.out.println("Removing " + brand + " " + model + " safety glasses");
    }
}
