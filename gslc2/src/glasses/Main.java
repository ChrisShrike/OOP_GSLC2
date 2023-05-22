package glasses;

public class Main{
	public static void main(String[] args){
		// TODO Auto-generated method stub
        Sunglasses sunglasses = new Sunglasses("LD", "Aviator", 150.0);
        sunglasses.wear();
        sunglasses.clean();
        sunglasses.remove();

        ReadingGlasses readingGlasses = new ReadingGlasses("Ray Bans", "Classic", 50.0);
        readingGlasses.wear();
        readingGlasses.clean();
        readingGlasses.remove();

        SafetyGlasses safetyGlasses = new SafetyGlasses("3M", "Clear Lens");
        safetyGlasses.wear();
        safetyGlasses.remove();

        ComputerGlasses computerGlasses = new ComputerGlasses("Gunnar", "Optiks", 100.0);
        computerGlasses.wear();
        computerGlasses.clean();
        computerGlasses.remove();
	}
}