package mpp.lesson9b.prob9;

import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Solution {
	
	public static void printSquares(int num)
	{		
	 IntStream.iterate(1, i ->i+1).limit(num).forEach(x ->  System.out.println(x*x) );	 
	}
	public static void printSquaresDouble(double num)
	{		
	 DoubleStream.iterate(1, i ->i+1).limit((long) num).forEach(x ->  System.out.println(x*x) );	 
	}
	public static void printSquearesDecimal(long a ) {
		LongStream.iterate(1, j->j+1).limit(a).forEach(x-> System.out.println(x*x));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//printSquares(4);
		
		//printSquaresDouble(7);
		
		printSquearesDecimal(5);
	}

}
