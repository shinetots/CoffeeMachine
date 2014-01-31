/* 
 * Sunshine E. Podiotan
 * BSCS-II
 * CSC 184
 * class CashBox - Tracks the amount of credit.
 * */

import java.util.Scanner;

public class CoffeeMachine {
	CashBox pCashBox = new CashBox();
	Mixer pMixer = new Mixer();
	Selector pSelector = new Selector(pCashBox, pMixer);
	Scanner scan = new Scanner(System.in);
	
		//main
	public static void main(String[] args) throws Exception{
		System.out.println("===============Welcome to Arnold's Coffee Machine=====================");
        System.out.println("Do you want to buy coffee? Please follow the following steps. Enjoy!\n"
        		+ "1.) Type 'insert' then your payment.   [ex.) insert 35] \n"
        		+ "2.) Select your desired flavor.        [ex.) select sweet] \n"
        		+ "3.) Here is our menu. \n \n"
        		+ " |---------------|------------------| \n"
        		+ " |     FLAVOR    |   PRICE (cents)  | \n"
        		+ " |---------------|------------------| \n"
        		+ " |     black     |       35         | \n"
        		+ " |---------------|------------------| \n"
        		+ " |     white     |       35         | \n"
        		+ " |---------------|------------------| \n"
        		+ " |     sweet     |       35         | \n"
        		+ " |---------------|------------------| \n"
        		+ " |     both      |       35         | \n"
        		+ " |---------------|------------------| \n"
        		+ " |   boullion    |       25         | \n"
        		+ " |---------------|------------------| \n \n"
        		+ "Enjoy your coffee! (^_^) \n \n");
		try{
			CoffeeMachine coffeeMachine = new CoffeeMachine();
	        while(coffeeMachine.doOneAction());
	        
		}
		catch(Exception e){
			System.out.println("Error!" + e);
		}
	}
	/**
	 * does the transaction
	 * */
	public boolean doOneAction(){
		String action = scan.next();
		if(action.equals("insert")){
			int value;
            value = scan.nextInt();
            pCashBox.deposit(value);
		}
		else if(action.equals("select")){
			String choice;
            choice = scan.next();
            pSelector.select(Selection.valueOf(choice.toLowerCase()));  
		}
		else if(action.equals("quit")){
			return false;
		}
		else{
			System.out.println("Error!");
		}
		return true;
	}
}
