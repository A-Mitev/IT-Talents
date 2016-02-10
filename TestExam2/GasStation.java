import java.util.Arrays;

public class GasStation implements IGasStation {

	private static final int NUMBER_OF_RANDOM_VINETKI = 100000;

	private double money;
	private Vinetka[] vinetkiForSale;

	public GasStation() {
		this.vinetkiForSale = new Vinetka[NUMBER_OF_RANDOM_VINETKI];
		generateVinetki();
		sortVinetki(this.vinetkiForSale, 0, this.vinetkiForSale.length - 1);

	}

	public Vinetka[] getVinetkiForSale() {
		if (vinetkiForSale != null) {
			return this.vinetkiForSale = Arrays.copyOf(this.vinetkiForSale, this.vinetkiForSale.length);
		} else {
			Vinetka[] vinetki = new Vinetka[10];
			return vinetki;
		}
	}

	public void generateVinetki() {

			int index = 0;
			for (int numberOfObject = 0; numberOfObject < NUMBER_OF_RANDOM_VINETKI; numberOfObject++) {
				int randomNumber = (int) Math.random();
				if (randomNumber > 0 && randomNumber < 0.3) {
					this.getVinetkiForSale()[index] = new VinetkaForCar();
					index++;
				} else if (randomNumber > 0.4 && randomNumber < 0.7) {
					this.getVinetkiForSale()[index] = new VinetkaForBus();
					index++;
				} else {
					this.getVinetkiForSale()[index] = new VinetkaForTruck();
					index++;
				}
			
		}
	}

	public void sortVinetki(Vinetka[] vinetki, int left, int right) {
		if (vinetki != null) {
			int index = partition(vinetki, left, right);
			if (left < index - 1)
				sortVinetki(vinetki, left, index - 1);
			if (index < right)
				sortVinetki(vinetki, index, right);
		}
	}

	int partition(Vinetka[] vinetki, int left, int right) {
		int i = left, j = right;
		Vinetka tmp;
		Vinetka pivot = vinetki[(left + right) / 2];

		while (i <= j) {
			while (vinetki[i].getPrice() < pivot.getPrice())
				i++;
			while (vinetki[i].getPrice() < pivot.getPrice())
				j--;
			if (i <= j) {
				tmp = vinetki[i];
				vinetki[i] = vinetki[j];
				vinetki[j] = tmp;
				i++;
				j--;
			}
		}
		return i;
	}

	public IVinetka sellVinetka(Vehicle vehicle, String term) {
		for (Vinetka vinetka : this.vinetkiForSale) {
			if (vinetka.getTerm().equals(term) && vinetka.getClass().equals(vehicle.getClass())) {
				vinetka = null;
				sortVinetki(this.vinetkiForSale, 0, this.vinetkiForSale.length);
				return (IVinetka) vinetka;
			}
		}
		return (IVinetka) new VinetkaForBus();
	}

}
