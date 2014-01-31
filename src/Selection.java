/* 
 * Sunshine E. Podiotan
 * BSCS-II
 * CSC 184
 * enum Selection -
 * Provides conversions to and from ints and strings.
 * */
public enum Selection {
	black(35), white(35), sweet(35), both(35), boullion(25);
	private int price;
	/**
	 * @param price -price of each flavor; sets price for each flavor
	 * */
	Selection(int price){
		this.price = price;
	}
	/**
	 * @return price - get the price of selected flavor of coffee
	 * */
	public int priceOf(){
		return price;
	}			
}
