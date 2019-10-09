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
		PosAvg posAvg = new PosAvg();
		this.stationList = posAvg.getStationsArray();
		int stations = 0;
			for(int index = 0; index < stationList.length; index++) {
				if(stationList[index] != null && stationList[index].charAt(0) == avg)
					stations++;
			} return stations;
	}
	
	public String toString() {
		PosAvg posAvg = new PosAvg();
		String output = "They are:";
		try {
			this.stationList = posAvg.getStationsArray();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int index = 0; index < stationList.length; index++) {
			if(stationList[index] != null && stationList[index].charAt(0) == avg)
				output = output + "\n" + stationList[index];
		} return output;
	}
}
