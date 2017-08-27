package Vinetki;

import java.util.Date;

public class BusSticker extends Vinetka {

	BusSticker() {
		super("red");
	}

	@Override
	public BusSticker getVinetka(Driver driver, String validPeriod,PetrolStation station) {
		if (validPeriod != null && !validPeriod.isEmpty()) {
			this.validPeriod = validPeriod.toLowerCase();
		}
		this.date = new Date();
		this.expDate = new Date();
		switch (this.validPeriod) {
		case "day":
			this.setPrice(9);
			if (driver.money - this.getPrice() > 0) {

				driver.money -= this.getPrice();
				this.expDate.setDate(date.getDate() + 7);
				tapeVinetka();
			}
			break;
		case "month":
			this.setPrice(90);
			if (driver.money - this.getPrice() > 0) {

				driver.money -= this.getPrice();
				this.expDate.setMonth(date.getMonth() + 1);
				tapeVinetka();
			}
			break;
		case "year":
			this.setPrice(540);
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
		return "Bus sticker valid veriod: " + validPeriod + "\nDate: " + date + "\nExpDate: " + expDate + "\nPrice: "
				+ getPrice() + "\n";
	}

	@Override
	public void tapeVinetka() {
		System.out.println("Lepnah q taz vinetka za 20 sec");
	}
}
