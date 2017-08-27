package Vinetki;

import java.util.Date;
import java.util.Iterator;

public class CarSticker extends Vinetka {

	CarSticker() {
		super("blue");
	}

	@Override
	public CarSticker getVinetka(Driver driver, String validPeriod,PetrolStation station) {
		if (validPeriod != null && !validPeriod.isEmpty()) {
			this.validPeriod = validPeriod.toLowerCase();
		}
		this.date = new Date();
		this.expDate = new Date();
		
//		vinetki
		
		switch (this.validPeriod) {
		case "day":
			this.setPrice(5);
			station.vinetki.get("day");
			station.vinetki.get("day").remove("day");
//			while(itr.hasNext()){
//			    Vinetka c=itr.next();
//			    if (c instanceof CarSticker){
//			    	System.out.println(c);
//			    	itr.remove();
//			    	break;
//			    }
//			    //Code to add a new element to the TreeSet ts
//			}
			if (driver.money - this.getPrice() > 0) {
				driver.money -= this.getPrice();
				this.expDate.setDate(date.getDate() + 7);
				tapeVinetka();
			}
			break;
		case "month":
			this.setPrice(50);
			if (driver.money - this.getPrice() > 0) {
				driver.money -= this.getPrice();
				this.expDate.setMonth(date.getMonth() + 1);
				tapeVinetka();
			}
			break;
		case "year":
			this.setPrice(300);
			if (driver.money - this.getPrice() > 0) {
				driver.money -= this.getPrice();
				this.expDate.setYear(date.getYear() + 1);
				tapeVinetka();
			}
			break;
		}
		
		return this;
	}

	@Override
	public String toString() {
		return "Car sticker valid period: " + validPeriod + "\nDate: " + date + "\nExpDate: " + expDate + "\nPrice: "
				+ getPrice() + "\n";
	}

	@Override
	public void tapeVinetka() {
		System.out.println("Lepnah q taz vinetka za 5 sec");
	}

}
