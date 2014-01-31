/* 
 * Sunshine E. Podiotan
 * BSCS-II
 * CSC 184
 * class CashBox - Tracks the amount of credit.
 * */

public class CashBox {
	private int credit;
	//initialize value of credit to 0.
	public CashBox(){
		credit = 0;
	}
	/**
	 * @param amount - amount deposited by customer
	 * enables customer to deposit amount
	 * */
	public void deposit(int amount){
		credit += amount;
		System.out.println("CashBox: Depositing " + amount + " cents.");
		System.out.println("You now have " + credit + " cents deposit.");
	}
	/**
	 * CashBox returns change to customer
	 * */
	public void returnCoins(){
		System.out.println("CashBox: Returning " + credit + " cents.");
	}
	/**
	 * @param amount -price of coffee
	 * @return true if credit >= amount
	 * @return false if credit <= amount 
	 * */
	public boolean haveYou(int amount){
		if(credit >= amount){
            return true;
        }
		else{
            return false;
        }
	}
	/**
	 * @param amount - price of coffee
	 * money deposited is deducted and change is returned to customer if there's any
	 * */
	public void deduct(int amount){
		credit -= amount;
		returnCoins();
	}
}
