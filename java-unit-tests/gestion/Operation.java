package gestion;


public abstract class Operation {

	// This attribute memorizes the amount involved in the operation
	private float amount;
	
	// Sets the amount with the parameter
	public Operation(float amount) {
		this.amount = amount;
	}

	//  @uml.property name="amount"
	public float getAmount() {
		return amount;
	}

	// @uml.property name="amount"
	public void setAmount(float amount) {
		this.amount = amount;
	}

	// Returns the type of the operation as a String. 
	public abstract String getOperationType();

}
