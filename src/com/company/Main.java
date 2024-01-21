package com.company;


import java.util.Arrays;

import static com.company.MutualDivider.minMutualMultyplier;
import static com.company.MutualDivider.mutualDivider;


public class Main {

    public static void main(String[] args) {
            System.out.println(factorial(5));
            System.out.println(factorialOldSchool(5));
            /*for (int i=1;i<=3;i++)*/ System.out.println(fibonacciClass.fibonacci(7));
            System.out.println(fibonacciClass.fibonacciOldSchool(7));
            System.out.println(ArraysAndStrings.MaxArr(new int[]{1, 8, 16, 7, 54, 29}));
            System.out.println(ArraysAndStrings.FindSymbols('а',"Мама мыла раму"));
            System.out.println(ArraysAndStrings.FindNumOfSymbols("От топота копыт пыль по полю летит"));
            System.out.println(ArraysAndStrings.BeautifullLog("Errors","Exceptions"));
            System.out.println(ArraysAndStrings.BeautifullLog2("Errors","Exceptions"));
            System.out.println(ArraysAndStrings.BeautifullLog3("Nastya",37));
            System.out.println(Arrays.toString(ArraysAndStrings.InvertedArray(new int[]{1, 8, 16, 7, 54, 29})));
            System.out.println(ArraysAndStrings.InvertedString("А роза упала на лапу азора"));
            System.out.println(Arrays.toString(ArraysAndStrings.filteredArray(new int[]{1, 8, 16, 7, 54, 29})));
            System.out.println(mutualDivider(36,36));
            System.out.println(ArraysAndStrings.defineAnagramm("нитка","ткани"));
            System.out.println(ArraysAndStrings.findMediane(new int[]{1, 8, 16, 7, 54, 29,4}));
            System.out.println(ArraysAndStrings.definePalindrome("А роза упала на лапу азора"));
            System.out.println(minMutualMultyplier(6,15));

    }


    public static int factorial (int n) {
        if (n<1) throw new IllegalArgumentException("Incorrect arg "+n);
        if (n == 1) return 1;
        else
            return factorial(n - 1) * n;
    }

    public static int factorialOldSchool (int n){
        int x=1;
        for (int i=1;i<=n;i++){
            x=x*i;
        }
        return x;
    }

}
