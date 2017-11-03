package Figure;

public class Circle extends Figure {
	
	private int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public double calArea() {
		return radius * radius * Math.PI;
	}

}
