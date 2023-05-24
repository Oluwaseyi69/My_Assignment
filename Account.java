public class Account {

	private String name; // why do we have private here and not public
	private double balance;
	
	public Account(String name, double balance){
	
	 this.name = name;
	 
	 if (balance > 0.0){
	      this.balance = balance;
	     }
	     
	 }    
	// methods that deposits (adds) only a valid amount i.e #50, to the balance
	// what does it mean to get error; illegal start of expression
	public void deposit (double depositAmount ){
	   if (depositAmount > 0.0) {
	       balance = balance + depositAmount;
	   }
	 }
	
	// methods that return the account balance
	public double getBalance(){
	  return balance;
	}
	// methods that set the name
	public void setName( String name){
	   this.name = name; 
	}
	
	// methods that return the name
	public String getName(){
	  return name;
	}
	}
