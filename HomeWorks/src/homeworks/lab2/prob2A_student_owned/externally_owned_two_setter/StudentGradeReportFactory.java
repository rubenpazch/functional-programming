package homeworks.lab2.prob2A_student_owned.externally_owned_two_setter;

/** Typical use: Loading data from database into class model */
public class StudentGradeReportFactory {
	
	public static StudentAndReport createStudentAndReport(String name, String grade) {
		GradeReport g = new GradeReport(grade);
		Student st = new Student(name);
		g.setStudent(st);
		st.setReport(g);
		return new StudentAndReport(st, g);
	}
}
