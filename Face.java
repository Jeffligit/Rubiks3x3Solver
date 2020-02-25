
public class Face {
	final int CENTER = 4;
	String[] squares = new String[9];
	public Face(String[] squares) {
		this.squares = squares;
	}
	
	public String getCenter() {
		return squares[CENTER];
	}
	
	public int getSize() {
		return squares.length;
	}
	
	public String getColorAt(int i) {
		return squares[i];
	}
}
