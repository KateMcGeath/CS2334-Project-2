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
	private String[] listOfStations;
	private int indexResult = 0;


	public PosAvg(String stID) {
		this.stID = stID; 
	}
	
	public int indexOfStation() throws IOException {
		
		//Creating the BufferedReader and getting through the first two irrelevant lines.
		BufferedReader br = new BufferedReader(new FileReader("Mesonet1.txt"));
		br.readLine();
		br.readLine();
		
		//Initializes variables.
		String lineOfData = "";
		int numOfLines = 0;
		
		//Reads through the mesonet text line by line only if it has text.
		while((lineOfData = br.readLine()) != null) {
		
			String[] otherStation = new String[3];
			otherStation = lineOfData.split("");
			String station = "";
		
			//Looping through the first 4 characters of each line of data and combining them into one string.
			//The string is then put in the listOfStations array with the appropriate index.
			for(int index = 0; index < ID_LENGTH; index++) {
				station = station + otherStation[index];
			} listOfStations[numOfLines] = station;
			if(listOfStations[numOfLines].equalsIgnoreCase(stID))
				indexResult = numOfLines;
			numOfLines++;
		}
		return indexResult;
	}
	
	public String toString() {
		
		//Getting the result of the indexOfStation and writing out the output.
		int index = this.indexResult;
		String output = "The index is average of " + listOfStations[index - 1] + " and " + listOfStations[index + 1]
					+ ", " + listOfStations[index - 2] + " and " + listOfStations[index + 2] + ", and so on.";
		
		return output;
	}
}
