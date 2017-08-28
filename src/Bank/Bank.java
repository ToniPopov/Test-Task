package Bank;

import java.util.ArrayList;

public class Bank {
	String name;
	String address;
	double moneyReserve;
	ArrayList<Deposit> deposits = new ArrayList<Deposit>();
	ArrayList<Credit> credits = new ArrayList<Credit>();
	ArrayList<Client> clients = new ArrayList<Client>();

	Bank(String name, String address,double moneyReserve) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		if (address != null && !address.isEmpty()) {
			this.address = address;
		}
		if( moneyReserve >= 1_000_000){
			this.moneyReserve=moneyReserve;
		}
	}

	@Override
	public String toString() {
		return "Bank name: " + this.name + "\nAddress: " + this.address + "\nMoney in reserve: " + this.moneyReserve + "\nDeposit prodicts: "
				+ this.deposits.size() + "\nCredit products: " + this.credits.size() + "\nNumber of Clients: "+this.clients.size();
	}

}
