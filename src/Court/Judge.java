package Court;

public class Judge extends Jurist {

	Judge(String name, int staj, int broiDela) {
		super(name, staj >= 5 ? staj : 5, broiDela > 10 ? broiDela : 11);
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
