package TP3;

public class Car {
	private int nbrSeats;
	private String model;
	private String color;
	private String screenType;
	
	public Car(int nbrSeats,String model, String color,String screenType){
		this.nbrSeats = nbrSeats;
		this.model = model;
		this.color = color;
		this.screenType = screenType;
	}
	public void afficher() {
		System.out.println("nbrSeats :" + nbrSeats);
		System.out.println("model :" + model);
		System.out.println("color :" + color);
		System.out.println("screenType : " + screenType);
	}

}
