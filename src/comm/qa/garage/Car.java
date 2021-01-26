package comm.qa.garage;

import java.util.Scanner;

public class Car extends Vehicle{
	
	int doors;
	boolean isInsured;
	boolean isMOT;
	boolean isTaxed;
	
	public Car(String vehicleType, String Manufacturer, String Model, String Colour, int Speed, int wheelCount, int doors, boolean isInsured, boolean isMOT, boolean isTaxed) {
		super(vehicleType, Manufacturer, Model, Colour, Speed, wheelCount);
		// TODO Auto-generated constructor stub        
	}
	
	public int getDoors() {return doors;}
	public void setDoors(int doors) {this.doors = doors;}

	public boolean isInsured() {return isInsured;}
	public void setInsured(boolean isInsured) {this.isInsured = isInsured;}

	public boolean isMOT() {return isMOT;}
	public void setMOT(boolean isMOT) {this.isMOT = isMOT;}

	public boolean isTaxed() {return isTaxed;}
	public void setTaxed(boolean isTaxed) {this.isTaxed = isTaxed;}

	@Override
	public void vehicleManufacturer() {
		System.out.println("Audi");
		
	}

}
