package TP3;

public class Client {
	public Client() {
	}
	public static void main(String []args){
		CarBuilder cb1 = new CarBuilder();
		Director dir = new Director();
		dir.makeEconomicCar(cb1);
		Car car1 = cb1.build();
		car1.afficher();
    }
}
