package cCard.Model;



public class GenerateMonthlyBillsCommand implements CCardCommands {
	private CreditCardAccount cc;
	
	public GenerateMonthlyBillsCommand(CreditCardAccount cc) {
		super();
		this.cc = cc;
	}

	@Override
	public void execute() {
		this.cc.generateMonthlyBills();
		
	}

}
