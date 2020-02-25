
public class Main {
	public static void main(String[] args) {
		/*
		 * Legend:
		 * W - white
		 * Y - yellow
		 * B - blue
		 * R - red
		 * O - orange
		 * G - green
		 * 
		 * Front face = 0
		 * Back face = 1
		 * Top face = 2
		 * Bottom face = 3
		 * Right face = 4
		 * Left face = 5
		 * 
		 * 
		 * [0][1][2]
		 * [3][4][5]
		 * [6][7][8]
		 */
		Face[] faces = new Face[6];
		String[] color0 = {"W","W","W","W","W","W","W","W","W"};
		faces[0] = new Face(color0);
		String[] color1 = {"W","W","W","W","W","W","W","W","W"};
		faces[1] = new Face(color1);
		String[] color2 = {"W","W","W","W","W","W","W","W","W"};
		faces[2] = new Face(color2);
		String[] color3 = {"W","W","W","W","W","W","W","W","W"};
		faces[3] = new Face(color3);
		String[] color4 = {"W","W","W","W","W","W","W","W","W"};
		faces[4] = new Face(color4);
		String[] color5 = {"W","W","W","W","W","W","W","W","W"};
		faces[5] = new Face(color5);
		// proper cube
//		for (int i = 0; i < faces.length; i++) {
//			String[] colors = new String[9];
//			for (int j = 0; j < colors.length; j++) {
//				if (i == 0) {
//					colors[j] = "W";
//				} else if (i == 1) {
//					colors[j] = "Y";
//				} else if (i == 2) {
//					colors[j] = "B";
//				} else if (i == 3) {
//					colors[j] = "R";
//				} else if (i == 4) {
//					colors[j] = "O";
//				} else {
//					colors[j] = "G";
//				}
//			}
//			faces[i] = new Face(colors);
//		}
		
		// for user input
//		for (int i = 0; i < faces.length; i++) {
//			String[] colors = new String[9];
//			for (int j = 0; j < colors.length; j++) {
//				// get color from user input on i face
//				// check if valid color
//			}
//			faces[i] = new Face(colors);
//		}
		Cube rubik = new Cube(faces);
		System.out.println(rubik.isValidCube());
		
		return;
	}
}
