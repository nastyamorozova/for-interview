package com.company;

public class MutualDivider {
    public static int mutualDivider(int a, int b){
        int min =a>b?b:a;
        int max=a<b?b:a;
        for (int i=min;i>1;i--){
          if (min%i==0&&max%i==0)
              return i;
        }
        return 1;
    }
    public static int minMutualMultyplier(int a, int b){
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        for (int i=max; i<max*min;i+=max) {
            if (i % min == 0) return i;
        }
        return max*min;
    }
}

