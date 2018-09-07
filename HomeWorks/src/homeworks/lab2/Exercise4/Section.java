package lab2.Exercise4;

import java.util.*;

public class Section {
	String courseName;
	int sectionNumber;
	List<TranscriptEntry> gradeSheet;
	
	Section(String cursename){
		this.courseName=cursename;
		gradeSheet= new ArrayList<TranscriptEntry>();
	}
	
	public List<TranscriptEntry> getGradesSheets (){
		return gradeSheet;
	}
	
}
