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
		
		Credit homeCredit = new Credit("Home credit" , new Random().nextInt(24),6,30000);
		Credit consumerCredit = new Credit("Consumer credit" , (new Random().nextInt(60)+1),10,30000);
		
		
		
		Bank bank = new Bank("FIB","na ploshtada",1_000_000);
		
		bank.credits.add(homeCredit);
		bank.credits.add(consumerCredit);
		
		bank.deposits.add(longDeposit);
		bank.deposits.add(shortDeposit);
		
		System.out.println(client);
		System.out.println();
		
		System.out.println(bank);
		
		System.out.println(homeCredit);
		System.out.println();
		System.out.println(consumerCredit);
		System.out.println();
		System.out.println(shortDeposit);
		System.out.println();
		System.out.println(longDeposit);
		
		
//		client.newDeposit(longDeposit);
//		
//		Credit cred = new Credit("kolio" ,2,111,222,3);
//		client.newDeposit(shortDeposit);
//		client.arrPrint(client.depositList);
//		client.newCredit(cred);
//		client.arrPrint(client.creditList);
//		
//		System.out.println(client);
		
	}

}
