package lab2.Exercise4;
import java.util.*;

public class Student {
	String name;
	List<TranscriptEntry> grades;
	
	public Transcript getTranscript() {
		return new Transcript(grades, this);
		
	}
	
	Student(String name){
		this.name=name;
		grades=new ArrayList<TranscriptEntry>();
	}
	
	public List<TranscriptEntry> getGrades (){
		return grades;
	} 
	
}
