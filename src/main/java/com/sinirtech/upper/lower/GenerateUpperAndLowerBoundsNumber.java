package com.sinirtech.upper.lower;

import java.util.Random;

/**
 * Class to generate upper bound and lower bound numbers
 * @author USER
 *
 */
public final class GenerateUpperAndLowerBoundsNumber {

	/**
	 * Private constructor
	 */
	private GenerateUpperAndLowerBoundsNumber() {
		super();
	}

	/**
	 * Generate lower bound number
	 * @param i
	 * @param j
	 * @param k
	 * @return lower bound number
	 */
	public static int genLowerBoundNumber(final int i, final int j, final int k) {
	    Random r = new Random( System.currentTimeMillis() );
	    return i + r.nextInt(j*(k+5));
	}
	
	/**
	 * Generate upper bound number
	 * @param i
	 * @param j
	 * @param k
	 * @return upper bound number
	 */
	public static int genUpperBoundNumber(final int i, final int j, final int k) {
	    Random r = new Random( System.currentTimeMillis() );
	    return i + r.nextInt(j*(k+5));
	}
}
