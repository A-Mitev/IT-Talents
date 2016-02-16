package CollectionTestKonservi;

import java.util.Comparator;

public class KonservaComparator implements Comparator<Konserva> {

	@Override
	public int compare(Konserva k1, Konserva k2) {
		return k1.getCena() - k2.getCena();
	}
 
}
