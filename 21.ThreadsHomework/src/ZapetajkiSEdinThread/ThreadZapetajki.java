package ZapetajkiSEdinThread;

public class ThreadZapetajki implements Runnable {

	private String text;

	public ThreadZapetajki(String text) {
		this.text = text;
	}

	@Override
	public void run() {

		String[] zapetajki = text.toString().replaceAll("^,", "").split(",");

		int zapetajkiCount = zapetajki.length - 1;
		System.out.println(zapetajkiCount);
	}
}
