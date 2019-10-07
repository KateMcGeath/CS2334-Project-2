/*
 * @author Kate McGeath
 * @version 2019-10-09
 */
public class MesoInherit extends MesoAbstract {

	private static final int ID_LENGTH = 4;
	private String stID;
	private String[] stationList;
	
	public MesoInherit(String stID) {
		this.stID = stID;
		stationList = stID.split("");
	}
	
	@Override
	public int[] calAverage() {
		double avg = 0.0;
		int[] avgArray = new int[3];
		
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
		
	}
}
