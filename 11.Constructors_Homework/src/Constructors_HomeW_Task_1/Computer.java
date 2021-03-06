package Constructors_HomeW_Task_1;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	String brand;

	void changeOperationSystem(String newOperationSystem) {
		this.operationSystem = newOperationSystem;

	}

	void useMemory(int memory) {
		if (memory > this.freeMemory) {
			System.out.println("Not enough free memory!");
			return;
		} else {
			this.freeMemory -= memory;
		}
	}

	void printComputerElements() {
		System.out.println("Year ot production - " + this.year + "\n" + "Price - " + this.price + " lv." + "\n"
				+ "Notebook - " + this.isNotebook + "\n" + "Hdd capacity - " + this.hardDiskMemory + " GB " + "\n"
				+ "Free memory - " + this.freeMemory + " GB " + "\n" + "Opration system - " + this.operationSystem
				+ "\n");
	}

	Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory, String brand) {
		this();
		if (year > 1970) {
			this.year = year;
		} else {
			System.out.println("In this year there were still no computers");
			this.year = 0000;
		}

		this.price = price;
		if (hardDiskMemory > 20) {
			this.hardDiskMemory = hardDiskMemory;
		} else {
			System.out.println("Too little for hdd capacity.");
			this.hardDiskMemory = 0000;
		}

		if (freeMemory < hardDiskMemory) {
			this.freeMemory = freeMemory;
		} else {
			System.out.println("Not enough hdd capacity");
			this.freeMemory = 0;
		}
		this.brand = brand;
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory, String brand, String operationSystem) {
		this(year, price, hardDiskMemory, freeMemory, brand);
		this.operationSystem = operationSystem;

	}

	int comparePrice(Computer c) {
		if (this.price > c.price) {
			return -1;
		}
		if (this.price < c.price) {
			return 1;
		}
		return 0;
	}

	void printPrice(Computer c) {
		if (comparePrice(c) == -1) {
			System.out.println(this.brand + " e po-skup");
		} else if (comparePrice(c) == 1) {
			System.out.println(c.brand + " e po-skup");
		} else {
			System.out.println("Cenite sa ednakvi");
		}

	}

}
