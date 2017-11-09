package gestion;


public class WithdrawOperation extends Operation {

	// calls the super constructor with the amount
	public WithdrawOperation(float amount) {
		super(amount);
	}

	// returns "Withdraw"
	public String getOperationType() {
		return "Withdraw";		
	}

}
