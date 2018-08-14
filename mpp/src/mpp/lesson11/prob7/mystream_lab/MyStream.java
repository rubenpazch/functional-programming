package mpp.lesson11.prob7.mystream_lab;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStream<T> {
	
	private List<T> elements;
	
	public static <T> MyStream<T> of(List<T> aList) {
		//implement
		MyStream<T>ms = new MyStream<T>(aList);
		return ms;
	}
	private MyStream(List<T> aList) {
		//implement
		elements=aList;		
	}
	
	public static <S> MyStream<S> concat(MyStream<S> s1, MyStream<S> s2) {
		//implement
		List<S> list1=s1.asList();
		list1.addAll(s2.asList());
		return MyStream.of(list1);
	}
	
	public <R> MyStream<R> flatMap(Function<T, MyStream<R>> mapper) {
		//implement
		MyStream<R> growingStream = MyStream.of(new ArrayList<R>());
		for(T el:elements) {
			MyStream.concat(growingStream, mapper.apply(el));
		}
		return growingStream;
	}
	
	public List<T> asList() {
		//implement
		return elements;
	}
	
	public <R> MyStream<R> map(Function<T,R> mapper) {
		//implement
		List<R> elts = new ArrayList<>();
		for (T elt: elements) {
			elts.add(mapper.apply(elt));
		}				
		return MyStream.of(elts);
	}
	
	public MyStream<T> filter(Predicate<T> predicate) {
		//implement
		List<T> elts = new ArrayList<>();
		for (T elt : elements) {
			if(predicate.test(elt)) {
				elts.add(elt);
			}
		}
		return MyStream.of(elts);
	}
}
