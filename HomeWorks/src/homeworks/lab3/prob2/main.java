package lab3.prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class main {
	
	public static void main(String[] args) {
		Aparment ap1 = new Aparment("the aquare", 1000);
		Aparment ap2 = new Aparment("the rose", 2000);
		
		List<Aparment> la1 = Arrays.asList(ap1,ap2);
		
		Building bl1 = new Building(100, la1);	
		
		System.out.println("building #1 profit "+bl1.GetProfit());
		
		Aparment ap3 = new Aparment("the view", 3000);
		Aparment ap4 = new Aparment("the hight", 4000);
		
		List<Aparment> la2 = Arrays.asList(ap3,ap4);
			
		Building bl2 = new Building(200, la2);
				
		System.out.println("building #2 profit "+bl2.GetProfit());
		
		List<Building> lb1 = Arrays.asList(bl1,bl2);
		
		LandLord landlord1 = new LandLord("desconocido", lb1);
		
		System.out.println("total monthly profit "+ landlord1.MonthlyTotalProfits());
		
	}
	
}
