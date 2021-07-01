package com.Generic;

import java.util.Scanner;
           //class
public class Maximum {
	static Scanner scanner = new Scanner(System.in);
	//main method
    public static void main(String[] args) {
        System.out.println("Press 1 to find maximum of Integers\nPress 2 to find maximum of Float number\nPress 3 to find maximum of String");
        System.out.print("Enter option : ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter a size of Integer array: ");
                int size = scanner.nextInt();
                Integer[] integersArray = new Integer[size];
                integersArray = printInteger(integersArray, size);
                Integer integerMax = findIntegerMax(integersArray);
                System.out.println("Maximum integer value is :" + integerMax);
                break;
            case 2:
                System.out.println("Enter a size of float array: ");
                size = scanner.nextInt();
                Float[] floatsArray = new Float[size];
                floatsArray = printFloat(floatsArray, size);
                Float floatMax = findFloatMax(floatsArray);
                System.out.println("Maximum float number is :" + floatMax);
                break;
            case 3:
                System.out.println("Enter a size of String array: ");
                size = scanner.nextInt();
                String[] stringsArray = new String[size];
                stringsArray = printString(stringsArray, size);
                String stringMax = findStringMax(stringsArray);
                System.out.println("Maximum String is :" + stringMax);
                break;
            default:
                System.out.println("Invalid input.");
        }
    }

    public static Integer[] printInteger(Integer[] integersArray, int size) {
        for (int i = 0; i<size; i++) {
            System.out.println("Enter array value : ");
            integersArray[i] = scanner.nextInt();
        }
        return integersArray;
    }

    public static Float[] printFloat(Float[] floatsArray, int size) {
        for (int i = 0; i<size; i++) {
            System.out.println("Enter array value : ");
            floatsArray[i] = scanner.nextFloat();
        }
        return floatsArray;
    }

    public static String[] printString(String[] stringsArray, int size) {
        for (int i = 0; i<size; i++) {
            System.out.println("Enter array value : ");
            stringsArray[i] = scanner.next();
        }
        return stringsArray;
    }


    public static Integer findIntegerMax(Integer[] integers) {
        Integer max = integers[0];
        for (Integer i : integers) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }
        return max;
    }

    public static Float findFloatMax(Float[] floats) {
        Float max = floats[0];
        for (Float i : floats) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }
        return max;
    }

    public static String findStringMax(String[] strings) {
        String max = strings[0];
        for (String i : strings) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }
        return max;
	
    }
    

}