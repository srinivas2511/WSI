package com.sinirtech.source;

import com.sinirtech.upper.lower.GenerateUpperAndLowerBoundsNumber;

/**
 * Generate data from source two
 * @author USER
 *
 */
public final class SourceTwo {

	/**
	 * private constructor
	 */
	private SourceTwo() {
		super();
		
	}

	/**
	 * Generate data from source two, get five sets, make sure upper bound data is greater than lower bound
	 * @param i
	 * @param j
	 * @return
	 */
	public static String[] generateSourceTwoSet(final int i, final int j) {
		String[] sourceOneSet = new String[5];
		
		int k = 0;
		do {
			long numLowerBound = GenerateUpperAndLowerBoundsNumber.genLowerBoundNumber(i, j, k);
			long numUpperBound = GenerateUpperAndLowerBoundsNumber.genUpperBoundNumber(i, j, k);
			
			if (numUpperBound > numLowerBound) {
				sourceOneSet[k] = "["+numLowerBound+", "+numUpperBound+"]";
				k++;
			}
		} while (k < 5);
		
		return sourceOneSet;
	}

}
