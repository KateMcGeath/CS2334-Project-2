import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * @author Kate McGeath
 * @version 2019-10-09
 */
public class PosAvg {
	private static final int ID_LENGTH = 4;
private String stID;


	public PosAvg(String stID) {
		this.stID = stID; 
	}
	
	public int indexOfStation() throws IOException {
		String[] myStation = stID.split("");
		
		//Creating the BufferedReader and getting through the first two irrelevant lines.
		BufferedReader br = new BufferedReader(new FileReader("Mesonet1.txt"));
		br.readLine();
		br.readLine();
		
		//Initializes variables.
		String lineOfData = "";
		int charsEqual = 0;
		int indexResult = 0;
		int numOfLines = 0;
		
		//Reads through the mesonet text line by line only if it has text.
		while((lineOfData = br.readLine()) != null) {
			numOfLines++;
			String[] otherStation = new String[3];
			otherStation = lineOfData.split("");
		
			//Looping through the first 4 characters of each line of data and comparing
			//the two arrays. Checks to see if all characters equal, and if so, the result is set to that number of lines.
			for(int index = 0; index < ID_LENGTH; index++) {
				if(myStation[index].equalsIgnoreCase(otherStation[index]))
					charsEqual++;
			} if(charsEqual == ID_LENGTH)
				indexResult = numOfLines;
		} return indexResult;
	}
}
