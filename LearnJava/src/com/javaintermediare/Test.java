package com.javaintermediare;
import static java.lang.Math.*;
public class Test{

	public static void main(String[] args) {
		System.out.println(abs(-4));
		System.out.println(Math.cos(-4));
	}
	public static int abs(int value){
		if(value >= 0){
			return value;
		}else {
			return -value;
		}
	}
}
