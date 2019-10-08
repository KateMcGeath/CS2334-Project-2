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
	private String[] listOfStations = new String[10];
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
		
			if(listOfStations.length == numOfLines)
				listOfStations = new String[numOfLines * 2];
			else {
				listOfStations[numOfLines] = lineOfData.substring(1, 5);
			
				if(listOfStations[numOfLines].equalsIgnoreCase(stID))
					indexResult = numOfLines;
				numOfLines++;
			}
		}
		return indexResult;
	}
	
	public String toString() {
		String town1 = "";
		String town2 = "";
		String output = "The index is average of ";
		
		for(int index = 2; index < listOfStations.length - 2; index++) {
			
			if(listOfStations[indexResult + index] != null && listOfStations[indexResult - index] != null) {
				town1 = listOfStations[indexResult + index];
				town2 = listOfStations[indexResult - index];
				output = output + town1 + " and " + town2 + ",";
			}
		} output = output + " and so on.";
		
		return output;
	}
}
