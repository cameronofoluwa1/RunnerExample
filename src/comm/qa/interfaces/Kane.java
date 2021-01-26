package comm.qa.interfaces;

public class Kane implements Wrestler {

	@Override
	public void themeMusic() {
		System.out.println("Kane's Intro Music");
	}

	@Override
	public void finisher() {
		System.out.println("Tombstone");
	}

	@Override
	public void paymentForWork(int hours) {
		System.out.println("The wrestler will make £" + hours*300.00);
		
	}

}
