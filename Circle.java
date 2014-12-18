package circlePractice;

import java.awt.Color;

public class Circle {
	int x;
	int y;
	int r;
	public Color color;

	public String toString() {
		return "x = " + x + " y = " + y + " r = "  + r + " c = " + color;
	}
	
	public Circle(int x, int y, int r) {
		this.x = x; this.y = y; this.r = r;
		color = new Color(255, 255, 255);
	}
	
	Circle() {
		this(100, 100, 10);
	}
	
	void ColorBlue() {
		color = new Color(0, 0, 255);
	}
	
	void ColorRed() {
		color = new Color(255, 0, 0);
	}
	void ColorGreen(){
		color = new Color(0,255,0);
	}
}
