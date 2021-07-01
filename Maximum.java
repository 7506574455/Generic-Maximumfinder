package com.Generic;

import java.util.Scanner;
//class
public class Maximum <T extends Comparable> {
	private T[] inputArray;

	
    public Maximum(T[] inputArray) {
        this.inputArray=inputArray;
    }

    
    private static <T extends Comparable> void getMax(T[] array){
        T max = array[0];
        for (int i=0;i<array.length; i++){
            if (array[i].compareTo(max)>0){
                max=array[i];
            }
        }
        Maximum.printMax(max);

    }
    
     
    private static<T> void printMax(T max) {
        System.out.println("Maximum : "+max);
    }
    
    //main method
    public static void main(String[] args) {
        
    	Integer[] intArray={10,9,8,7,6,5,56};
        Double[] doubleArray={4.3,6.76,3.56,98.43};
        String[] stringArray={"a","abc","pqr","xyz"};
        
        System.out.println("maximum of integer [10,9,8,7,6,5,56] values are");
        Maximum.getMax(intArray);
        
        System.out.println("maximum of Float [4.3,6.76,3.56,98.43] values are");
        Maximum.getMax(doubleArray);
        
        System.out.println("maximum of String [ a,abc,pqr,xyz ] values are");
        Maximum.getMax(stringArray);
    }

  
}