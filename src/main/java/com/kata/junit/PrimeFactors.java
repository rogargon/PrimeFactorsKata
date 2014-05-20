package com.kata.junit;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List generate(int number) {
        ArrayList primes = new ArrayList<Integer>();
        if(number == 1) return primes;
        int i = number;
        int factor = 2;
        while(i!=1) {
            while (i % factor == 0) {
                primes.add(factor);
                i = i / factor;
            }
            factor++;
        }

        return primes;
    }
}
