package lab4.partc;

public final class Paycheck {
	private double grossPay;
	final double FICA=0.23;
	final double stateTax=0.05;
	final double localTax=0.01;
	final double medicare=0.03;
	final double ssn=0.075;
	
	public Paycheck(double grossPay) {
		this.grossPay=grossPay;
	}
	
	public void print() {
		System.out.println("GrossPay: " + getGrossPay() + "\nNetPay: " + getNetPay() + "\nFICA: " + getFICA() + "\n"
				+ "STATETAX: " + getStateTax() + "\nLOCALTAX: " + getLocalTax() + "\nMEDICARE: " + getMedicare()
				+ "\nSOCSEC: " + getSsn() );
	}
	
	
	public double getGrossPay() {
		return grossPay;
	}

	
	public double getFICA() {
		return FICA*grossPay;
	}
	public double getStateTax() {
		return stateTax*grossPay;
	}
	public double getLocalTax() {
		return localTax*grossPay;
	}
	public double getMedicare() {
		return medicare*grossPay;
	}
	public double getSsn() {
		return ssn*grossPay;
	}
	public double getNetPay() {

		return (grossPay * (1 - (FICA + stateTax + localTax + medicare + ssn)));
	}
}
