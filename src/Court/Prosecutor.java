package Court;

public class Prosecutor extends Jurist implements IBlame{
	
	
	
	Prosecutor(String name, int staj, int broiDela) {
		super(name, staj > 10 ? staj : 10, broiDela > 10 ? broiDela : 11);
	}

	@Override
	void askQuestion() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Ask question to the Accuser ");
		}
		for (int i = 0; i <5; i++) {
			System.out.println("Ask question to the witneses ");
		}		
	}

	@Override
	void takeNotes() {
		// TODO Auto-generated method stub
		
	}
}
