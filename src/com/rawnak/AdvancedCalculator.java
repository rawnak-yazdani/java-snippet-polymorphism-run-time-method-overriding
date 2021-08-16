package com.rawnak;

public class AdvancedCalculator extends Calculator {

    @Override
    void add(Integer a, Integer b){
        if(a == null || b == null){
            System.out.println("Addend cannot be null");
//            return null;
        } else {
            System.out.println(a + b);
//            return a + b;
        }
    }
}
