package Vinetki;

import java.util.ArrayList;

public class Driver {
	String name;
	int money;
	ArrayList<Vehicle> cars = new ArrayList<Vehicle>();

	Driver(String name, int money) {
		this.name = stringCheck(name);
		this.money = money >= 0 ? money : 0;
	}

	public String stringCheck(String str) {
		if (str != null && !str.isEmpty()) {
			return str;
		} else {
			return "Default";
		}
	}

	public void addCar(Vehicle vehicle) {
		if (vehicle != null) {
			this.cars.add(vehicle);
		}
	}

	@Override
	public String toString() {
		return "Driver name: " + name + "\nMoney: " + money + "\n";
	}

}
