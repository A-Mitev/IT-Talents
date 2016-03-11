package Test3Tests;

public class Client {

	private String name;
	private City addres;
	private int number;
	
	
	
	
	@Override
	public String toString() {
		return "Client [name=" + name + ", addres=" + addres + ", number=" + number + "]";
	}
	public Client(String name, City addres, int number) {
		this.name = name;
		this.addres = addres;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public City getAddres() {
		return addres;
	}
	public void setAddres(City addres) {
		this.addres = addres;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
