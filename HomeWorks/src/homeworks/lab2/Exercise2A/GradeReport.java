package lab2.Exercise2A;

public class GradeReport {
	private Student student;

	public GradeReport() {
		super();
		student = new Student(this);
		System.out.println("inside gradereport empty construtor");
	}

	public GradeReport(Student student) {
		super();
		this.student = student;
		System.out.println("inside gradereport parameters construtor");
	}
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}



}
