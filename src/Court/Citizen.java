package Court;

public class Citizen {

	String name;
	String address;
	int age;
	
	
	Citizen(String name , String address,int age){
		if(name != null && !name.isEmpty()){
			this.name = name;
		}
		if(address != null && !address.isEmpty()){
			this.address = address;
		}
		if( age > 0){
			this.age = age;
		}
	}
}
