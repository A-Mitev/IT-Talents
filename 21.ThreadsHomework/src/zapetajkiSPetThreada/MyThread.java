package zapetajkiSPetThreada;

class MyThread implements Runnable {

	private int zapetajkiCount;

	public int getValue() {
		return zapetajkiCount;
	}

	private String textToAnalize;

	public MyThread(String textToAnalize) {
		this.textToAnalize = textToAnalize;
	}

	public void run() {

		String[] zapetajki = textToAnalize.replaceAll("^,", "").split(",");

		zapetajkiCount = zapetajki.length - 1;
		System.out.println("V tozi thread  " + Thread.currentThread().getName() + " sa prebroeni - " + zapetajkiCount);

	}

}
