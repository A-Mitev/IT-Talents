package tests;

public class Kon implements Runnable {

	private static final int MILES_TO_RUN = 20;
	
	@Override
	public void run() {
		
		System.out.println(getHorseName() + " Zapochna da bqga");

		for (int miles = 0; miles < getTimeToRunAMile(); miles++) {

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
			System.out.println("Do sega " + getHorseName() + " izbqga " + miles);
		}
		System.out.println(getHorseName() + " finishira");

	}
	protected String getHorseName() {
		return Thread.currentThread().getName();
	}
	protected int getTimeToRunAMile(){
		return MILES_TO_RUN;
	}

}