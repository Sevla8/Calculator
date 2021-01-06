import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
	private char[] data = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.', '=', 'C', '+', '-', '*', '/'};

	private JPanel container = new JPanel();
	private JLabel screen = new JLabel("0");
	private JButton[] buttons = new JButton[this.data.length];
	
	private double number;
	private Operator operator; 

	public Calculator() {
		this.setSize(240, 260);
		this.setTitle("Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		this.container.setOpaque(true);
		this.setContentPane(container);
		this.setVisible(true);
	}

	private void init() {
		this.screen.setFont(new Font("Arial", Font.BOLD, 20));

		for (int i = 0; i < this.data.length; i += 1) {
			this.buttons[i] = new JButton(Character.toString(this.data[i]));
			///
			switch (i) {
				case 11 : 
					this.buttons[i].addActionListener(new EqualListener());
					numbers.add(this.buttons[i]);
					break;
				case 12 :
					this.buttons[i].setForeground(Color.RED);
					this.buttons[i].addActionListener(new ResetListener());
					operators.add(this.buttons[i]);
					break;
				case 13 :
					this.buttons[i].addActionListener(new AddListener());
					operators.add(this.buttons[i]);
					break;
				case 14 :
					this.buttons[i].addActionListener(new SubListener());
					operators.add(this.buttons[i]);
					break;
				case 15 :
					this.buttons[i].addActionListener(new MulListener());
					operators.add(this.buttons[i]);
					break;
				case 16 :
					this.buttons[i].addActionListener(new DivListener());
					operators.add(this.buttons[i]);
					break;
				default :
					this.buttons[i].addActionListener(new NumberListener());
					numbers.add(this.buttons[i]);
					break;
			}
		}
	}

	private void calculate() {
		switch (this.operator) {
			case Operator.ADDITION : 

				break;
			case Operator.SUBSTRACTION : 

				break;
			case Operator.MULTIPLICATION : 

				break;
			case Operator.DIVISION : 

				break;
		}
	}

	class EqualListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {

		}
	}

	class ResetListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
		}
	}

	class AddListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
		}
	}

	class SubListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
		}
	}

	class MulListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
		}
	}

	class DivListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
		}
	}

	class NumberListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
		}
	}
}
