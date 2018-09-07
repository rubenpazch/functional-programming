package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private double maintenance;
	List<Aparment> listAparment =  new ArrayList<>(); 
	
	Building (double pomaintenance , List<Aparment> listAparments){
		maintenance =pomaintenance; 
		listAparment= listAparments;
	}

	public double getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(double maintenance) {
		this.maintenance = maintenance;
	}

	public List<Aparment> getListAparment() {
		return listAparment;
	}

	public void setListAparment(List<Aparment> listAparment) {
		this.listAparment = listAparment;
	}
	
	public double GetProfit() {
		double total = 0;
		for (Aparment aparment : listAparment) {
			total = total + aparment.getRent();
		}
		return total-maintenance;
	}
	
}
