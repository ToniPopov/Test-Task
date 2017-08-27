package Court;

import java.util.TreeSet;

public class Court {
	String name;
	String address;
	TreeSet<Jurist> jurist = new TreeSet<Jurist>();
	TreeSet<Case> allCases = new TreeSet<Case>();

	Court(String name, String address) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		if (address != null && !address.isEmpty()) {
			this.address = address;
		}
	}

	public void addCase(Case newCase) {
		if (newCase != null) {
			allCases.add(newCase);
		}
	}
	
	public void printAllCases(){
		for (Case c : this.allCases) {
			System.out.println(c);
		}
	}

	public String toString() {
		return "Court name: " + this.name + "\nCourt address: " + this.address;
	}
}
