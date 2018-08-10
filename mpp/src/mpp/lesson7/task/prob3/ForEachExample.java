package mpp.lesson7.task.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon","Away", "On Vacation", "Everywhere you want to be");
		Consumer<String> doSomething = (String s) -> System.out.println(s.toUpperCase());
		list.forEach(doSomething);
		//print each element of the list in upper case format
		
		
		List<Integer> listInts =Arrays.asList(2,2,34,5,6,8);
		Consumer<Integer> doIntegersonethimg = (Integer i) -> System.out.println(i);
		listInts.forEach(doIntegersonethimg);
		
		Person p1 = new Person("carlos");
		Person p2 = new Person("pedro");
		List<Person> lisperson = Arrays.asList(p1,p2);
		Consumer<Person> doperson = p -> System.out.println(p.getName());
		lisperson.forEach(doperson);
		
	}
	
	
	//implement a Consumer
	
	
}

