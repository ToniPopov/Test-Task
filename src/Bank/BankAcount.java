package Bank;

public abstract class BankAcount {
	String name;
	int periodMounths;
	double interestYearProcent;
	double presentsLeva;

	BankAcount(String name, int periodMounths, double interestYearProcent, double presentsLeva) {
		this.name = name;
		this.periodMounths = periodMounths;
		this.presentsLeva = presentsLeva;
		this.interestYearProcent = interestYearProcent;
	}
	
}
