package homeworks.lab2.prob2A_student_owned.externally_owned_two_setter;



public class Student {
	private GradeReport report;
	private String name;
	Student(String nm) {
		name = nm;
	}
	public String getName() {
		return name;
	}
	public void setReport(GradeReport report) {
		this.report = report;
	}
	public GradeReport getReport() {
		return report;
	}
}
