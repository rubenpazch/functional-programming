package mpp.lesson10.prob3;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FixThisSoln {
	/* This method creates a compiler error -- try to fix it*/
	List<String> processList(List<String> list)  {

	    return list.stream()
	    		   .map(x -> doNothingIfShort(x)) 
	               .collect(Collectors.toList());
	 
	}
	
	 
	String doNothingIfShort(String input) {
	 
		try {
			if (input.length() > 3) throw new InputTooLongException();
			return input;
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void main(String[] args) {
		FixThisSoln ft = new FixThisSoln();
		List<String> words1 = Arrays.asList("not", "too", "big", "yet");
		System.out.println(ft.processList(words1));
		
		// this call will result in runtime exception
		List<String> words2 = Arrays.asList("nott", "too", "big", "yet");
		System.out.println(ft.processList(words2));
	}
	
	class InputTooLongException extends Exception {
		private static final long serialVersionUID = 1L;
		public InputTooLongException() {
			super("Must be length 3 or less");
		}
		public InputTooLongException(String s) {
			super(s);
		}
		public InputTooLongException(Throwable t) {
			super(t);
		}
	}
}