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
				System.out.println(entry.getKey());
				System.out.println(element);
				count++;
			}
		}
		System.out.println(count);
	}

	private void reloadWithVinetki() {
		TreeSet<Vinetka> setVinetki = new TreeSet<Vinetka>(new ComparatorPrice());
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 1111; j++) {
				setVinetki.add(new CarSticker());
				setVinetki.add(new BusSticker());
				setVinetki.add(new TruckSticker());
			}
			if (i == 0) {
				vinetki.put("day", setVinetki);
				System.out.println(setVinetki.size());
				setVinetki = new TreeSet<Vinetka>(new ComparatorPrice());
			} else if (i ==  1) {
				vinetki.put("month", setVinetki);
				System.out.println(setVinetki.size());
				setVinetki = new TreeSet<Vinetka>(new ComparatorPrice());
			} else if (i == 2) {
				setVinetki.add(new CarSticker());
				vinetki.put("year", setVinetki);
				System.out.println(setVinetki.size());
			}
		}
	}
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		if(amount > 0){
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
