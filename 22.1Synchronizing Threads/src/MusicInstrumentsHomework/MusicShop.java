package MusicInstrumentsHomework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MusicShop {

	private Map<String, MusicInstrument> productsInShop;
	private double availableMoney; //tazi promenliva shte se uvelichava postoqnno pri prodazba
	private double startingMoney; // tazi promenliva shte durzi nachalniq kapital na magazina
	private Map<String, Integer> prodadeniInstrumenti = new HashMap<String,Integer>();

	public MusicShop(double availableMoney) {
		productsInShop = new HashMap<String, MusicInstrument>();
		this.setAvailableMoney(availableMoney);
		startingMoney = availableMoney;
	}

	void addMusicInstrument(String name, InstrumentType type, double price, int quantity) {
		if (!productsInShop.containsKey(name)) {
			productsInShop.put(name, new MusicInstrument(name, type, price));
			int newQuantityInShop = productsInShop.get(name).getQuantityInShop() + quantity;
			productsInShop.get(name).setQuantityInShop(newQuantityInShop);

		}
	}

	void sellMusicInstrument(String name, int quantityForSale) {
		if ((productsInShop.containsKey(name)) && (productsInShop.get(name).getQuantityInShop() >= quantityForSale)) {
			
			
			System.out.println("Nalichi ot instrument predi prodazba " + "\"" + productsInShop.get(name).getName() + "\" "
					+ productsInShop.get(name).getQuantityInShop());
			productsInShop.get(name).setQuantityInShop(productsInShop.get(name).getQuantityInShop() - quantityForSale);
			availableMoney += productsInShop.get(name).getPrice() * quantityForSale;
		} else {
			//narochno e v cherveno
			System.err.println("Nedostatuchna nalichnost ot posocheniq produkt " + "\""
					+ productsInShop.get(name).getName() + "\"");
		}
//		System.out.println("Ostavashti nalichi sled prodazba ot instrument " + "\"" + productsInShop.get(name).getName()
//				+ "\" " + productsInShop.get(name).getQuantityInShop());
		prodadeniInstrumenti.put(name, quantityForSale);
		
	}

	public void instrumentCatalog(String comparatorCondition) {
		System.out.println("Razlichni sortiraniq:");
		Set<MusicInstrument> instrumenti = new TreeSet<MusicInstrument>(comparatorCondition.equals("Type")
				? new InstrumentTypeComparator()
				: comparatorCondition.equals("Name") ? new InstrumentNameComparator()
						: comparatorCondition.equals("PriceAscending") ? new InstrumentPriseAscendingComparator()
								: comparatorCondition.equals("PriceDescending")
										? new InstrumentPriseDescendingComparator() : new InstrumentNameComparator());
		for (String instument : productsInShop.keySet()) {
			instrumenti.add(productsInShop.get(instument));
		}
		for (MusicInstrument instrument : instrumenti) {
			System.out.println(instrument);
		}
	}

	public void nalichnost() {
		System.out.println("Nalichnost sled prodazbi:");
		List<String> nalichnost = new ArrayList<String>();
		for (String instrument : productsInShop.keySet()) {
			nalichnost.add(instrument);
		}

		for (String instrument : nalichnost) {
			if (productsInShop.get(instrument).getQuantityInShop() >= 1) {
				System.out.println("Ot instrument " + productsInShop.get(instrument).getName() + " ima "
						+ productsInShop.get(instrument).getQuantityInShop() + " broiki");
			} else {
				System.out.println("Ot instrument " + productsInShop.get(instrument).getName() + " nqma nalichnost");
			}
		}
	}
	
	public void spravki(){
		System.out.println("\n" + "Spravki:");
		System.out.println("..........");
		System.out.println("Prodadeni instrumenti sortirani po broj prodazbi:");
		List<String> prodadeni = new ArrayList<String>();
		for(String instrument : prodadeniInstrumenti.keySet()){
			prodadeni.add(instrument);
		}
		Collections.sort(prodadeni, (product1, product2) ->
		prodadeniInstrumenti.get(product2)- prodadeniInstrumenti.get(product1)  );
		
		for(String instrument : prodadeni){
			System.out.println("\"" + instrument + "\"" + " " + prodadeniInstrumenti.get(instrument).intValue());
		}
		System.out.println("..........");
		System.out.println("Obshta suma ot prodadeni instrumenti = " + (availableMoney - startingMoney));
		System.out.println("..........");
		System.out.println("Naj-prodavan instrument - " + "\"" + prodadeni.get(0) + "\"" + " - " + prodadeniInstrumenti.get(prodadeni.get(0)).intValue() + " " + "brojki");
		System.out.println("..........");
		for(String instrument : productsInShop.keySet()){
			if(!(prodadeniInstrumenti.containsKey(instrument))){
				System.out.println("Produkt bez prodazbi - " + "\"" + instrument + "\"");
			}
		}
		System.out.println("..........");
	}

	public double getAvailableMoney() {
		return availableMoney;
	}

	public void setAvailableMoney(double availableMoney) {
		if (availableMoney >= 0)
			this.availableMoney = availableMoney;
	}

}
