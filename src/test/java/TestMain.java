import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
//There are five tests for Main class, you need realise all five method in
// Main class then run TestMain


public class TestMain {
    private final int expectedAdd = 19;
    private final int[] expectedEvenNumber = {2, 4, 6, 8};
    private final int[] expectedGetEvenPositiveNumber = {2, 4, 5};
    private final int[] expectedGetMultipliedArray = {2, 4, 6, 10};
    private final int[] expectedAllElementContainsInSecond = {1, 2, 3};
    Main main = new Main();

    @Test
    public void testAdd() {
        int actual = main.Add(18, 1);
        Assert.assertEquals(expectedAdd, actual);
    }

    @Test
    public void testGetEvenNumber() {
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] actual = main.GetEvenNumber(firstArray);
        Assert.assertArrayEquals(expectedEvenNumber, actual);
    }

    @Test
    public void testGetEvenPositiveNumber() {
        int[] firstArray = {2, -3, 4, 5, -6, -7, -8};
        int[] actual = main.GetEvenPositiveNumber(firstArray);
        Assert.assertArrayEquals(expectedGetEvenPositiveNumber, actual);
    }

    @Test
    public void testGetMultipliedArray() {
        int[] firstArray = {1, 2, 3, 5};
        int[] secondArray = {1, 2, 2, 2};
        int[] actual = main.GetMultipliedArray(firstArray, secondArray);
        Assert.assertArrayEquals(expectedGetMultipliedArray, actual);
    }

    @Test
    public void testAllElementContainsInSecond() {
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] secondArray = {1, 2, 3, 11, 232, -1, -4, 242};
        int[] actual = main.AllElementContainsInSecond(firstArray, secondArray);
        Assert.assertArrayEquals(expectedAllElementContainsInSecond, actual);
    }
}
