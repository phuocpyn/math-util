/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuocnh.mathutil.core;

/**
 *
 * @author SE140866
 */
public class MathUtil {

    public int getFactorial(int n) {
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("n must be between 0..20");
        }
        if(n==0)return 1;
        return n*getFactorial(n-1);
    }
}
