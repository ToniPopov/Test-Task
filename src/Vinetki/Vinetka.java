package Vinetki;

import java.util.Date;

public abstract class Vinetka {

	private String color;
	private int price;
	protected String validPeriod;
	Date date;
	Date expDate;
	

	Vinetka(String color) {
		this.color = stringCheck(color);
//		this.validPeriod = stringCheck(validPeriod);
	}
	Vinetka(String color,int price) {
		this.color = stringCheck(color);
		setPrice(price);
	}

	public String stringCheck(String str) {
		if (str != null && !str.isEmpty()) {
			return str;
		} else {
			return "Default";
		}
	}

	public abstract Vinetka getVinetka(Driver driver,String validPeriod,PetrolStation station) ;

	public abstract void tapeVinetka();

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price > 0 ? price : 0;
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((validPeriod == null) ? 0 : validPeriod.hashCode());
//		return result;
//	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vinetka other = (Vinetka) obj;
		if (validPeriod == null) {
			if (other.validPeriod != null)
				return false;
		} else if (!validPeriod.equals(other.validPeriod))
			return false;
		return true;
	}

}
