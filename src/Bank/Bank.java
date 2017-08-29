package Bank;

import java.util.ArrayList;
import java.util.Random;

public class Bank {
	String name;
	String address;
	double moneyReserve;
	double depositCheck;
	ArrayList<Deposit> deposits = new ArrayList<Deposit>();
	ArrayList<Credit> credits = new ArrayList<Credit>();
	ArrayList<Client> clients = new ArrayList<Client>();

	Bank(String name, String address, double moneyReserve) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		if (address != null && !address.isEmpty()) {
			this.address = address;
		}
		if (moneyReserve >= 1_000_000) {
			this.moneyReserve = moneyReserve;
		}

	}

	public void createClients() {
		for (int i = 0; i < 10; i++) {
			this.clients.add(new Client(("Client " + i), ("liulin " + i), (new Random().nextInt(10000) + 5000),
					(new Random().nextInt(5000) + 1000)));
		}

	}

	public void createDeposits(){
		if (!this.deposits.isEmpty()) {
			for (int i = 0; i < this.clients.size(); i++) {
				int numOfDep = new Random().nextInt(this.deposits.size());
				this.deposits.get(numOfDep);
//				System.out.println(this.deposits.get(numOfDep));
//				System.out.println(numOfDep);
				double procent = (new Random().nextInt(21) + 80) ;
				System.out.println("Procenteeee "+procent);
				Deposit dep = new Deposit(deposits.get(numOfDep).name, deposits.get(numOfDep).periodMounths,
						deposits.get(numOfDep).interestYearProcent, (this.clients.get(i).getMoneyCash() * procent)/100);
				this.depositCheck += (this.clients.get(i).getMoneyCash() * procent)/100;
				this.moneyReserve += (this.clients.get(i).getMoneyCash() * procent)/100;
				this.clients.get(i).newDeposit(dep);
			}
		}
	}
	
	
	public void createCredit(){
		
		if (!this.credits.isEmpty()) {
			double creditsPayment=0;
			for (int i = 0; i < this.clients.size(); i++) {
				int numOfDep = new Random().nextInt(this.credits.size());
				if (!this.clients.get(i).creditList.isEmpty()) {
					for (int j = 0; j < this.clients.get(i).creditList.size(); j++) {
						if (this.clients.get(i).creditList.get(j) != null) {
							creditsPayment +=this.clients.get(i).creditList.get(j).mounthCreditPayment;
						}
					}
				}
				
				
				double creditInMoney = (new Random().nextInt(10000) + 5000) ;
				Credit cred = new Credit(credits.get(numOfDep).name, credits.get(numOfDep).periodMounths,
						credits.get(numOfDep).interestYearProcent, creditInMoney);
				if(cred.mounthCreditPayment <= ((this.clients.get(i).getMounthSalary()-creditsPayment)/2) && (this.moneyReserve - creditInMoney) > this.depositCheck*0.1){
					this.clients.get(i).moneyCash +=creditInMoney;
					this.moneyReserve -= creditInMoney;
					this.clients.get(i).newCredit(cred);
				}
				
			}
		}
	}
	
	public void printAllClientInfo() {
		if (!this.clients.isEmpty()) {
			for (int i = 0; i < this.clients.size(); i++) {
				System.out.println("===================================");
				System.out.println(this.clients.get(i));
				System.out.println();
				if (!this.clients.get(i).depositList.isEmpty()) {
					for (int j = 0; j < this.clients.get(i).depositList.size(); j++) {
						if (this.clients.get(i).depositList.get(j) != null) {
							System.out.println(this.clients.get(j).depositList.get(j));
						}
					}
				}System.out.println();
				if (!this.clients.get(i).creditList.isEmpty()) {
					for (int j = 0; j < this.clients.get(i).creditList.size(); j++) {
						if (this.clients.get(i).creditList.get(j) != null) {
							System.out.println(this.clients.get(i).creditList.get(j));
						}
					}
				}System.out.println("===================================");
			}
		}
	}

	@Override
	public String toString() {
		return "Bank name: " + this.name + "\nAddress: " + this.address + "\nMoney in reserve: " + this.moneyReserve
				+ "\nDeposit prodicts: " + this.deposits.size() + "\nCredit products: " + this.credits.size()
				+ "\nNumber of Clients: " + this.clients.size();
	}

}
