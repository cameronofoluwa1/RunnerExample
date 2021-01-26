package comm.qa.inherit;

public class Runner {

	public static void main(String[] args) {
		Child a = new Child();
		a.setEyeColour("Green");
		System.out.println(a.getEyeColour());
		a.parent2();
	}
}
