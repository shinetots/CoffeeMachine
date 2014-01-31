/* 
 * Sunshine E. Podiotan
 * BSCS-II
 * CSC 184
 * class Mixer - lets customer know that the coffee is being prepared. Does not do much.
 * */

public class Mixer{
	@SuppressWarnings("unused")
	private Selection selection;
	/**
	 * @param selection -an instance from the Selection class; 
	 * */
	public void make(Selection selection){
		 String choice;
	     choice = selection.toString().toLowerCase();
	     System.out.println("Mixer: Making " + choice);
	}
}
