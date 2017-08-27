package Court;

public class Accuser extends Citizen implements IBlame{

	Accuser(String name, String address, int age) {
		super(name, address, age);
	}
}
