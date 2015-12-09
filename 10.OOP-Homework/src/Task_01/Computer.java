package Task_01;
public class Computer {
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;
	
	String changeOperationSystem(String newOpearationSystem){
		operationSystem = newOpearationSystem;
		return operationSystem;
	}
	
	void useMemory(int memory){
		if(memory > freeMemory){
			System.out.println("Not enough free memory!");
			return;
		} else {
		freeMemory -= memory;
		}
	}
}
