package Vinetki;

public class DemoVinetki {

	public static void main(String[] args)   {
		Driver driver = new Driver("Toni",1000);
		Car kola = new Car("impreza",2017);
		Bus bus = new Bus("Ikarus",2000);
		Truck truck = new Truck("Man",2008);
		PetrolStation petrol = new PetrolStation("Petrol");
		
		driver.addBus(bus);
		driver.addTruck(truck);
		
		System.out.println(driver);
		System.out.println(driver.cars);
		driver.addCar(kola);
		driver.addCar(kola);
		System.out.println(driver.cars.size());
		
		driver.cars.get(0).carSticker = driver.cars.get(0).carSticker.getVinetka(driver, "day", petrol);
		driver.cars.get(1).carSticker = driver.cars.get(1).carSticker.getVinetka(driver, "day", petrol);
		driver.buses.get(0).busSticker.getVinetka(driver, "month",petrol );

		System.out.println(driver);
//		
		
		//		if(kola instanceof Car){
//			kola.vinetka = new CarSticker().getVinetka(driver, "year",petrol);
//		}else if(kola instanceof Bus){
//			kola.vinetka = new BusSticker().getVinetka(driver, "year",petrol);
//		}else if(kola instanceof Truck){
//			kola.vinetka = new TruckSticker().getVinetka(driver, "year",petrol);
//		}
		
//		System.out.println(kola);
//		System.out.println(driver);
//		System.out.println(driver.cars);
		
		
//		PetrolStation petrol = new PetrolStation("petrol");
		
		petrol.printAllVinetki();
		
		
		
		
		
	}

}
