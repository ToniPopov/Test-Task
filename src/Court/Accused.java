package Court;

public class Accused extends Citizen {

	int conviction;
	Lawyer lawyer ;
	
	Accused(String name, String address, int age,Lawyer lawyer) {
		super(name, address, age);
		if( lawyer != null){
			this.lawyer = lawyer;
		}
	}

}
