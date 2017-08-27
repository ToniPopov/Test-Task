package Vinetki;

public abstract class Vehicle {
	String name;
	Vinetka vinetka;
	int yearOfProduce;

	@Override
	public String toString() {
		System.out.println(vinetka);
		return "Vehicle name: " + name + "\nYear of produce: " + yearOfProduce + "\n";
	}

	Vehicle(String name, int yearOfProduce) {
		this.name = stringCheck(name);
		this.yearOfProduce = yearOfProduce > 1800 ? yearOfProduce : 1800;

	}
	

	public String stringCheck(String str) {
		if (str != null && !str.isEmpty()) {
			return str;
		} else {
			return "Default";
		}
	}
}
