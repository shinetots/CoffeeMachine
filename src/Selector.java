/* 
 * Sunshine E. Podiotan
 * BSCS-II
 * CSC 184
 * class Selector - Tracks the amount of credit.
 * */

public class Selector{
	private CashBox pCashBox;
	private Mixer pMixer;
	/**
	 * @param pC - an object from CashBox class
	 * @param pM - an object from Mixer class
	 * initialize values
	 * */	
	public Selector(CashBox pC, Mixer pM){
		pCashBox = pC;
		pMixer = pM;
	}
	/**
	 * @param selection - an object from Selection class
	 * if amount is sufficient, coffee will be made
	 * if not, an error message will appear
	 * */
	public void select(Selection selection){
		int amount = selection.priceOf();
		
		if(pCashBox.haveYou(amount)){
			pMixer.make(selection);
			pCashBox.deduct(amount);
		}
		else {
			System.out.println("Selector: Insufficient funds.");
		}
	}
}
