package Court;

import java.util.Random;

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

	public void makeConviction(boolean convic, Accused acused) {
		if (convic) {
			acused.conviction = new Random().nextInt(40) + 1;
			System.out.println("The judge "+this.name +"  condemned "+acused.name+" to "+acused.conviction +" years Prison!!!");
		}else{
			System.out.println("The citizen "+acused.name +" is innocent !!! ");
		}
	}

}
