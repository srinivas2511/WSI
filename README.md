# WSI
Find minimum set from the given set of data

JAVA VERSION: 1.8
SPRING BOOT VERSION: 2.5.2
==============================================================
HOW TO RUN:

GITHUB REPO:
https://github.com/srinivas2511/WSI/tree/master

Step 1:  git clone -b master https://github.com/srinivas2511/WSI.git
Step 2:  Open Eclipse or STS
Step 3:  File -> Import -> Existing Maven Project
Step 4:  Next -> Browse and select WSI folder
Step 5:  Finish
Step 6:  Expand WSI project and select WsiApplication 
Step 7:  Run as Spring Boot App

Result:
1.  Input file named inputfile.txt is generated at the root of the project
2.  Output file named outputfile.txt is generated at the root of the project.
============================================================================
1. This class is used to generate lower bound number and upper bound number using Random class.
Class: 
GenerateUpperAndLowerBoundsNumber.java
Methods:
public static int genLowerBoundNumber(final int i, final int j, final int k) 
public static int genUpperBoundNumber(final int i, final int j, final int k)

2. Input data being generated using five source class files namely:
Classes: 
SourceOne.java, SourceTwo.java, SourceThree.java, SourceFour.java, SourceFive.java
Metods:
public static String[] generateSourceOneSet(final int i, final int j)
public static String[] generateSourceTwoSet(final int i, final int j)
public static String[] generateSourceThreeSet(final int i, final int j)
public static String[] generateSourceFourSet(final int i, final int j)
public static String[] generateSourceFiveSet(final int i, final int j)

3. Collect data from different sources and assemble it and write to file (data from above files)
Class: 
FinalDataFromSources.java
Method:
public static List<String> getFinalDataFromSrouces()
FileName: 
inputfile.txt

4. Prepare data for finding minimum ranges.  Populate lower bound and upper bound array list.
Class: 
PrepareData.java
Method: 
public void populateLowerBoundAndUpperBoundLists()

5. Sort lower bound data obtained from different sources and corresponding change to upper bound data
Class: 
BubbleSort.java
Method:
public static void bubbleSort(List<Integer> lowerBound, List<Integer> upperBound )

6. To get the minimum range of sets from the give set of data obtained from different sources
Class:
MinimumRanges.java
Method:
public static void getMinimumRanges(List<Integer> lowerBound, List<Integer> upperBound)

7. Find minimum ranges from different sources of data
Class:
FindMinimumRanges.java
Method:
public void findMinimumRangesForSourceData()

8. Format output data and write to file
Class:
FormatOutputData.java
Method:
public void formatOutputData()
FileName:
outputfile.txt


