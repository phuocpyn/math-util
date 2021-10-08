/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuocnh.mathutil.core;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SE140866
 */
public class FactorialTest {
    
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell(){
        MathUtil mathutil = new MathUtil();
        long expected = 120;
        long actual = mathutil.getFactorial(5);
        Assert.assertEquals(expected, actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowsException(){
        MathUtil mathUtil = new MathUtil();
        mathUtil.getFactorial(-5);
    }
    
}
