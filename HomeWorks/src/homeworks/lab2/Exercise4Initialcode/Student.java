package homeworks.lab2.Exercise4Initialcode;

import java.util.*;

public class Student {
	String id;
	String name;
	List<TranscriptEntry> grades;
	
	public Transcript getTranscript() {
		return new Transcript(grades, this);
		
	}
	
}
