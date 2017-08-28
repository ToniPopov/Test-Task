package Bank;

import java.util.ArrayList;
import java.util.Iterator;

public class Client {
	private String name;
	private String address;
	double moneyCash;
	
	private double mounthSalary;
	ArrayList<Credit> creditList = new ArrayList<Credit>();
	ArrayList<Deposit> depositList = new ArrayList<Deposit>();

	Client(String name, String address, double moneyCash, double mounthSalary) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		if (address != null && !address.isEmpty()) {
			this.address = address;
		}
		if (moneyCash >= 0) {
			this.moneyCash = moneyCash;
		}
		if (mounthSalary >= 0) {
			this.mounthSalary = mounthSalary;
		}
	}

	public void newDeposit(Deposit deposit) {
		if (deposit != null) {
			depositList.add(deposit);
		}
	}

	public void newCredit(Credit credit) {
		if (credit != null) {
			creditList.add(credit);
		}
	}

	public void arrPrint(ArrayList<?> list) {
		System.out.println("----------------------");
		System.out.println(list.get(0).getClass().getSimpleName() + ":");
		for (Iterator<?> it = list.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
		System.out.println("----------------------");
	}

	public String toString() {
		return "Name: " + this.name + "\nAddress: " + this.address + "\nMoney in cash: " + this.moneyCash
				+ "\nMounth salary lv: " + this.mounthSalary + "\nNumber of credits: " + this.creditList.size()
				+ "\nNumber of deposits: " + this.depositList.size();
	}
	public double getMounthSalary(){
		return this.mounthSalary;
	}
	public double getMoneyCash() {
		return this.moneyCash;
	}
}
