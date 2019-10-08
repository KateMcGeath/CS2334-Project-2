import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * @author Kate McGeath
 * @version 2019-10-09
 */
public class MesoInherit extends MesoAbstract {

	private static final int ID_LENGTH = 4;
	private String stID;
	private String[] stationList;
	private int[] avgArray = new int[3];
	private char asciiValue;
	
	public MesoInherit(String stID) {
		this.stID = stID;
		stationList = stID.split("");
	}
	
	@Override
	public int[] calAverage() {
		double avg = 0.0;
		
		//Looping through the stationList array to add together the ASCII values. 
		//Converts the string to character to turn the char to an ascii value.
		for(int index = 0; index < ID_LENGTH; index++) {
			char character = stationList[index].charAt(0);
			avg = avg + (int)character;
		} avg = avg / ID_LENGTH;
		
		//Calculate the different ascii averages.
		avgArray[0] = (int)Math.ceil(avg);
		avgArray[1] = (int)Math.floor(avg);
		avgArray[2] = (int)Math.round(avg);
		
		return avgArray;
		
	}
	
	@Override
	public char letterAverage() {
		this.asciiValue = (char)avgArray[2];
		return asciiValue;
	}
	
	public int numberOfStationsWithLetterAvg() throws IOException {
		//Creating the BufferedReader.
		BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
		
		//Getting rid of the first two lines that are irrelevant.
		br.readLine();
		br.readLine();
		
		//Initializing variables.
		String lineOfData = "";
		int stations = 0;
		
		//A while loop that loops through the Mesonet text only if there is a line of data available.
		//Splits up the line of text into a String array, separated by character.
		while((lineOfData = br.readLine()) != null) {
			String[] chars = lineOfData.split("");
			
			for(int index = 0; index < 1; index++) {
				char character = stationList[index].charAt(0);
				if(character == (char)this.letterAverage())
					stations++;
			} 
		} return stations;
	}
	
	public String toString() {
		
	}
}

