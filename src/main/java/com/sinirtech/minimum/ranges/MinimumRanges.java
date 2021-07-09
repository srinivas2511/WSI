package com.sinirtech.minimum.ranges;

import java.util.List;

/**
 * To get the minimum range of sets
 * @author USER
 *
 */
public final class MinimumRanges {

	/**
	 * Private constructor
	 */
	private MinimumRanges() {
		super();
	}

	/**
	 * To get the minimum range of sets from the give set of data obtained from different sources
	 * @param lowerBound
	 * @param upperBound
	 */
	public static void getMinimumRanges(List<Integer> lowerBound, List<Integer> upperBound) {
		
		for (int i = 0; i < lowerBound.size() -1; i++) {
    		int tempUpper = upperBound.get(i+1);
    		int tempLower = lowerBound.get(i+1);
    		
    		if (tempLower <= upperBound.get(i) && tempUpper <= upperBound.get(i)) {
    			lowerBound.remove(i+1);
    			upperBound.remove(i+1);
    			i--;
    		} else if (tempLower <= upperBound.get(i) && tempUpper > upperBound.get(i)) {
    			upperBound.set(i, tempUpper);
    			
    			lowerBound.remove(i+1);
    			upperBound.remove(i+1);
    			i--;
    		}
    		
    	}
	}
}
