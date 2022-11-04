package TP3;

public class Director {
	public Director(){
	}
	public void makeSportCar(Builder builder) {
		builder.setSeats(2);
		builder.setModel("Porsche");
		builder.setColor("black");
		builder.setScreenType("Tactile");
	}
	public void makeEconomicCar(Builder builder) {
		builder.setSeats(5);
		builder.setModel("Fiat");
		builder.setColor("Blanc");
		builder.setScreenType("Bouton");
	}
	

}
