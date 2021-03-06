package MusicInstrumentsHomework;

public class Demo {

	public static void main(String[] args) {

		MusicShop planetaPayner = new MusicShop(2500);
		
		// dobavqneto mi beshe dvojno no kato pomislih napravih vsichko da e po edin red
		planetaPayner.addMusicInstrument("Baraban", InstrumentType.Udarni, 550, 9);
		planetaPayner.addMusicInstrument("Flejta", InstrumentType.Duhovi, 120, 4);
		planetaPayner.addMusicInstrument("Piano", InstrumentType.Klavishni, 2999, 2);
		planetaPayner.addMusicInstrument("Sintezator", InstrumentType.Electronni, 6555,  4);
		planetaPayner.addMusicInstrument("Kitara", InstrumentType.Strunni, 955, 0);
		
		planetaPayner.sellMusicInstrument("Baraban", 5);
		planetaPayner.sellMusicInstrument("Flejta", 4);
		planetaPayner.sellMusicInstrument("Kitara", 2);
		
		System.out.println();
		System.out.println("Nalichnost pari v kasata na magazina " + planetaPayner.getAvailableMoney());
		System.out.println();
		
		// Vuzmozni kriterii za podredba - "Name" , "PriceDescending", "PriceAscending", "Type"
		//v momenta pri "Type" dava nullpointerexceprion poneze sa Enum i trqbva da namerq kak 
		//da nakaram comparatora da raboti s enum.
		//Po default pri greshen parametur e podrezdane po Name!
		planetaPayner.instrumentCatalog("PriceDescending");
		System.out.println();
//		tozi metod nalichnost baq me izmuchi no se poluchi super qko :)
//		sega kato go gledam moze da e mnogo po-lesno ako vzimam i pazq stojnostite oshte v metoda za prodazba
		planetaPayner.nalichnost();
		planetaPayner.spravki();
	}
}
