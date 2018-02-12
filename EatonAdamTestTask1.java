package com.company;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import com.sun.xml.internal.ws.api.pipe.SyncStartForAsyncFeature;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.math.BigDecimal;

// Replacing CarParkKind kind with an int for now.
public class EatonAdamTestTask1 {
    // Test #1
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void Test_1() throws Exception{
        CarParkKind kind = STAFF;
        BigDecimal hourlyNormalRate = null;
        BigDecimal hourlyDiscountRate = new BigDecimal(2.0);
        ArrayList<Period> discountedPeriods = [(3,8), (20,22)];
        ArrayList<Period> normalPeriods = [(9,19)];

        Rate rate_inst = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    // Test #2
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void Test_2() throws Exception{
        CarParkKind kind = STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(-5.0);
        BigDecimal hourlyDiscountRate = new BigDecimal(2.0);
        ArrayList<Period> discountedPeriods = [(3,8), (20,22)];
        ArrayList<Period> normalPeriods = [(9,19)];

        Rate rate_inst = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    // Test #3
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void Test_3() throws Exception{
        CarParkKind kind = STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(0.0);
        BigDecimal hourlyDiscountRate = new BigDecimal(2.0);
        ArrayList<Period> discountedPeriods = [(3,8), (20,22)];
        ArrayList<Period> normalPeriods = [(9,19)];

        Rate rate_inst = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    // Test #4
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void Test_4() throws Exception{
        CarParkKind kind = STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(5.0);
        BigDecimal hourlyDiscountRate = null;
        ArrayList<Period> discountedPeriods = [(3,8), (20,22)];
        ArrayList<Period> normalPeriods = [(9,19)];

        Rate rate_inst = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    // Test #5
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void Test_5() throws Exception{
        CarParkKind kind = STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(5.0);
        BigDecimal hourlyDiscountRate = new BigDecimal(-2.0);
        ArrayList<Period> discountedPeriods = [(3,8), (20,22)];
        ArrayList<Period> normalPeriods = [(9,19)];

        Rate rate_inst = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    // Test #6
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void Test_6() throws Exception{
        CarParkKind kind = STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(5.0);
        BigDecimal hourlyDiscountRate = new BigDecimal(0.0);
        ArrayList<Period> discountedPeriods = [(3,8), (20,22)];
        ArrayList<Period> normalPeriods = [(9,19)];

        Rate rate_inst = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    // Test #7
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void Test_7() throws Exception{
        CarParkKind kind = STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(2.0);
        BigDecimal hourlyDiscountRate = new BigDecimal(5.0);
        ArrayList<Period> discountedPeriods = [(3,8), (20,22)];
        ArrayList<Period> normalPeriods = [(9,19)];

        Rate rate_inst = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    // Test #8
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void Test_8() throws Exception{
        CarParkKind kind = STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(5.0);
        BigDecimal hourlyDiscountRate = new BigDecimal(2.0);
        ArrayList<Period> discountedPeriods = [(21,1)];
        ArrayList<Period> normalPeriods = [(9,19)];

        Rate rate_inst = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    // Test #9
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void Test_9() throws Exception{
        CarParkKind kind = STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(5.0);
        BigDecimal hourlyDiscountRate = new BigDecimal(2.0);
        ArrayList<Period> discountedPeriods = [(3,8), (21,1];
        ArrayList<Period> normalPeriods = [(9,19)];

        Rate rate_inst = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    //Test #10
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void Test_10() throws Exception{
        CarParkKind kind = STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(5.0);
        BigDecimal hourlyDiscountRate = new BigDecimal(2.0);
        ArrayList<Period> discountedPeriods = [(3, 18),(18, 22)];
        ArrayList<Period> normalPeriods = [(9, 19)];

        Rate rate_inst = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    //Test #11
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void Test_11() throws Exception{
        CarParkKind kind = STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(5.0);
        BigDecimal hourlyDiscountRate = new BigDecimal(2.0);
        ArrayList<Period> discountedPeriods = [(3,18), (20,22)];
        ArrayList<Period> normalPeriods = [(23,2)];

        Rate rate_inst = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    //Test #12
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void Test_12() throws Exception{
        CarParkKind kind = STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(5.0);
        BigDecimal hourlyDiscountRate = new BigDecimal(2.0);
        ArrayList<Period> discountedPeriods = [(3,18), (20,22)];
        ArrayList<Period> normalPeriods = [(9,19), (23,2)];

        Rate rate_inst = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    //Test #13
    @org.junit.Test()
    public void Test_13(){
        CarParkKind kind = STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(5.0);
        BigDecimal hourlyDiscountRate = new BigDecimal(2.0);
        ArrayList<Period> discountedPeriods = [(7,9), (20,22)];
        ArrayList<Period> normalPeriods = [(2,5), (10,7)];

        Rate rate_inst = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
        assertEquals(new BigDecimal(5.0), hourlyNormalRate);
    }

    // Test 14
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void Test_14()throws Exception{
        CarParkKind kind = STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(5.0);
        BigDecimal hourlyDiscountRate = new BigDecimal(2.0);
        ArrayList<Period> discountedPeriods = [(7,8), (20,22)];
        ArrayList<Period> normalPeriods = [(9,19)];

        Rate rate_inst = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
        rate_inst.calculate(null);
    }

    // Test 15
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void Test_15(expected = IllegalArgumentException.class){
        CarParkKind kind = STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(5.0);
        BigDecimal hourlyDiscountRate = new BigDecimal(2.0);
        ArrayList<Period> discountedPeriods = [(7,8), (20,22)];
        ArrayList<Period> normalPeriods = [(9,19)];

        Rate rate_inst = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
        rate_inst.calculate((23,2));
    }

    // Test 16
    @org.junit.Test()
    public void Test_16(){
        CarParkKind kind = STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(5.0);
        BigDecimal hourlyDiscountRate = new BigDecimal(2.0);
        ArrayList<Period> discountedPeriods = [(7,8), (20,22)];
        ArrayList<Period> normalPeriods = [(9,19)];

        Rate rate_inst = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
        calc_rate = rate_inst.calculate(9,12);
        assertEquals(new BigDecimal(15.0), calc_rate);
    }

    // Test 17
    @org.junit.Test()
    public void Test_17(){
        CarParkKind kind = STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(5.0);
        BigDecimal hourlyDiscountRate = new BigDecimal(2.0);
        ArrayList<Period> discountedPeriods = [(7,8), (20,22)];
        ArrayList<Period> normalPeriods = [(9,19)];

        Rate rate_inst = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
        calc_rate = rate_inst.calculate(8,11);
        assertEquals(new BigDecimal(12.0), calc_rate);
    }

    // Test 18
    @org.junit.Test()
    public void Test_18(){
        CarParkKind kind = STAFF;
        BigDecimal hourlyNormalRate = new BigDecimal(5.0);
        BigDecimal hourlyDiscountRate = new BigDecimal(2.0);
        ArrayList<Period> discountedPeriods = [(7,8), (20,22)];
        ArrayList<Period> normalPeriods = [(9,19)];

        Rate rate_inst = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
        calc_rate = rate_inst.calculate(8,11);
        assertEquals(new BigDecimal(0.0), calc_rate);
    }
}
