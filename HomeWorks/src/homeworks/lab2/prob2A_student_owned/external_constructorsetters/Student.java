package homeworks.lab2.prob2A_student_owned.external_constructorsetters;

public class Student {
	private GradeReport report;
	private String name;
	
	//package level access to prevent access from outside
	Student(String nm, GradeReport report) {
		name = nm;
		this.report = report;
		
	}
	public String getName() {
		return name;
	}
	public GradeReport getReport() {
		return report;
	}
}
