package Bank;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		Client client = new Client("Toni" , "Sofia",500,5000);
		Deposit shortDeposit = new Deposit("Short Deposit" ,3,3,5000);
		Deposit longDeposit = new Deposit("Long Deposit" ,12,5,5000);
		
//		4. Да се създадат 2 кредита – Home Credit с лихва 6% и Consumer Credit с лихва 10%. Като
//		периода по кредита се определя от клиента от банката.
//		5. Да се създаде 1 банка в България
		
		Credit homeCredit = new Credit("Home credit" , (new Random().nextInt(60)+1),6,30000);
		Credit consumerCredit = new Credit("Consumer credit" , (new Random().nextInt(60)+1),10,30000);
		
		
		
		Bank bank = new Bank("FIB","na ploshtada",1_000_000);
		
		
		
		bank.credits.add(homeCredit);
		bank.credits.add(consumerCredit);
		
		bank.deposits.add(longDeposit);
		bank.deposits.add(shortDeposit);
		bank.createClients();
		bank.createDeposits();
		bank.createCredit();
		
		
		System.out.println();
		bank.printAllClientInfo();
		System.out.println();
		
		System.out.println(bank);
		System.out.println();
		
	}

}
