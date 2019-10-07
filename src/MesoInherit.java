/*
 * @author Kate McGeath
 * @version 2019-10-09
 */
public class MesoInherit extends MesoAbstract {

	private String stID;
	private String[] stationList;
	
	public MesoInherit(String stID) {
		this.stID = stID;
		stationList = stID.split("");
	}
	
	@Override
	public int[] calAverage() {
		
	}
	
	@Override
	public char letterAverage() {
		
	}
}
