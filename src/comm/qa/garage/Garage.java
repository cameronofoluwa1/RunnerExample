package comm.qa.garage;

import java.util.Scanner;

public class Garage {

	public static void printVehicles(Vehicle[] listname) {
        for (int i = 0; i < listname.length; i++) {
        	System.out.println(listname[0].getManufacturer());
        }
	}
	
	public static Vehicle addNewCar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the car manufacturer : ");
        String Manufacturer = scan.nextLine();
        System.out.println("Enter the car model : ");
        String Model = scan.nextLine();
        System.out.println("Enter the car colour : ");
        String Colour = scan.nextLine();
        System.out.println("Enter the max speed : ");
        int Speed = scan.nextInt();
        System.out.println("Enter the wheel count : ");
        int wheelCount = scan.nextInt();
        System.out.println("Enter the amount of doors : ");
        int doors = scan.nextInt();
        System.out.println("Is the car insured? : ");
        boolean isInsured = scan.nextBoolean();
        System.out.println("Has the car got MOT? : ");
        boolean isMOT = scan.nextBoolean();
        System.out.println("Is the car taxed? : ");
        boolean isTaxed = scan.nextBoolean();
		return new Car("Car", Manufacturer, Model, Colour, Speed, wheelCount, doors, isInsured, isMOT, isTaxed);
	}

	//Remove by vehicle type or by ID
	public static void removeVehicle() {
		
	}
	
	public static void getVehicleInfo(Vehicle[] listname, int indexPos) {
		System.out.println("==========");
		System.out.println(listname[indexPos].getManufacturer() + ", " + listname[indexPos].getModel());
		System.out.println(listname[indexPos].getColour());
		System.out.println(listname[indexPos].getSpeed() + " Km/h");
		System.out.println(listname[indexPos].getWheelCount() + " wheels");
		if(listname[indexPos].getvehicleType() == "Car") {
			System.out.println("Debug message Car");
		}else if(listname[indexPos].getvehicleType() == "Plane") {
			System.out.println("Debug message Plane");
		}else {
			System.out.println("Debug message Loooooool");
		}
		System.out.println("==========");
	}
	
	//Remove all items from the list
	public static void emptyGarage() {
		
	}
}
