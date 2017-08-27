package Court;

public class Juror extends Jurist implements Comparable<Juror>{

	Juror(String name, int staj, int broiDela) {
		super(name, staj > 0 ? staj : 0, broiDela > 0 ? broiDela : 0);
	}

	@Override
	void askQuestion() {
		// TODO Auto-generated method stub

	}

	@Override
	void takeNotes() {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(Juror o) {
		return (this.name.compareTo(o.name));
	}
	
	
}
