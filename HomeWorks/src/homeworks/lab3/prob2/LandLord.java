package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandLord {
	private String name;
	private List<Building> buildings = new ArrayList<>();
	
	LandLord (String poname, List<Building> pobuildings){
		name = poname;
		buildings = pobuildings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double MonthlyTotalProfits() {
		double total = 0;
		for (Building building : buildings) {
			total = total + building.GetProfit();
		}
		return total;
	}
	
	
}
