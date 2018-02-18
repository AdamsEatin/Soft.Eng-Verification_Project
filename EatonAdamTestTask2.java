package cm;


import org.junit.*;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.math.BigDecimal;

// Initialise variables.
public class EatonAdamTestTask2 {
    CarParkKind kind = CarParkKind.STAFF;
    int startHour;
    int endHour;
    BigDecimal hourlyNormalRate;
    BigDecimal hourlyDiscountRate;
    ArrayList<Period> normalPeriods;
    ArrayList<Period> discountedPeriods;
    Rate rate;
    Period stay;


    //Initialise variables prior to each test running
    @Before
    public void init_vars(){
        int startHour = 0;
        int endHour = 0;
        //hourlyNormalRate = new BigDecimal(0);
        //hourlyDiscountRate = new BigDecimal(0);
        normalPeriods = new ArrayList<>();
        discountedPeriods = new ArrayList<>();
    }


    // Test #1
    @Test(expected = IllegalArgumentException.class)
    public void Test_1() throws Exception{
        hourlyNormalRate = null;
        hourlyDiscountRate = new BigDecimal(2.0);
        discountedPeriods.add(new Period(3,8));
        discountedPeriods.add(new Period(20,22));
        normalPeriods.add(new Period(9,19));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    // Test #2
    @Test(expected = IllegalArgumentException.class)
    public void Test_2() throws Exception{
        hourlyNormalRate = new BigDecimal(-5.0);
        hourlyDiscountRate = new BigDecimal(2.0);
        discountedPeriods.add(new Period(3,8));
        discountedPeriods.add(new Period(20,22));
        normalPeriods.add(new Period(9,19));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    // Test #3
    @Test(expected = IllegalArgumentException.class)
    public void Test_3() throws Exception{
        hourlyNormalRate = new BigDecimal(0.0);
        hourlyDiscountRate = new BigDecimal(2.0);
        discountedPeriods.add(new Period(3,8));
        discountedPeriods.add(new Period(20,22));
        normalPeriods.add(new Period(9,19));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    // Test #4
    @Test(expected = IllegalArgumentException.class)
    public void Test_4() throws Exception{
        hourlyNormalRate = new BigDecimal(5.0);
        hourlyDiscountRate = null;
        discountedPeriods.add(new Period(3,8));
        discountedPeriods.add(new Period(20,22));
        normalPeriods.add(new Period(9,19));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    // Test #5
    @Test(expected = IllegalArgumentException.class)
    public void Test_5() throws Exception{
        hourlyNormalRate = new BigDecimal(5.0);
        hourlyDiscountRate = new BigDecimal(-2.0);
        discountedPeriods.add(new Period(3,8));
        discountedPeriods.add(new Period(20,22));
        normalPeriods.add(new Period(9,19));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    /*
    // Test #6
    @Test(expected = IllegalArgumentException.class)
    public void Test_6() throws Exception{
        hourlyNormalRate = new BigDecimal(5.0);
        hourlyDiscountRate = new BigDecimal(0.0);
        discountedPeriods.add(new Period(3,8));
        discountedPeriods.add(new Period(20,22));
        normalPeriods.add(new Period(9,19));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }
    */

    // Test #7
    @Test(expected = IllegalArgumentException.class)
    public void Test_7() throws Exception{
        hourlyNormalRate = new BigDecimal(2.0);
        hourlyDiscountRate = new BigDecimal(5.0);
        discountedPeriods.add(new Period(3,8));
        discountedPeriods.add(new Period(20,22));
        normalPeriods.add(new Period(9,19));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    // Test #8
    @Test(expected = IllegalArgumentException.class)
    public void Test_8() throws Exception{
        hourlyNormalRate = new BigDecimal(5.0);
        hourlyDiscountRate = new BigDecimal(2.0);
        discountedPeriods.add(new Period(21,1));
        normalPeriods.add(new Period(9,19));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    // Test #9
    @Test(expected = IllegalArgumentException.class)
    public void Test_9() throws Exception{
        hourlyNormalRate = new BigDecimal(5.0);
        hourlyDiscountRate = new BigDecimal(2.0);
        discountedPeriods.add(new Period(3,8));
        discountedPeriods.add(new Period(21,1));
        normalPeriods.add(new Period(9,19));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    //Test #10
    @Test(expected = IllegalArgumentException.class)
    public void Test_10() throws Exception{
        hourlyNormalRate = new BigDecimal(5.0);
        hourlyDiscountRate = new BigDecimal(2.0);
        discountedPeriods.add(new Period(3,18));
        discountedPeriods.add(new Period(18,22));
        normalPeriods.add(new Period(9,19));

        Rate rate_inst = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    //Test #11
    @Test(expected = IllegalArgumentException.class)
    public void Test_11() throws Exception{
        hourlyNormalRate = new BigDecimal(5.0);
        hourlyDiscountRate = new BigDecimal(2.0);
        discountedPeriods.add(new Period(3,18));
        discountedPeriods.add(new Period(20,22));
        normalPeriods.add(new Period(23,2));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    //Test #12
    @Test(expected = IllegalArgumentException.class)
    public void Test_12() throws Exception{
        hourlyNormalRate = new BigDecimal(5.0);
        hourlyDiscountRate = new BigDecimal(2.0);
        discountedPeriods.add(new Period(3,18));
        discountedPeriods.add(new Period(20,22));
        normalPeriods.add(new Period(9,19));
        normalPeriods.add(new Period(23,2));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    //Test #13
    @Test()
    public void Test_13(){
        hourlyNormalRate = new BigDecimal(5.0);
        hourlyDiscountRate = new BigDecimal(2.0);
        discountedPeriods.add(new Period(7,9));
        discountedPeriods.add(new Period(20,22));
        normalPeriods.add(new Period(2,5));
        normalPeriods.add(new Period(10,19));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
        assertEquals(new BigDecimal(5.0), hourlyNormalRate);
    }

    /*
    // Test 14
    @Test(expected = IllegalArgumentException.class)
    public void Test_14()throws Exception{

        hourlyNormalRate = new BigDecimal(5.0);
        hourlyDiscountRate = new BigDecimal(2.0);
        discountedPeriods.add(new Period(7,8));
        discountedPeriods.add(new Period(20,22));
        normalPeriods.add(new Period(9,19));
        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);

        rate.calculate(null);
    }
    */

    // Test 15
    @Test(expected = IllegalArgumentException.class)
    public void Test_15(){
        startHour = 23;
        endHour = 2;

        hourlyNormalRate = new BigDecimal(5.0);
        hourlyDiscountRate = new BigDecimal(2.0);
        discountedPeriods.add(new Period(7,8));
        discountedPeriods.add(new Period(20,22));
        normalPeriods.add(new Period(9,19));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
        stay = new Period(startHour, endHour);
        rate.calculate(stay);
    }

    // Test 16
    @org.junit.Test()
    public void Test_16(){
        startHour = 9;
        endHour = 12;

        hourlyNormalRate = new BigDecimal(5.0);
        hourlyDiscountRate = new BigDecimal(2.0);
        discountedPeriods.add(new Period(7,8));
        discountedPeriods.add(new Period(20,22));
        normalPeriods.add(new Period(9,19));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
        stay = new Period(startHour,endHour);

        assertEquals(BigDecimal.valueOf(15), rate.calculate(stay));
    }

    // Test 17
    @org.junit.Test()
    public void Test_17(){
        startHour = 8;
        endHour = 11;

        hourlyNormalRate = new BigDecimal(5.0);
        hourlyDiscountRate = new BigDecimal(2.0);
        discountedPeriods.add(new Period(7,8));
        discountedPeriods.add(new Period(20,22));
        normalPeriods.add(new Period(9,19));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
        stay = new Period(startHour,endHour);

        assertEquals(BigDecimal.valueOf(10), rate.calculate(stay));
    }

    // Test 18
    @org.junit.Test()
    public void Test_18(){
        startHour = 0;
        endHour = 4;

        hourlyNormalRate = new BigDecimal(5.0);
        hourlyDiscountRate = new BigDecimal(2.0);
        discountedPeriods.add(new Period(7,8));
        discountedPeriods.add(new Period(20,22));
        normalPeriods.add(new Period(9,19));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
        stay = new Period(startHour, endHour);

        assertEquals(new BigDecimal(0.0), rate.calculate(stay));
    }

    // Test 19
    @Test(expected = IllegalArgumentException.class)
    public void Test_19(){
        hourlyNormalRate = new BigDecimal(5.0);
        hourlyDiscountRate = new BigDecimal(2.0);
        discountedPeriods.add(new Period(7,8));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, null);
    }

    // Test 20
    @Test(expected = IllegalArgumentException.class)
    public void Test_20(){
        hourlyNormalRate = new BigDecimal(5.0);
        hourlyDiscountRate = new BigDecimal(2.0);
        normalPeriods.add(new Period(9,19));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, null, normalPeriods);
    }

    // Test 21
    @Test(expected = IllegalArgumentException.class)
    public void Test_21(){
        hourlyNormalRate = new BigDecimal(5.0);
        hourlyDiscountRate = new BigDecimal(2.0);
        discountedPeriods.add(new Period(4,8));
        discountedPeriods.add(new Period(7,11));
        normalPeriods.add(new Period(12,19));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }

    // Test 22
    @Test(expected = IllegalArgumentException.class)
    public void Test_22(){
        hourlyNormalRate = new BigDecimal(5.0);
        hourlyDiscountRate = new BigDecimal(2.0);
        discountedPeriods.add(new Period(4,8));
        normalPeriods.add(new Period(12,19));
        normalPeriods.add(new Period(18, 22));

        rate = new Rate(kind, hourlyNormalRate, hourlyDiscountRate, discountedPeriods, normalPeriods);
    }
}
