package Court;

public class Lawyer extends Jurist{
	
	
	
	Lawyer(String name, int staj, int broiDela) {
		super(name, staj >= 0 ? staj : 0, broiDela >= 10 ? broiDela : 10);
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
