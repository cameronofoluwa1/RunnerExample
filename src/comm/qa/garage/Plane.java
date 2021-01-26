package comm.qa.garage;

public class Plane extends Vehicle{
	
	int doors;
	int passengers;
	int travelClasses;
	

	
	public Plane(String vehicleType, String Manufacturer, String Model, String Colour, int Speed, int wheelCount, int doors, int passengers, int travelClasses) {
		super(vehicleType, Manufacturer, Model, Colour, Speed, wheelCount);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void vehicleManufacturer() {
		System.out.println("Audi");
		
	}

}
