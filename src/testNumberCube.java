import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class testNumberCube {

	@Test
	public void testPartA() {
		NumberCube numberCube = new NumberCube();
		int[] testValues = { 3, 2, 5, 6, 1 };
		numberCube.setValues(testValues);
		assertArrayEquals(testValues, NumberCubeQuestion.getCubeTosses(numberCube, testValues.length));
	}

	@Test
	public void testPartB() throws Exception {

		int[] testValues = { 1, 5, 5, 2, 2, 2, 5, 5 };
		assertEquals(3, NumberCubeQuestion.getLongestRun(testValues));

		int[] testValues2 = { 1, 5, 5, 4, 3, 1, 2, 2, 2, 2, 6, 1, 3, 3, 3, 5, 5, 5 };
		assertEquals(6, NumberCubeQuestion.getLongestRun(testValues2));

		int[] testValues3 = { 1, 1 };
		assertEquals(0, NumberCubeQuestion.getLongestRun(testValues3));

		int[] testValues4 = { 1 };
		assertEquals(-1, NumberCubeQuestion.getLongestRun(testValues4));

	}

	@Test
	public void testTosses() throws Exception {

		tosses();
		assertEquals(true, true);

	}

	public int[] tosses() {

		int arraySize = new Random().nextInt(20);

		int[] tossesArray = new int[arraySize];

		int[] tossesArray2 = new int[arraySize];
		
		int[] combinedArray = new int[arraySize]; 

		for (int i = 0; i < arraySize; i++) {

			tossesArray[i] = new Random().nextInt(6);

		}

		for (int i = 0; i < arraySize; i++) {

			tossesArray2[i] = new Random().nextInt(6);

		}
		
		for (int i = 0; i < tossesArray.length; i++) {
			
			combinedArray[i] = tossesArray[i] + tossesArray2[i];
			
		}

		System.out.println(Arrays.toString(tossesArray));
		System.out.println(Arrays.toString(tossesArray2));
		System.out.println(Arrays.toString(combinedArray));

		return combinedArray;

	}

}
