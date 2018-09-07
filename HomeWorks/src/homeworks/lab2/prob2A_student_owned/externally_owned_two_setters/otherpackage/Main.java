package lesson2.labsolns.prob2A_externally_owned_two_setters.otherpackage;
import homeworks.lab2.prob2A_student_owned.externally_owned_two_setter.GradeReport;
import homeworks.lab2.prob2A_student_owned.externally_owned_two_setter.StudentGradeReportFactory;
import homeworks.lab2.prob2A_student_owned.externally_owned_two_setter.StudentAndReport;
import java.util.*;



public class Main {

	public static void main(String[] args) {
		//two setters
		printTopStudents();
	}
	public static void printTopStudents() {
		Collection<DataRecord> data = Database.h.values();
		List<GradeReport> reports = new ArrayList<>();
		for(DataRecord d : data) {
			StudentAndReport sr 
			  = StudentGradeReportFactory
			      .createStudentAndReport(d.getName(), d.getGrade());
			reports.add(sr.report);	
		}
		
		Collections.sort(reports);
		Iterator<GradeReport> it = reports.iterator();
		System.out.println("A Students:");
		GradeReport next = null;
		while((next =it.next()) != null && next.getGrade().equals("A")) {
			System.out.print(next.getStudent().getName() + " ");
		}
	}
	

}
