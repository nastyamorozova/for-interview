package com.company;

public class fibonacciClass {
    public static int fibonacci(int n){
        if (n==1) return 1;
        if (n==2) return 1;
        return fibonacci(n-1)+fibonacci(n-2);

    }
    public static int fibonacciOldSchool(int n){
        int minus2=1;
        int minus1=1;
        for (int i=3;i<=n;i++){
            int z=minus2+minus1;
            minus2=minus1;
            minus1=z;
        }
        return minus1;
    }
}
