package Court;

public abstract class Jurist {

	String name;
	int staj;
	int broiDela;
	
	Jurist(String name , int staj , int broiDela){
		if(name !=null && !name.isEmpty()){
			this.name = name;
		}
		this.staj = staj;
		this.broiDela = broiDela;
		
	}
	
	@Override
	public String toString() {
		return "Jurist name: " + name + "\nStaj: " + staj + "\nBroi dela: " + broiDela + "\n";
	}

	abstract void askQuestion();
	abstract void takeNotes();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jurist other = (Jurist) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
