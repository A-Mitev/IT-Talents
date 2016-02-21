package tests;

public class KucKon extends Kon {
	
	@Override
	protected String getHorseName() {
		return "Kuc kon" + super.getHorseName();
	}
	
	@Override
	protected int getTimeToRunAMile() {
		return 2* super.getTimeToRunAMile();
	}

}
