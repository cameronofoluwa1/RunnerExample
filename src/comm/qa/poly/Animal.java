package comm.qa.poly;

public class Animal {
	
	public void Speak() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		Animal a = new Dog();
		Animal b = new Cat();
		a.Speak();
		b.Speak();
	}
}
