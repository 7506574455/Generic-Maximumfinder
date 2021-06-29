package com.Generic;

import java.util.Comparator;

public class Maximum  <T extends Comparable<T>> {

	T num1;
	T num2;
	T num3;
	
	 public static void main(String[] args) {
   	  System.out.println("Maximum Integer by creating Generic class :" + new Maximum(3, 7, 8).GenericMax());
   	  System.out.println("Maximum Float by creating Generic class :" + new Maximum(4.5f, 5.56f, 3.45f).GenericMax());
   	  System.out.println("Maximum Float by creating Generic class :" + new Maximum("orange","apple","mango").GenericMax());
   }
	
    public Maximum(T num1, T num2, T num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}


    public T GenericMax() {
    	return Maximum.GenericMax(num1, num2, num3);
    }

    
    public static <T extends Comparable<T>> T GenericMax(T num1, T num2, T num3) {
        T max = num1;
        if (num2.compareTo(max) > 0)
            max = num2;
        if (num3.compareTo(max) > 0)
            max = num3;
        return max;
    }

	
   

}