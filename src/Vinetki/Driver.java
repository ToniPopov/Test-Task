package Vinetki;

import java.util.ArrayList;

public class Driver {
	String name;
	int money;
	ArrayList<Car> cars = new ArrayList<Car>();
	ArrayList<Bus> buses = new ArrayList<Bus>();
	ArrayList<Truck> trucks = new ArrayList<Truck>();

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

	public void addCar(Car vehicle) {
		if (vehicle != null) {
			this.cars.add(vehicle);
		}
	}

	public void addBus(Bus vehicle) {
		if (vehicle != null) {
			this.buses.add(vehicle);
		}
	}

	public void addTruck(Truck vehicle) {
		if (vehicle != null) {
			this.trucks.add(vehicle);
		}
	}

	@Override
	public String toString() {
		if (!this.trucks.isEmpty()) {
			for (Truck truck : this.trucks) {
				System.out.println(truck);
			}
		}
		if (!this.cars.isEmpty()) {
			for (Car car : this.cars) {
				System.out.println(car);
			}
		}
		if (!this.trucks.isEmpty()) {
			for (Bus bus : this.buses) {
				System.out.println(bus);
			}
		}
		return "Driver name: " + name + "\nMoney: " + money + "\n";
	}

}
