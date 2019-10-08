import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LetterAvg {

	private String[] stationList = new String[10];
	
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
