package com.dsAlgo.strings;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestReverseString {
    @Test
    public void when_Inputnonnull_Then_OutputnonNull(){
        String input = "Ravi";
        String actualResult = ReverseString.reverseWithoutExtraSpace(input);
        String expectedResult = "ivaR";
        Assert.assertTrue(expectedResult.equals(actualResult));
    }
    @Test
    public void when_Inputnull_Then_OutputEmptyString(){
        String input = null;
        String actualResult = ReverseString.reverseWithoutExtraSpace(input);
        String expectedResult = "";
        Assert.assertTrue(expectedResult.equals(actualResult));
    }
    @Test
    public void when_InputEmpty_Then_OutputEmptyString(){
        String input ="";
        String actualResult = ReverseString.reverseWithoutExtraSpace(input);
        String expectedResult = "";
        Assert.assertTrue(expectedResult.equals(actualResult));
    }


}
