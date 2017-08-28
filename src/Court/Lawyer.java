package Court;

public class Lawyer extends Jurist{
	
	
	
	Lawyer(String name, int staj, int broiDela) {
		super(name, staj >= 0 ? staj : 0, broiDela >= 10 ? broiDela : 10);
	}

	@Override
	void askQuestion() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Ask question to the Accuser ");
		}
		for (int i = 0; i < 2; i++) {
			System.out.println("Ask question to the witneses ");
		}
	}
	@Override
	void takeNotes() {
		// TODO Auto-generated method stub
		
	}
}
