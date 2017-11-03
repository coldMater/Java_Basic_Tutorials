package PaintShop;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Figure {
	private int x1;
	private int y1;
	private int width;
	private int height;
	private Color color;
	
	public void setSquareInfo(int x1, int y1, int width, int height, Color color) {
		this.x1 = x1;
		this.y1 = y1;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.drawRect(x1, y1, width, height);
	}
	
}
