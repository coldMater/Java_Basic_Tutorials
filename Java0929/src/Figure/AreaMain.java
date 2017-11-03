package Figure;

public class AreaMain {

	public static void main(String[] args) {
		FigureProgram figureProgram = new FigureProgram();
		double area = figureProgram.calArea(new Square(10,5));
		
		System.out.println(area);
		
		area = figureProgram.calArea(new Triangle(10,5));
		
		System.out.println(area);
		
		area = figureProgram.calArea(new Circle(5));
		
		System.out.println(area);
	}

}
