package gestion;


public class DepositOperation extends Operation {

	// Calls the constructor of super class with the parameter amount
	public DepositOperation(float amount) {
		super(amount);
	}

	// returns "Deposit"
	public String getOperationType() {
		return "Deposit";
	}

}
