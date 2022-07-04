import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {

    @Test
    public void testCreation1(){
        //Given
        int[] expected = new int[] {0, 0, 0, 0, 0, 0};
        //When
        Bins testBin = new Bins(1, 6);
        //Then
        int[] actual = testBin.results;
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testCreation2(){
        //Given
        int[] expected = new int[39];
        //When
        Bins testBin = new Bins(2, 39);
        //Then
        int[] actual = testBin.results;
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testIncrementBin1(){
        //Given
        int[] expectedArray = new int[] {0, 1, 0, 0, 0, 0};
        String expected = Arrays.toString(expectedArray);
        //When
        Bins testBin = new Bins(1, 6);
        testBin.incrementBin(1);
        //Then
        String actual = Arrays.toString(testBin.results);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncrementBin2(){
        //Given
        int[] expectedArray = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        String expected = Arrays.toString(expectedArray);
        //When
        Bins testBin = new Bins(4, 21);
        testBin.incrementBin(20);
        //Then
        String actual = Arrays.toString(testBin.results);
        Assertions.assertEquals(expected, actual);
    }

}