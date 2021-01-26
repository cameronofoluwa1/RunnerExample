package comm.qa.garage;

public class Main extends Garage{
	
	public static void main(String[] args) {		
		Vehicle list[] = new Vehicle[5];
		
		list[0] = new Car("Car", "Audi", "RS3", "Nardo Grey", 250, 4, 4, true, true, true);
		list[1] = new Car("Car", "Audi", "RS3", "Nardo Grey", 250, 4, 4, true, true, true);
		list[2] = new Plane("Plane", "Boeng", "747", "multi-colour", 900, 16, 4, 366, 3);
		list[3] = new Plane("Plane", "Boeng", "747", "multi-colour", 900, 16, 4, 366, 3);
		list[4] = new Plane("Plane", "Boeng", "747", "multi-colour", 900, 16, 4, 366, 3);
		
		for(int i = 0; i < list.length; i++) {
			getVehicleInfo(list, i);
		}
	}

}
