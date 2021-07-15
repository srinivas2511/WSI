package com.sinirtech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sinirtech.format.output.FormatOutputData;

@SpringBootApplication
public class WsiApplication implements CommandLineRunner{

	@Autowired
	private FormatOutputData formatOutputData;
	
	public static void main(String[] args) {
		SpringApplication.run(WsiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//data from sources
		//formatOutputData.formatOutputData();
		
		//data from file - fileName= inputsourcefile.txt
		formatOutputData.formatOutputDataForFile();
	}

}
