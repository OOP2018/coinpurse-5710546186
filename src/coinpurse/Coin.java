package coinpurse;

public class Coin implements Comparable<Coin>{

	private double value;
	private String currency;
	
	public Coin(double value, String currency) {
		
		this.value = value;
		this.currency = currency;
		
	}
	
	public double getValue() {
		
		return this.value;
		
	}
	
	public String getCurrency() {
		
		return this.currency;
		
	}
	
	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;
		}
		if(obj.getClass() != this.getClass()) {
			return false;
		}
		
		Coin other = (Coin) obj;
		if(this.currency.equalsIgnoreCase(other.currency) && this.value == other.value) {
			return true;
		}
		
		return false;
		
	}

	public int compareTo(Coin coin) {
		
		if(Double.compare(this.value, coin.value) < 0) {
			return -1;
		}
		else if(Double.compare(this.value, coin.value) > 0) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
	public String toString() {
		
		return this.value + "-" + this.currency;
				
	}
	
}
