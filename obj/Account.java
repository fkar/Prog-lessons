package obj;

public class Account {
	Person accountowner;        //reference variable
    static double balance;
    double earnedInterest;
    static double interest = 3.5;           //class variable  
    
    //instance methods
    public static void moneyTransaction(double inputMoney){
    	//withdraw money from account
    	if(inputMoney < 0 && (balance + inputMoney) < 0)
    		System.out.println("Withdraw not allowed!");
    	else
    		balance = balance + inputMoney;
    }
     
    public void countDailyInterest(){
    	earnedInterest = earnedInterest + balance * interest/100/365; 
    }
    
    public void addInterest(){
    	balance = balance + earnedInterest;
    	earnedInterest = 0;
    }
    
	public static void main(String[] args) {
		Account.balance = 50000;
		moneyTransaction(2000.0);
		System.out.println("The total of balance in my account: " + Account.balance + " Dinar");

	}

}
