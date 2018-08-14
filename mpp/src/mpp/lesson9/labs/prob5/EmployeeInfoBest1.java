package mpp.lesson9.labs.prob5;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

import javax.swing.text.StyledEditorKit.ForegroundAction;

@SuppressWarnings("rawtypes")
public class EmployeeInfoBest1 {

	static enum SortMethod {BYNAME, BYSALARY};

	final Function<Employee, String> byName = e -> e.getName();

	final Function<Employee, Integer> bySalary = e -> e.getSalary();

	final static class Pair<S, T> {
		S first;
		T second;

		Pair(S f, T t) {
			first = f;
			second = t;
		}

	}

	final Pair<Function, Function> byNamePair = new Pair<>(byName, bySalary);

	final Pair<Function, Function> bySalaryPair = new Pair<>(bySalary, byName);

	@SuppressWarnings("serial")
	final HashMap<SortMethod, Pair<Function, Function>> sortDiscriminator = new HashMap<SortMethod, Pair<Function, Function>>() {
		{
			put(SortMethod.BYNAME, byNamePair);

			put(SortMethod.BYSALARY, bySalaryPair);
		}
	};

	@SuppressWarnings("unchecked")
	public void sort(List<Employee> emps, SortMethod method) {

		Collections.sort(emps, Comparator.comparing(sortDiscriminator.get(method).first)
				.thenComparing(sortDiscriminator.get(method).second));
	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));

		EmployeeInfoBest1 ei = new EmployeeInfoBest1();

		ei.sort(emps, EmployeeInfoBest1.SortMethod.BYNAME);

		System.out.println(emps);
		// same instance
		ei.sort(emps, EmployeeInfoBest1.SortMethod.BYSALARY);
		System.out.println(emps);
		List<String> name = new ArrayList<String>();
		name.add("Moke");

		// char[] d = name.stream().toArray(int::new);
	}
}
