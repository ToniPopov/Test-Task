package Court;

public class Prosecutor extends Jurist implements IBlame{
	
	
	
	Prosecutor(String name, int staj, int broiDela) {
		super(name, staj > 10 ? staj : 10, broiDela > 10 ? broiDela : 11);
	}

	@Override
	void askQuestion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void takeNotes() {
		// TODO Auto-generated method stub
		
	}
}
