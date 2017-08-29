package Vinetki;

public class Car extends Vehicle {
	
	CarSticker carSticker;

	Car(String name, int yearOfProduce) {
		super(name, yearOfProduce);
		carSticker = new CarSticker();
	}

	@Override
	public String toString() {
		return "Car sticker: " + this.carSticker + "\n";
	}
	
	
	

}
