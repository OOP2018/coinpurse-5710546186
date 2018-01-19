package coinpurse;

/**
 * Coins represents coinage(money) with a fixed value and currency.
 * 
 * @author Kaninpat
 *
 */
public class Coin implements Comparable<Coin>{

	//Value for coin
	private double value;
	//Currency for coin
	private String currency;
	
	/**
	 * Construct a coin with a value and currency
	 * 
	 * @param value for creating a coin
	 * @param currency for creating a coin
	 */
	public Coin(double value, String currency) {
		
		this.value = value;
		this.currency = currency;
		
	}
	
	/**
	 * Get coin's value
	 * 
	 * @return value of a coin
	 */
	public double getValue() {
		
		return this.value;
		
	}
	
	/**
	 * Get coin's currency
	 * 
	 * @return currency of a coin
	 */
	public String getCurrency() {
		
		return this.currency;
		
	}
	
	/**
	 * Do the checking if two coins are equal
	 * 
	 * @param obj is a coin to check if it's equal to this coin
	 * @return true if they are equal, false otherwise
	 */
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

	/**
	 * Compare two coins value
	 * 
	 * @param compare this coin's value to coin's value
	 * @return -1 if this coin's value is lower than coin's value
	 * 1 if this coin's value is greater than coin's value
	 * 0 if their value are equal to each other
	 */
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
	
	/**
	 * Show coin's value with its currency
	 */
	public String toString() {
		
		return this.value + "-" + this.currency;
				
	}
	
}
