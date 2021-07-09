package com.sinirtech.sort;

import java.util.List;

/**
 * Sort lower bound data obtained from different sources and corresponding change to upper bound data
 * @author USER
 *
 */
public final class BubbleSort
{
	/**
     * private constructor
     */
    private BubbleSort() {
		super();
	}
    
    /**
     * Sort lower bound data and corresponding modification to upper bound data 
     * @param lowerBound
     * @param upperBound
     */
    public static void bubbleSort(List<Integer> lowerBound, List<Integer> upperBound )
    {
        int n = lowerBound.size();
        for (int i = 0; i < n-1; i++) {
        	for (int j = 0; j < n-i-1; j++) {
        		if (lowerBound.get(j) > lowerBound.get(j+1))
                {
                    //swap data
                    int tempLower = lowerBound.get(j);
                    int tempUpper = upperBound.get(j);
                    lowerBound.set(j, lowerBound.get(j+1));
                    upperBound.set(j, upperBound.get(j+1));
                    lowerBound.set(j+1, tempLower);
                    upperBound.set(j+1, tempUpper);
                }
        	}
        }        
    }
}