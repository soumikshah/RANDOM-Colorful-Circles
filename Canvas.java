package circlePractice;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Canvas extends JPanel {

	private static final long serialVersionUID = 1L;
	ArrayList<Circle> circle;
	ControlPanel panel;
	Color[] color;

	public Canvas() {
		circle = new ArrayList<Circle>();
		this.setSize(new Dimension(400, 400));
	}

	public Canvas(int N) {

		this();

		for (int i = 0; i < N; i++) {
			addRed();
			addBlue();
		}
	}

	public void update() {
		repaint();
		for (Circle circles : circle) {
			System.out.println(circles);
		}
	}

	public void addRed() {
		Circle r = new Circle(randomPos(), randomPos(), randomRadius());
		r.ColorRed();
		circle.add(r);
		update();
	}

	private int randomRadius() {
		return (int) (Math.random() * 200);
	}

	private int randomPos() {
		return (int) (Math.random() * 20) + 10;
	}

	public void addBlue() {
		Circle r = new Circle(randomPos(), randomPos(), randomRadius());
		r.ColorBlue();
		circle.add(r);
		update();
	}

	public void addBlack() {
		Circle r = new Circle(randomPos(), randomPos(), randomRadius());
		r.ColorBlue();
		circle.add(r);
		update();
	}

	public void addGreen() {
		Circle r = new Circle(randomPos(), randomPos(), randomRadius());
		r.ColorGreen();
		circle.add(r);
		update();

	}

	protected void paintComponent(Graphics pen) {
		super.paintComponent(pen);

		for (Circle circles : circle) {
			pen.setColor(circles.color);
			pen.fillOval(circles.x, circles.y, circles.r, circles.r);
		}
	}

	public void addClear() {
		circle.clear();
		update();

	}

}
