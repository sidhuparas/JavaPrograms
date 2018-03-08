package com.parassidhu.control;

import java.util.BitSet;
import java.util.Scanner;

public class CountPrime {

    public static void execute()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = in.nextInt();
        System.out.print("Total number of prime numbers = " + countPrimes(input));
        System.out.printf("\n");
    }

    public static int countPrimes(int n)
    {
        if(n <= 0 || n == 1 || n == 2)
            return 0;
        else if(n == 3)
            return 1;
        BitSet set = new BitSet();
        n = n - 1;
        int s = (int)Math.sqrt(n); //4
        int ctr = n; //24
        for(int p = 2; p <= s; p ++) {

            if(!set.get(p)) {

                for(int q = 2; (p * q) <= n; q ++) {
                    if(!set.get(p * q)) {
                        ctr --;
                        set.set(p * q);
                    }
                }
            }
        }
        return ctr - 1;
    }
}
