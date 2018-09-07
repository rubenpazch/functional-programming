package lab5.DuckDemo.driver;

import lab5.DuckDemo.DecoyDuck;
import lab5.DuckDemo.Duck;
import lab5.DuckDemo.MallardDuck;
import lab5.DuckDemo.RedheadDuck;
import lab5.DuckDemo.RubberDuck;

public class Main {
	public static void main(String[] args) {
		Duck[] ducks = { new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck() };
		
		for(Duck d : ducks)
		{
			System.out.println(d.getClass().getSimpleName() + ":");
			d.display();
			d.fly();
			d.quack();
			d.swim();
		}
	}
}
