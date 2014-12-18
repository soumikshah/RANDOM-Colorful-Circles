package circlePractice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ControlPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton redButton;
	private JButton blueButton;
	private JButton clearButton;
	private Canvas canvasRef;
	private JTextField textfield;
	
	public void setCanvas(Canvas canvasRef) {
		this.canvasRef = canvasRef;
	}

	public ControlPanel() {
		redButton = new JButton("green");
		redButton.addActionListener(new redAction());

		blueButton = new JButton("Random");
		blueButton.addActionListener(new randomAction());

		clearButton = new JButton("clear");
		clearButton.addActionListener(new clearButton());

		textfield = new JTextField("Enter the number of circles you want.");

		add(textfield);

		add(redButton);
		add(blueButton);
		// add( clearButton );

	}

	class redAction implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("green button");
			int msg = Integer.parseInt(textfield.getText());
			for (int i = 0; i < msg; i++) {
				canvasRef.addGreen();
			}
		}
	}

	/*
	 * private int randomRadius() { return (int)(Math.random()*4); }
	 */
	class randomAction implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			int x = (int) (Math.random() * 2) ;
			System.out.println("Random button");
			int msg = Integer.parseInt(textfield.getText());
			for (int i = 0; i < msg; i++) {
				System.out.println(x);
				if(x == 0){
				canvasRef.addBlue();
				x++;
				}
				else if(x == 1){
				canvasRef.addBlack();
				x++;
				}
				else if(x == 2){
                canvasRef.addRed();
                x++;
				}
				else{
                canvasRef.addGreen();	
                break;
				}
			}
		}
	}

	class clearButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("clearing all.. wait..");
			canvasRef.addClear();

		}

	}

}
