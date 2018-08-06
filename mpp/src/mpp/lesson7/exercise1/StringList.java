package mpp.lesson7.exercise1;

public interface StringList {
		
	/*String[] strArray();
	int size();*/
	void incrementSize();
	
	/** Adds a string to the end of the list */
	//public void add(String s);
	
	default void add(String s) {
		strArray()[size()] = s;
		incrementSize();
	}
	
	default String get(int i) {
		if (i < 0 || i >= size()) {
			return null;
		}
		return strArray()[i];
	}
	
	/** Gets the i_th string in the list */
	//public String get(int i);
	
	abstract String[] strArray();
	abstract int size();
	abstract void setSize(int val);
	
}
