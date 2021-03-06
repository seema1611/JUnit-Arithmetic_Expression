package com.bridgeLabz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticTest {
    Arithmetic arithmatic=new Arithmetic();

    @Test
    public void givenTwoInput_WhenAdd_ShouldReturnSum() {
        Assert.assertEquals(5,arithmatic.computeAddition(2,3));
    }

    @Test
    public void givenTwoInput_WhenSub_ShouldReturnDifference() {
        Assert.assertEquals(4,arithmatic.computeSubtraction(6,2));
    }

    @Test
    public void givenTwoInput_WhenMulti_ShouldReturnMultiplication() {
        Assert.assertEquals(48,arithmatic.computeMultiplication(12,4));
    }

    @Test
    public void givenTwoInput_WhenDiv_ShouldReturnDivision() {
        Assert.assertEquals(10,arithmatic.computeDivision(50,5));
    }
}
