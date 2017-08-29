package Vinetki;

public class Car extends Vehicle {
	
	CarSticker carSticker;

	Car(String name, int yearOfProduce) {
		super(name, yearOfProduce);
		carSticker = new CarSticker();
	}

}
