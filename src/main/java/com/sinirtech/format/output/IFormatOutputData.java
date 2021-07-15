package com.sinirtech.format.output;

/**
 * @author USER
 * Format output data and write to file
 */
public interface IFormatOutputData {

	/**
	 * Format output data and write to file (from sources)
	 */
	public void formatOutputData();
	
	/**
	 * Format output data and write to file (from file)
	 */
	public void formatOutputDataForFile();
}
