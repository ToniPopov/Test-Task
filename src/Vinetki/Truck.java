package Vinetki;

public class Truck extends Vehicle {

	TruckSticker truckSticker;
	
	Truck(String name, int yearOfProduce) {
		super(name, yearOfProduce);
		this.truckSticker = new TruckSticker();
	}
	public String toString() {
		return "Truck sticker: " + this.truckSticker + "\n";
	}

}
