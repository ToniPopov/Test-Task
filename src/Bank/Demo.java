package Bank;

public class Demo {

	public static void main(String[] args) {
		Client client = new Client("Toni" , "Sofia",500,5000);
		Deposit dep = new Deposit("toni" ,5,555,444,5);
		Credit cred = new Credit("kolio" ,2,111,222,3);
		client.newDeposit(dep);
		client.arrPrint(client.depositList);
		client.newCredit(cred);
		client.arrPrint(client.creditList);
		
		System.out.println(client);
		
	}

}
