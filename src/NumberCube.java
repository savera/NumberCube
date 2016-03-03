import java.util.Random;

class NumberCube {

	int testIndex = 0;
	int[] values;

	public int toss() {
		
		return values[testIndex++];
	}
	
	public void setValues(int[] testValues) {
		this.values = testValues;

	}

	public int[] getValues() {
		return values;
	}
}
