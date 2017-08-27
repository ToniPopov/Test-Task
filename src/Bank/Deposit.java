package Bank;

public class Deposit extends BankAcount {

	double mounthSumDepPayment;

	Deposit(String name, int periodMounths, double interestYearProcent, double presentsLeva,
			double mounthSumDepPayment) {
		super(name, periodMounths, interestYearProcent, presentsLeva);
		this.mounthSumDepPayment = mounthSumDepPayment;
	}
	public String toString(){
		return "Name "+this.name+"\nPeriod for Mounth "+this.periodMounths
				+"\nInterest for an year in % "+this.interestYearProcent+"\nPresents lv"
				+"\nMounth deposit payent "+this.mounthSumDepPayment;
	}
}
