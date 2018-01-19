package coinpurse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MoneyUtil {

	public static void sortCoins(List<Coin> coins) {
		
		Collections.sort(coins);
		
	}
	
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
