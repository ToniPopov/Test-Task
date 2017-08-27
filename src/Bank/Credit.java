package Bank;

public class Credit extends BankAcount {

	double mounthCreditPayment;

	Credit(String name, int periodMounths, double interestYearProcent, double presentsLeva,
			double mounthCreditPayment) {
		super(name, periodMounths, interestYearProcent, presentsLeva);
		this.mounthCreditPayment = mounthCreditPayment;
	}
	public String toString(){
		return "Name "+this.name+"\nPeriod for Mounth "+this.periodMounths
				+"\nInterest for an year in % "+this.interestYearProcent+"\nPresents lv"
				+"\nMounth credit payment "+this.mounthCreditPayment;
	}
}
