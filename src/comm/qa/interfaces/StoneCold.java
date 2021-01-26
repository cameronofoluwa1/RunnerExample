package comm.qa.interfaces;

public class StoneCold implements Wrestler{

	@Override
	public void themeMusic() {
		System.out.println("Stone Cold's Intro Music");
	}

	@Override
	public void finisher() {
		System.out.println("Stone Cold Stunner");
	}

	@Override
	public void paymentForWork(int hours) {
		System.out.println("The wrestler will make £" + hours*200.00);
		
	}

}
