package com.company;

import java.text.MessageFormat;
import java.util.Arrays;

public class ArraysAndStrings {

    public static int MaxArr(int[] array ){
        int result=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>result)
                result=array[i];
        }
        return result;
    }
    public static int FindSymbols(char a,String TestString){
        int count =0;
        for(char ch:TestString.toCharArray()) {
            if (a==ch) count++;
        }
        return count;
    }
    public static int FindNumOfSymbols(String TestString2){
        int count=0;
        for (char ch:TestString2.toCharArray()){
            count++;
        }
        return count;
    }
    public static String BeautifullLog(String a,String b){
        return MessageFormat.format("There is no {0} and {1} so test is passed", a, b);
       //return "There is no "+a+" and "+b+" so test is passed";

    }
    public static String BeautifullLog2(String a,String b){
        return String.format("There is no %1s and %2s so test is passed", a, b);
    }
    public static String BeautifullLog3(String a,int b){
        return String.format("My name is %1s and I am %2d years old", a, b);
    }

    public static int[] InvertedArray(int[] array){
        int[] invertedArray = new int[array.length] ;
        for (int i =0;i<array.length;i++){
            invertedArray[i] = array[array.length-1-i];
        }
        return invertedArray;
    }

    public static String InvertedString(String TestString){
        char[] invertedString = new char[TestString.length()] ;
        for (int i =0;i<TestString.length();i++){
            invertedString[i] = TestString.charAt(TestString.length()-1-i);
        }
        return new String (invertedString);
    }

    public static int[] filteredArray(int[] array){
        int[] filteredArray = new int[array.length];
        int k=0;
        for (int i=0;i<array.length;i++){
            if (array[i]%2==0){
                filteredArray[k]= array[i];
                k++;
            }
        }
        return Arrays.copyOf(filteredArray,k);
    }

    public static boolean defineAnagramm(String FirstString,String SecondString){

        if (FirstString==""||SecondString=="") throw new IllegalArgumentException("String should have at least one symbol");
        for(int i=0;i<FirstString.length();i++){
            boolean isFound=false;
          for (int j=0;j< SecondString.length();j++){
             if (FirstString.charAt(i)==SecondString.charAt(j)) isFound=true;
          }
          if (!isFound) return false;
        }
        return  true;
    }

    public static boolean definePalindrome(String TestString){
         String str = TestString.toLowerCase();
         str = str.replaceAll(" ","");
         for (int i=0;i<(str.length()/2);i++){
            boolean isMatched=false;
            if (str.charAt(i)==str.charAt((str.length()-1-i))) isMatched=true;
            if (!isMatched) return false;
        }
        return true;
    }

    public static int findMediane(int[] testArray){
        /*int result = TestArray[0];
        for (int i=0;i<TestArray.length;i++){
            int less=0;
            int more=0;
            for (int j=0;j<TestArray.length;j++){
                if (TestArray[i]<TestArray[j])
                    more++;
                if (TestArray[i] > TestArray[j])
                    less++;

            }
            if (more==less) return TestArray[i];
            if (more-less)=1 return result=TestArray[i];
        }*/
        int[] copy = Arrays.copyOf(testArray, testArray.length);
        Arrays.sort(copy);
        if (copy.length%2==1) return copy[copy.length/2];
        return (copy[copy.length/2-1]+copy[copy.length/2])/2;
    }
}
