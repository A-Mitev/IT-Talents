package NestedClases;

public class Kolelo {

	private Guma guma1;
	private Guma guma2;
	static int dulzinaNaPedala;
	

	static class Guma extends Tractor.Guma {
		private int broiSpici;
		
		public Guma(int broiSpici) {
			super(23, 2);
			this.broiSpici = broiSpici;
			dulzinaNaPedala = 22;
		}
	}

	Kolelo() {
		this.guma1 = new Guma(30);
		this.guma2 = new Guma(25);
		
		guma1.broiSpici  = 20;
	}
}
