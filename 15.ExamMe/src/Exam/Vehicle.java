package Exam;

public class Vehicle {

	private String model;
	private Vinetka vinetka;
	private int year;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if (model != null && !model.equals("")) {
			this.model = model;
		} else {
			System.out.println("Wrong model");
		}
	}

	public Vinetka getVinetka() {
		return vinetka;
	}

	public void setVinetka(Vinetka vinetka) {
		if(vinetka != null && !vinetka.equals("")){
			this.vinetka = vinetka;
		}
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year > 1900){
			
		this.year = year;
	}
	}

}
