package lab2.Exercise2A;

public class Student {
	private String name;
	private GradeReport gradeReport;

	Student() {
		gradeReport = new GradeReport(this);
		System.out.println("inside student empty construtor");
	}

	public Student(GradeReport gradeReport) {
		super();
		this.gradeReport = gradeReport;
		System.out.println("inside student parameter construtor");
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GradeReport getGradeReport() {
		return gradeReport;
	}

	public void setGradeReport(GradeReport gradeReport) {
		this.gradeReport = gradeReport;
	}

	

}
