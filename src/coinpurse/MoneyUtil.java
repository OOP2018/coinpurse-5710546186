package coinpurse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Do the utility stuff to a list of coin
 * 
 * @author Kaninpat
 *
 */
public class MoneyUtil {

	/**
	 * Sort a coin list
	 * 
	 * @param coins for sorting
	 */
	public static void sortCoins(List<Coin> coins) {
		
		Collections.sort(coins);
		
	}
	
	/**
	 * Create a new array of coin of this currency
	 * 
	 * @param coins for filtering
	 * @param currency for a new array
	 * @return a coin list of that currency
	 */
	public static List<Coin> filterByCurrency(List<Coin> coins, String currency){
		
		List<Coin> filteredList = new ArrayList<Coin>();
		
		for(Coin c : coins) {
			if(c.getCurrency().equalsIgnoreCase(currency)) {
				filteredList.add(c);
			}
		}
		return filteredList;
		
	}
	
	public static void main(String[] args) {
		
		List<Coin> coins = new ArrayList<Coin>();
		coins.add(new Coin(10.0, "Baht"));
		coins.add(new Coin(0.5, "Baht"));
		coins.add(new Coin(5.0, "Rupie"));
		coins.add(new Coin(2.0, "Baht"));
		coins.add(new Coin(0.5, "Baht"));
		coins.add(new Coin(1.0, "Rupie"));
		coins.add(new Coin(0.5, "Baht"));
		coins.add(new Coin(0.5, "Baht"));
		System.out.println(coins);
		sortCoins(coins);
		System.out.println(filterByCurrency(coins, "rupie"));
		
	}
	
}
