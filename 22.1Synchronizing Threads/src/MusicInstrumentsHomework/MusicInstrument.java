package MusicInstrumentsHomework;

public class MusicInstrument {
	// tozi klas purvo mislih da e abstract
	// no taka napisan za otdelen clas Instrumen ne ostava nishto za opisvane

	private String name;
	private InstrumentType type;
	private double price;
	private int quantityInShop;

	
	public MusicInstrument(String name, InstrumentType type, double price) {
		this.setName(name);
		this.getType();
		this.setPrice(price);
	}

	

	public String getName() {
		return name;
	}

	// setter samo zaradi proverkaza za null
	public void setName(String name) {
		if (name != null && !name.equals(""))
			this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
	}

	// poneze type-a e Enum kolekcijkata nqma nuzda ot seter zashtoto
	// moze da se izpira samo ot izbroenite neshta
	public InstrumentType getType() {
		return type;
	}

	public int getQuantityInShop() {
		return quantityInShop;
	}
	
	// quantity-to si mislq che moze da e nula no instrumenta da figurira v
	// magazina
	public void setQuantityInShop(int quantityInShop) {
		if (quantityInShop >= 0)
			this.quantityInShop = quantityInShop;
	}
	
	@Override
	public String toString() {
		return "MusicInstrument [name=" + name + ", type=" + type + ", price=" + price + ", quantityInShop="
				+ quantityInShop + "]";
	}

}