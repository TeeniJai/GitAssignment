import java.util.Scanner;
public class cars {

	public static void main(String[] args) {
		Car car = new Car("Toyota", "RAV4", 40);
		Scanner in = new Scanner(System.in);
		boolean loop = true;
		while (loop == true) {
				
			
			System.out.println("a=accelerate b=break x=exit");
			
			String input = in.nextLine();
			if (input.equals("a")) {
				car.accelerate();
			}
			else if (input.equals("b")) {
				car.brake();
			}
			else if (input.equals("x")) {
				loop = false;
			}
		}
	}

}
class Car{
	//attributes
	private String brand;
	private String model;
	private int amountOfFuel;
	//methods
	public void brake() {
		System.out.println("Car is braking");
	}
	public void accelerate() {
		amountOfFuel--;
		if (amountOfFuel > 0) {
			System.out.println("Car is accelerating");
		}
	}
	private void printData() {
		System.out.println("Brand: " + brand + "\nModel: " + model + "\nFuel: " + amountOfFuel);
	}
	public void refuel(int amount) {
		System.out.println("Fuel in the tank: " + amountOfFuel);
		System.out.println("Refuel: " + amount);
		System.out.println("Fuel in the tank after the refuel: " + (amountOfFuel + amount));
	}
	//get n set
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	//constructor time
	public Car() {
		this.brand = "";
		this.model = "";
		this.amountOfFuel = 0;
		printData();
	}
	
	public Car(String brand, String model, int amountOfFuel) {
		this.brand = brand;
		this.model = model;
		this.amountOfFuel = amountOfFuel;
		printData();
	}
	
}