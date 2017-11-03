package Figure;

public class Square extends Figure {
	private int height;
	private int width;
	
	public Square(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
	
	public double calArea() {
		return height * width;
	}
}
