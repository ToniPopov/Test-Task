package Vinetki;

public class DemoVinetki {

	public static void main(String[] args)   {
		Driver driver = new Driver("Toni",1000);
		Vehicle kola = new Car("impreza",2017);
		PetrolStation petrol = new PetrolStation("Petrol");
		System.out.println(driver);
		System.out.println(driver.cars);
		driver.addCar(kola);
		driver.addCar(kola);
//		if(kola instanceof Car){
			kola.vinetka = new CarSticker().getVinetka(driver, "year",petrol);
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
