package lab4.partE;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	protected List<Account> accounts = new ArrayList<>();
	
	public Employee (String oname){
		this.name= oname;
	}
	
	public double computeUpdatedBalanceSum() {
		//implement
		double total = 0 ;
		for (Account account : accounts) {
			total = total + account.getBalance();
		}
		return total;
	}
	public void addAccount (Account param) {
		accounts.add(param);
	}
	
	public String getName() {
		return name;
	}

	
}
