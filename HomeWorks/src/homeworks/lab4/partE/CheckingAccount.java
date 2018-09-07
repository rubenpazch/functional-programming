package lab4.partE;

public class CheckingAccount  extends Account{
	private double balance;
	private double monthyFee;
	private String acctId;
	
	public CheckingAccount (String oacctId, double fee, double startBalance){
		this.acctId= oacctId;
		this.monthyFee = fee;
		this.balance = startBalance;
	}

	@Override
	public String getAccountID() {
		// TODO Auto-generated method stub
		return acctId;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public double computeUpdatedBalance() {
		// TODO Auto-generated method stub
		return balance-monthyFee;
	}
}
