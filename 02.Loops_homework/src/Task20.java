

public class Task20 {
	public static void main(String[] args) {

		for (int i = 0; i <= 9; i++) {
			int a = 0;
			for (int j = 1; j <= 10; j++) {
				if ((j + i) > 9) {
					System.out.print(a++);
					continue;
				}
				System.out.print(j + i);
			}
			System.out.println();
		}
	}
}
