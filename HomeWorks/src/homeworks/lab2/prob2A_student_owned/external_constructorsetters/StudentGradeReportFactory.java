package homeworks.lab2.prob2A_student_owned.external_constructorsetters;


/** Typical use: Loading data from database into class model */
public class StudentGradeReportFactory {
	
	public static StudentAndReport createStudentAndReport(String name, String grade) {
		GradeReport g = new GradeReport(grade);
		Student st = new Student(name, g);
		g.setStudent(st);
		return new StudentAndReport(st, g);
	}
}
