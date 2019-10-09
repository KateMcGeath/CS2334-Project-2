import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LetterAvg {

	private String[] stationList = new String[10];
	private char avg;
	
	//LetterAvg Constructor.
	public LetterAvg(char c) {
		this.avg = c;
	}
	
	public int numberOfStationsWithLetterAvg() throws IOException {
		
		//Initializing variables.
		PosAvg posAvg = new PosAvg();
		this.stationList = posAvg.getStationsArray();
		int stations = 0;
		
		//Using a for loop to loop through the stations array and comparing each station's 
		//first letter to the letter average.
		for(int index = 0; index < stationList.length; index++) {
			if(stationList[index] != null && stationList[index].charAt(0) == avg)
				stations++;
		} return stations;
	}
	
	public String toString() {
		
		//Initializing variables.
		PosAvg posAvg = new PosAvg();
		String output = "They are:";
		try {
			this.stationList = posAvg.getStationsArray();
		} catch (IOException e) {
			//Auto-generated catch block
			e.printStackTrace();
		}
		
		//Using a for loop to loop through the stations array and comparing each station's 
		//first letter to the letter average, and then adding those stations to the output.
		for(int index = 0; index < stationList.length; index++) {
			if(stationList[index] != null && stationList[index].charAt(0) == avg)
				output = output + "\n" + stationList[index];
		} return output;
	}
}
