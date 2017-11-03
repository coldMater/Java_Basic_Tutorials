package PaintShop;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class PaintBoard extends Canvas {

	private ArrayList<Figure> list = new ArrayList<>();
	
//	public PaintBoard() {
//		Line line = new Line();
//		line.setLineInfo(0, 0, 100, 100, new Color(255, 0, 0));
//		list.add(line);
//		Line line2 = new Line();
//		line2.setLineInfo(0, 50, 100, 150, new Color(0, 255, 0));
//		list.add(line2);
//		Line line3 = new Line();
//		line3.setLineInfo(0, 100, 100, 200, new Color(0, 0, 255));
//		list.add(line3);
//		
//		Square square = new Square();
//		square.setSquareInfo(0, 0, 200, 200, new Color(255, 0, 255));
//		list.add(square);
//	}

	@Override
	public void paint(Graphics g) {
		for(Figure figure : list) {
			figure.draw(g);
		}
	}
	
	public void addFigure(Figure figure) {
		list.add(figure);
	}

}
