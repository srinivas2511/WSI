package com.sinirtech.prepare.data;

/**
 * @author USER
 * Prepare Data from sources and file
 */
public interface IPrepareData {
	
	/**
	 * Prepare data from sources
	 */
	public void populateLowerBoundAndUpperBoundLists();
	
	
	/**
	 * Prepare data from file
	 */
	public void populateLowerBoundAndUpperBoundListsFromFile();

}
