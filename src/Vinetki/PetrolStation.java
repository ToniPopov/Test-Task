package Vinetki;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class PetrolStation {
	String name;
	private double amount;

	TreeMap<String, TreeSet<Vinetka>> vinetki = new TreeMap<String, TreeSet<Vinetka>>();

	PetrolStation(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		reloadWithVinetki();
	}

	public void printAllVinetki() {
		int count = 0;
		vinetki.size();
		for (Map.Entry<String, TreeSet<Vinetka>> entry : vinetki.entrySet()) {
			for (Vinetka element : entry.getValue()) {
//				System.out.println(entry.getKey());
//				System.out.println(element);
				count++;
			}
		}
		System.out.println("broi vinetki "+count);
	}

	private void reloadWithVinetki() {
		int carStickerPrice = 5;
		int busStickerPrice = 9;
		int truckStickerPrice = 7;
		TreeSet<Vinetka> setVinetki = new TreeSet<Vinetka>(new ComparatorPrice());
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 1111; j++) {
				setVinetki.add(new CarSticker(carStickerPrice));
				setVinetki.add(new BusSticker(busStickerPrice));
				setVinetki.add(new TruckSticker(truckStickerPrice));
			}
			if (i == 0) {
				vinetki.put("day", setVinetki);
				System.out.println(setVinetki.size());
				setVinetki = new TreeSet<Vinetka>(new ComparatorPrice());
				carStickerPrice = 50;
				busStickerPrice = 90;
				truckStickerPrice = 70;
			} else if (i == 1) {
				vinetki.put("month", setVinetki);
				System.out.println(setVinetki.size());
				setVinetki = new TreeSet<Vinetka>(new ComparatorPrice());
				carStickerPrice = 300;
				busStickerPrice = 540;
				truckStickerPrice = 420;
			} else if (i == 2) {
				setVinetki.add(new CarSticker(carStickerPrice));
				vinetki.put("year", setVinetki);
				System.out.println(setVinetki.size());
			}
		}
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		if (amount > 0) {
			this.amount = amount;
		}
	}
}

class ComparatorPrice implements Comparator<Vinetka> {

	@Override
	public int compare(Vinetka o1, Vinetka o2) {
		return o1.hashCode() - o2.hashCode();
	}

}
