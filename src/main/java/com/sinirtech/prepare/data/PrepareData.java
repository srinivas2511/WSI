package com.sinirtech.prepare.data;

import java.util.List;
import java.util.logging.Logger;

import com.sinirtech.source.assemble.FinalDataFromSources;

/**
 * Prepare data for finding minimum ranges
 * @author USER
 *
 */
public final class PrepareData {

	private static Logger LOGGER = Logger.getLogger("com.sinirtech.prepare.data");
	private List<Integer> lowerBound;
	private List<Integer> upperBound;
	
	/**
	 * default constructor
	 */
	public PrepareData() {
		super();
	}

	/**
	 * Constructor
	 * @param lowerBound
	 * @param upperBound
	 */
	public PrepareData(List<Integer> lowerBound, List<Integer> upperBound) {
		super();
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
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

	/**
	 * populate lower bound and upper bound lists from different sources of data
	 */
	public void populateLowerBoundAndUpperBoundLists() {
		//get final data from different sources
		List<String> finalData = FinalDataFromSources.getFinalDataFromSrouces();
		
		for(String data: finalData) {
			int lowerBoundValue = -1;
			int upperBoundValue = -1;
			int indexOfStartingBracket = data.indexOf('[');
			int indexOfEndingBracket = data.indexOf(']');
			int indexOfComma = data.indexOf(',');
			if (indexOfStartingBracket != -1 && indexOfComma != -1) {
			    lowerBoundValue = Integer.parseInt(data.substring(indexOfStartingBracket+1, indexOfComma));
			    upperBoundValue = Integer.parseInt(data.substring(indexOfComma+2, indexOfEndingBracket));
			}
			
			if (lowerBoundValue != -1 && upperBoundValue != -1) {
				upperBound.add(upperBoundValue);
				lowerBound.add(lowerBoundValue);
			}
			
		}
		LOGGER.info("===========lower bound of input data=============");
		lowerBound.forEach(System.out::println);
		LOGGER.info("===========upper bound of input data=============");
		upperBound.forEach(System.out::println);
	}
}
