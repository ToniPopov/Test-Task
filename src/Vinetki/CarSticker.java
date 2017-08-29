package Vinetki;

import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Map.Entry;

public class CarSticker extends Vinetka {

	CarSticker() {
		super("blue");
	}

	CarSticker(int price) {
		super("blue", price);
	}

	@Override
	public CarSticker getVinetka(Driver driver, String validPeriod, PetrolStation station) {
		if (validPeriod != null && !validPeriod.isEmpty()) {
			this.validPeriod = validPeriod.toLowerCase();
		}
		this.date = new Date();
		this.expDate = new Date();

		// vinetki

		switch (this.validPeriod) {
		case "day":
			this.setPrice(5);
			
			if (driver.money - this.getPrice() > 0) {
				removeStickerFromPetrolStation( station, "day");
				driver.money -= this.getPrice();
				this.expDate.setDate(date.getDate() + 7);
				tapeVinetka();
			}
			break;
		case "month":
			this.setPrice(50);
			if (driver.money - this.getPrice() > 0) {
				removeStickerFromPetrolStation( station, "month");
				driver.money -= this.getPrice();
				this.expDate.setMonth(date.getMonth() + 1);
				tapeVinetka();
			}
			break;
		case "year":
			this.setPrice(300);
			if (driver.money - this.getPrice() > 0) {
				removeStickerFromPetrolStation( station, "year");
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

	public void removeStickerFromPetrolStation(PetrolStation station, String key) {
		done: for (Entry<String, TreeSet<Vinetka>> entr : station.vinetki.entrySet()) {
			if (entr.getKey().equals(key)) {
				for (Iterator<Vinetka> iterator = entr.getValue().iterator(); iterator.hasNext();) {
					if (iterator.next() instanceof CarSticker) {
						System.out.println(iterator.next());
						iterator.remove();
						break done;
					}
				}
			}
		}
	}

}
