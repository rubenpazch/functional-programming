package homeworks.lab2.prob2A_student_owned.otherpackage;

import homeworks.lab2.prob2A_student_owned.Student;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		List<Student> listOfStudents = createListOfStudents();
		assignGrades(listOfStudents, new String[]{"A", "B", "A", "C"});
		System.out.println("Students and their grades:\n  " + listOfStudents);
		
		//no way to create a GradeReport first, and pass in a student
		//GradeReport g = new GradeReport(null);

	}
	private static List<Student> createListOfStudents() {
		Student st1 = new Student("Bob");		
		Student st2 = new Student("Alan");		
		Student st3 = new Student("Dave");		
		Student st4 = new Student("Perry");	
		return Arrays.asList(st1, st2, st3, st4);
	}
	private static void assignGrades(List<Student> list, String[] grades) {
		for(int i = 0; i < grades.length; ++i) {
			list.get(i).getReport().setGrade(grades[i]);
		}
	}

}
