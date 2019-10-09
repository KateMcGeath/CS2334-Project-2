import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LetterAvg {

	private String[] stationList = new String[10];
	private char avg;
	
	public LetterAvg(char c) {
		this.avg = c;
	}
	
	public int numberOfStationsWithLetterAvg() throws IOException {
		//Creating the BufferedReader.
		BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
		
		//Getting rid of the first two lines that are irrelevant.
		br.readLine();
		br.readLine();
		
		//Initializing variables.
		String lineOfData = "";
		int numOfLines = 0;
		int stations = 0;
		
		//A while loop that loops through the Mesonet text only if there is a line of data available.
		//Splits up the line of text into a String array, separated by character.
		while((lineOfData = br.readLine()) != null) {
			
			if(stationList.length == numOfLines)
				stationList = new String[numOfLines * 2];
			else {
				stationList[numOfLines] = lineOfData.substring(1, 5);
			
				if(stationList[numOfLines].charAt(0) == avg)
					stations++;
				numOfLines++;
			}
		} return stations;
	}
	
	public String toString() {
		String output = "They are:";
		for(int index = 0; index < stationList.length; index++) {
			if(stationList[index].charAt(0) == avg)
				output = output + "\n" + stationList[index];
		} return output;
	}
}
