package project2;

public class Savings extends Account{
	public static int loyalty;//0 non-loyal 1 loyal
	private static final double monthlyInterest = 0.30;
	private static final double loyalMonthlyInterest = 0.45;
	private static final double fee = 6.00;
	private static final double feeWaived = 300.00;
	private static final double noFee = 0.00;
	private static final int nonLoyal = 0;
	private static final int loyal = 1;
	
	//for Money Market
	public Savings(Profile profile, double balance) {
        super(profile, balance);
	//this.loyalty = 0;
	       
    }
	
	public Savings(Profile profile, double balance, int loyalty) {
        super(profile, balance);
	this.loyalty = loyalty;
	       
    }
	public double monthlyInterest() {
		if(loyalty == 1) {
			return loyalMonthlyInterest;
		}
		 return monthlyInterest;
	 }
	 
	 public double fee() {
		 if(balance >= feeWaived) {
			 return noFee;
		 }
		 return fee;
	 }
	 
	 public String getType() {
		 String accountType = "Savings";
		 return accountType;
	 }
	 
	 public String isLoyal() {
		 if(loyalty == 1) {
			 return "::Loyal";
		 }
		 return null;
	 }
	 @Override
		public String toString() {
			//profile + balance
		 	String AccountString;
		 	if(loyalty == 1) {
		 		AccountString = getType() + "::" + holder.toString() + "::" + "Balance $" + String.format("%,.2f", balance) + isLoyal();
		 	}
		 	else {
		 		AccountString = getType() + "::" + holder.toString() + "::" + "Balance $" + String.format("%,.2f", balance);
		 	}
			 
			return AccountString;
		}
}
