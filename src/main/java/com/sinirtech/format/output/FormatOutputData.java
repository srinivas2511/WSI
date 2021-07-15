package com.sinirtech.format.output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import com.sinirtech.find.minimum.ranges.FindMinimumRanges;

/**
 * Format output data and write to file
 * 
 * @author USER
 *
 */
@Component
public final class FormatOutputData implements IFormatOutputData{

	private static Logger LOGGER = Logger.getLogger("com.sinirtech.format.output");
	private static final String fileName = "outputfile.txt";
	

	/**
	 * default constructor
	 */
	public FormatOutputData() {
		super();
	}
	
	/**
	 * Format output data and write to file (from sources)
	 */
	@Override
	public void formatOutputData() {
		FindMinimumRanges findMinimumRanges = new FindMinimumRanges();
		List<String> finalOutputData = new ArrayList<>();
		//find minimum ranges
		findMinimumRanges.findMinimumRangesForSourceData();
		
		List<Integer> lowerBound = findMinimumRanges.getLowerBound();
		List<Integer> upperBound = findMinimumRanges.getUpperBound();
		
		for(int i = 0; i < lowerBound.size(); i++) {
			int lower = lowerBound.get(i);
			int upper = upperBound.get(i);
			
			String data = "["+lower+", "+upper+"]";
			finalOutputData.add(data);
			
		}
		
		LOGGER.info("===============output data================");
		finalOutputData.forEach(LOGGER::info);
		//write to file
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(fileName));
			writer.write(finalOutputData.toString());
		} catch (IOException e) {
			LOGGER.severe(e.getMessage());
		} finally {
			 try {
				writer.close();
			} catch (IOException e) {
				LOGGER.severe(e.getMessage());
			}
		}
	}

	/**
	 * Format output data and write to file (from file)
	 */
	@Override
	public void formatOutputDataForFile() {
		FindMinimumRanges findMinimumRanges = new FindMinimumRanges();
		List<String> finalOutputData = new ArrayList<>();
		//find minimum ranges
		findMinimumRanges.findMinimumRangesForFile();
		
		List<Integer> lowerBound = findMinimumRanges.getLowerBound();
		List<Integer> upperBound = findMinimumRanges.getUpperBound();
		
		for(int i = 0; i < lowerBound.size(); i++) {
			int lower = lowerBound.get(i);
			int upper = upperBound.get(i);
			
			String data = "["+lower+", "+upper+"]";
			finalOutputData.add(data);
			
		}
		
		LOGGER.info("===============output data================");
		finalOutputData.forEach(LOGGER::info);
		//write to file
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(fileName));
			writer.write(finalOutputData.toString());
		} catch (IOException e) {
			LOGGER.severe(e.getMessage());
		} finally {
			 try {
				writer.close();
			} catch (IOException e) {
				LOGGER.severe(e.getMessage());
			}
		}
		
	}

}
