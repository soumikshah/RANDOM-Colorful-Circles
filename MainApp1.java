package circlePractice;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class MainApp1 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ControlPanel panel;
	private Canvas canvasRef;

	public MainApp1() {
		canvasRef = new Canvas();
		panel = new ControlPanel();
		panel.setCanvas(canvasRef);
		add(canvasRef);
		add(panel);

	}

	public static void main(String args[]) {
		MainApp1 app = new MainApp1();
		app.setTitle("Colorful circles");
		app.setLayout(new GridLayout(2, 1));
		app.setSize(400, 400);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);

	}
}
