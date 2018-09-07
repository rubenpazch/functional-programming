package lab4.partE;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double total = 0;
		for (Employee employee : list) {
			for (Account acct : employee.accounts) {
				total = total + acct.computeUpdatedBalance(); 
			}
		}
		
		return total;
	}
}
