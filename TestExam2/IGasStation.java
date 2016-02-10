
public interface IGasStation {

	public abstract void generateVinetki();
	public abstract void sortVinetki(Vinetka[] vinetki, int left, int right);
	public abstract IVinetka sellVinetka(Vehicle vehicle, String term);
	
}
