package com.example.tddtutorial.example1;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NumberComparatorTest {

    NumberComparator SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new NumberComparator();
    }

    @Test
    public void getLarge_oneIsLargerThanZero_oneReturn() {
        assertThat(SUT.getLarge(1, 0), is(1));
    }

    @Test
    public void getLarge_zeroIsLargerThanMinusOne_zeroReturn() {
        assertThat(SUT.getLarge(-1, 0), is(0));
    }

    @Test
    public void getLarge_twoIsEqualToTwo_returnTwo() {
        assertThat(SUT.getLarge(2, 2), is(2));
    }
}