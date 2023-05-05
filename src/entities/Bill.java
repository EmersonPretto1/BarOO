package entities;

public class Bill {
	
	
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	private final double beerPrice = 5.0;
    private final double softDrinkPrice = 3.0;
    private final double barbecuePrice = 7.0;
    private final double maleTicketPrice = 10.0;
    private final double femaleTicketPrice = 8.0;
    private final double coverPrice = 4.0;
    
    public double feeding() {
    	return beer * beerPrice + softDrink * softDrinkPrice + barbecue * barbecuePrice;
    }
    
    public double ticket() {
    	if(gender == 'M') {
    		return maleTicketPrice;
    	}
    	else {
    		return femaleTicketPrice;
    	}
    }
    
    public double cover() {
    	if(feeding() > 30.0) {
    		return 0.0;
    		
    	}
    	return coverPrice;
    }
    
    public double total() {
    	return cover() + ticket() + feeding();
    }
    
}   
    