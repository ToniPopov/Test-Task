package Bank;

public class Deposit extends BankAcount {

	double mounthSumDepPayment;

	Deposit(String name, int periodMounths, double interestYearProcent, double presentsLeva ) {
		super(name, periodMounths, interestYearProcent, presentsLeva);
		this.mounthSumDepPayment = presentsLeva*interestYearProcent/100;
	}
	public String toString(){
		return "Name: "+this.name+"\nPeriod for Mounth: "+this.periodMounths
				+"\nInterest for an year in %: "+this.interestYearProcent+"\nPresents: "+this.presentsLeva
				+" lv\nMounth deposit payent: "+this.mounthSumDepPayment;
	}
}
