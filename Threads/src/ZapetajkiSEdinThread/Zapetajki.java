package ZapetajkiSEdinThread;

public class Zapetajki {
	public static void main(String[] args) {

		Thread myThread = new Thread(new ZapetajkiThread());
		myThread.start();
	}
}