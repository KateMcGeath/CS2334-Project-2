import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * @author Kate McGeath
 * @version 2019-10-09
 */
public class PosAvg {
private String stID;

	public PosAvg(String stID) {
		this.stID = stID;
	}
	
	public int indexOfStation() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader("Mesonet1.txt"));
	}
}
