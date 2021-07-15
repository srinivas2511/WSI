package com.sinirtech.find.minimum.ranges;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.sinirtech.minimum.ranges.MinimumRanges;
import com.sinirtech.prepare.data.PrepareData;
import com.sinirtech.sort.BubbleSort;

/**
 * Find minimum ranges for the given set of data
 * 
 * @author USER
 *
 */
public final class FindMinimumRanges implements IFindMinimumRanges{

	private static Logger LOGGER = Logger.getLogger("com.sinirtech.find.minimum.ranges");
	private List<Integer> lowerBound;
	private List<Integer> upperBound;
	
	/**
	 * Constructor
	 */
	public FindMinimumRanges() {
		super();
	}
	
	/**
	 * @return the lowerBound
	 */
	public List<Integer> getLowerBound() {
		return lowerBound;
	}

	/**
	 * @param lowerBound the lowerBound to set
	 */
	public void setLowerBound(List<Integer> lowerBound) {
		this.lowerBound = lowerBound;
	}

	/**
	 * @return the upperBound
	 */
	public List<Integer> getUpperBound() {
		return upperBound;
	}

	/**
	 * @param upperBound the upperBound to set
	 */
	public void setUpperBound(List<Integer> upperBound) {
		this.upperBound = upperBound;
	}

	
	
	public static void main(String[] args) {
		new FindMinimumRanges().findMinimumRangesForSourceData();

	}
	
	/**
	 * find minimum ranges from different sources of data
	 */
	@Override
	public void findMinimumRangesForSourceData() {
		lowerBound = new ArrayList<>();
		upperBound = new ArrayList<>();
		
		//prepare data
		PrepareData pd = new PrepareData(lowerBound, upperBound);
		pd.populateLowerBoundAndUpperBoundLists();
		
		//sort data
		BubbleSort.bubbleSort(lowerBound, upperBound );
		
		//find minimum ranges
		MinimumRanges.getMinimumRanges(lowerBound, upperBound);
		
		LOGGER.info("===============lower bound of minimum ranges==============");
		lowerBound.forEach(System.out::println);
		LOGGER.info("===============upper bound of minimum ranges==============");
		upperBound.forEach(System.out::println);
		
	}

	@Override
	public void findMinimumRangesForFile() {
		lowerBound = new ArrayList<>();
		upperBound = new ArrayList<>();
		
		//prepare data
		PrepareData pd = new PrepareData(lowerBound, upperBound);
		pd.populateLowerBoundAndUpperBoundListsFromFile();
		
		//sort data
		BubbleSort.bubbleSort(lowerBound, upperBound );
		
		//find minimum ranges
		MinimumRanges.getMinimumRanges(lowerBound, upperBound);
		
		LOGGER.info("===============lower bound of minimum ranges==============");
		lowerBound.forEach(System.out::println);
		LOGGER.info("===============upper bound of minimum ranges==============");
		upperBound.forEach(System.out::println);
		
	}
}
