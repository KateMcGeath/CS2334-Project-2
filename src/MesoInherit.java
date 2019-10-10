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
	private String[] stationList = new String[3];
	private int[] avgArray = new int[3];
	private char asciiValue;
	
	public MesoInherit(MesoStation station) {
		this.stID = station.getStID();
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
		int[] avg = calAverage();
		this.asciiValue = (char)avg[2];
		return asciiValue;
	}
}

