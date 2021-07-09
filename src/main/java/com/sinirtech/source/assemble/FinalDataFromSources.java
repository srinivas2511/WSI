package com.sinirtech.source.assemble;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import com.sinirtech.source.*;

/**
 * Collect data from different sources and assemble it and write to file
 * @author USER
 *
 */
public final class FinalDataFromSources {

	private static final String fileName = "inputfile.txt";
	private static Logger LOGGER = Logger.getLogger("com.sinirtech.source.assemble");
	/**
	 * Private Constructor
	 */
	private FinalDataFromSources() {
		super();
	}

	/**
	 * Collect data from different sources and collect it
	 * @return
	 */
	public static List<String> getFinalDataFromSrouces() {
	
		String[] sourceOneData = SourceOne.generateSourceOneSet(10000, 2000);
		String[] sourceTwoData = SourceTwo.generateSourceTwoSet(20000, 3000);
		String[] sourceThreeData = SourceThree.generateSourceThreeSet(30000, 4000);
		String[] sourceFourData = SourceFour.generateSourceFourSet(40000, 5000);
		String[] sourceFiveData = SourceFive.generateSourceFiveSet(45000, 5400);
		
		List<String> resultList = new ArrayList<>(sourceOneData.length+sourceTwoData.length+sourceThreeData.length+sourceFourData.length+sourceFiveData.length);
	    Collections.addAll(resultList, sourceOneData);
	    Collections.addAll(resultList, sourceTwoData);
	    Collections.addAll(resultList, sourceThreeData);
	    Collections.addAll(resultList, sourceFourData);
	    Collections.addAll(resultList, sourceFiveData);
	    
	    LOGGER.info("===============input data================");
	    resultList.forEach(LOGGER::info);
	    
	    //write to file
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(fileName));
			writer.write(resultList.toString());
		} catch (IOException e) {
			LOGGER.severe(e.getMessage());
		} finally {
			 try {
				writer.close();
			} catch (IOException e) {
				LOGGER.severe(e.getMessage());
			}
		}
		return resultList;
	}
	
}
