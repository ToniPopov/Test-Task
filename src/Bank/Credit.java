package Bank;

public class Credit extends BankAcount {

	double mounthCreditPayment;

	Credit(String name, int periodMounths, double interestYearProcent, double presentsLeva) {
		super(name, periodMounths, interestYearProcent, presentsLeva);
		this.mounthCreditPayment = interestYearProcent*presentsLeva/100;
	}
	public String toString(){
		return "Name: "+this.name+"\nPeriod for Mounth: "+this.periodMounths
				+"\nInterest for an year in %: "+this.interestYearProcent+"\nPresents: "+this.presentsLeva
				+" lv\nMounth credit payment: "+this.mounthCreditPayment;
	}
}
