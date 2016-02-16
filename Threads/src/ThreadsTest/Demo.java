package ThreadsTest;

public class Demo {
	
	
	private static  void doSmth() {
		while (true){
			System.out.println("Pravq nehto si");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {

		Thread myThread2 = new Thread(new MyThread());
		Thread myThread4 = new Thread(new MyDrugThread());
		myThread2.start();
		myThread4.start();

		System.out.println("Tova se izpulnqva ot syso v main");
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Nov thread");
			}
		}).start();
		
		new Thread(() -> doSmth()).start();
		
		
	}


}
