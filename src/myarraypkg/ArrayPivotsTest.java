package myarraypkg;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mikron.Licud on 19/06/2016.
 */
public class ArrayPivotsTest {

    /*
    * Main test case.
    * */
    @Test
    public void evaluateArrayMainTestCase() throws Exception {
        int[] testIntArray = new int[]{5,9,7,17,6,5,4,6}; // Should evaluate to true, pivot point index 3

        ArrayPivots pivots = new ArrayPivots();

        assertEquals(true, pivots.evaluateArray(testIntArray));
    }

    /*
    * Testing even numbered arrays with a pivot point.
    * Also testing a possible pivot point with more than one pivot point possibility when both sides match.
    * */
    @Test
    public void evaluateArrayOne() throws Exception {
        int[] testIntArray = new int[]{200,100,1,100,100,100}; // Should evaluate to true, pivot point index 2

        ArrayPivots pivots = new ArrayPivots();

        assertEquals(true, pivots.evaluateArray(testIntArray));
    }

    /*
    * Testing odd numbered arrays with a pivot point.
    * Also testing a possible pivot point with more than one pivot point possibility when both sides match.
    * */
    @Test
    public void evaluateArrayTwo() throws Exception {
        int[] testIntArray = new int[]{200,1,100,50,50}; // Should evaluate to true, pivot point index 1

        ArrayPivots pivots = new ArrayPivots();

        assertEquals(true, pivots.evaluateArray(testIntArray));
    }

    /*
    * Testing odd numbered arrays without a pivot point.
    * */
    @Test
    public void evaluateArrayThree() throws Exception {
        int[] testIntArray = new int[]{200,1,100,50,75}; // Should evaluate to false, no possible pivot point

        ArrayPivots pivots = new ArrayPivots();

        assertEquals(false, pivots.evaluateArray(testIntArray));
    }

    /*
    * Testing even numbered arrays without a pivot point.
    * */
    @Test
    public void evaluateArrayFour() throws Exception {
        int[] testIntArray = new int[]{700,900,1,100,50,75}; // Should evaluate to false, no possible pivot point

        ArrayPivots pivots = new ArrayPivots();

        assertEquals(false, pivots.evaluateArray(testIntArray));
    }

}