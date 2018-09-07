package homeworks.lab2.prob2A_student_owned.externally_owned_two_setter;


public class GradeReport implements Comparable<GradeReport> {
	private Student student;
	private String grade;
	
	GradeReport(String grade) {
		this.grade = grade;
	}
	public void setStudent(Student s) {
		student = s;
	}
	public Student getStudent() {
		return student;
	}
	public String getGrade() {
		return grade;
	}
	@Override
	public int compareTo(GradeReport o) {
		return grade.compareTo(o.grade);
	}
}
