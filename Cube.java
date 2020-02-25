import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Cube {
	final int CENTER = 4;
	Face[] faces = new Face[6];
	public Cube (Face[] faces) {
		this.faces = faces;
	}
	
	
	/*
	 * What makes a 3x3 cube valid?
	 * 1. There are exactly 6 colors each occurring 9 times
	 * 2. The center of each face is a different color
	 */
	public boolean isValidCube() {
		// check the centers
		Set<String> colors = new TreeSet<String>();
		for (int i = 0; i < faces.length; i++) {
			if (colors.contains(faces[i].getCenter())) {
				return false;
			} else {
				colors.add(faces[i].squares[CENTER]);
			}
 		}
		// check for exactly 6 colors each occurring 9 times
		int[] colorCounter = new int[6];
		List<String> colorList = new ArrayList<String>();
		for (int i = 0; i < faces.length; i++) {
			for (int j = 0; j < faces[i].getSize(); j++) {
				if (colors.contains(faces[i].getColorAt(j))) {
					if (colorList.contains(faces[i].getColorAt(j))) {
						colorCounter[colorList.indexOf(faces[i].getColorAt(j))] = 
						++colorCounter[colorList.indexOf(faces[i].getColorAt(j))];
					} else {
						colorList.add(faces[i].getColorAt(j));
						colorCounter[colorList.indexOf(faces[i].getColorAt(j))] = 
						++colorCounter[colorList.indexOf(faces[i].getColorAt(j))];
					}
				} else {
					return false;
				}
			}
		}
		for (int i = 0; i < colorCounter.length; i++) {
			if (colorCounter[i] != 9) {
				return false;
			}
		}
		return true;
	}
	
	
}
