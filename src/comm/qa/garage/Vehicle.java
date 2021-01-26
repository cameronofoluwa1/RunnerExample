package comm.qa.garage;

public abstract class Vehicle extends Garage{
	
	public abstract void vehicleManufacturer();

	String vehicleType;
	String Manufacturer;
	String Model;
	String Colour;
	int Speed;
	int wheelCount;
	
	public Vehicle(String vehicleType, String Manufacturer, String Model, String Colour, int Speed, int wheelCount) {
		this.vehicleType = vehicleType;
		this.Manufacturer = Manufacturer;
		this.Model = Model;
		this.Colour = Colour;
		this.Speed = Speed;
		this.wheelCount = wheelCount;
	}

	public String getvehicleType() {return vehicleType;}
	public void setvehicleType(String vehicleType) {Manufacturer = vehicleType;}
	
	public String getManufacturer() {return Manufacturer;}
	public void setManufacturer(String manufacturer) {Manufacturer = manufacturer;}

	public String getModel() {return Model;}
	public void setModel(String model) {Model = model;}

	public String getColour() {return Colour;}
	public void setColour(String colour) {Colour = colour;}

	public int getSpeed() {return Speed;}
	public void setSpeed(int speed) {Speed = speed;}

	public int getWheelCount() {return wheelCount;}
	public void setWheelCount(int wheelCount) {this.wheelCount = wheelCount;}
	
}
