package lab2.Exercise2A;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student ruben = new Student();
		GradeReport ruben = new GradeReport();
		
		System.out.println(ruben.getClass().hashCode());
		System.out.println(ruben.getStudent().getGradeReport().getClass().hashCode());
	}

}
