package Vinetki;

public class Bus extends Vehicle{

	BusSticker busSticker ;
	
	Bus(String name, int yearOfProduce) {
		super(name, yearOfProduce);
		this.busSticker=new BusSticker();
	}

}
