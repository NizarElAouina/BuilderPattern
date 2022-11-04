package TP3;

public class CarManuelBuilder implements Builder {
	private int nbrSeats;
	private String model;
	private String color;
	private String screenType;
	public CarManuelBuilder() {
	}
	@Override
	public void setSeats(int seats) {
		// TODO Auto-generated method stub
		this.nbrSeats = seats;
	}
	@Override
	public void setModel(String model) {
		// TODO Auto-generated method stub
		this.model = model;
	}
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
	}
	@Override
	public void setScreenType(String screenType) {
		// TODO Auto-generated method stub
	this.screenType = screenType;	
	}
	public Car build() {
		Car car = new Car(nbrSeats,model,color,screenType );
		return car;
	}
}
