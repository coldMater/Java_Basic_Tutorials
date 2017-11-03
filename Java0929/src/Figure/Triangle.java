package Figure;

public class Triangle extends Figure {
	private int height;
	private int width;
	
	public Triangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	public double calArea() {
		return (height * width) / 2.0;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
}
