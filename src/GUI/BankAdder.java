package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class BankAdder extends JPanel {
	
	WindowFrame frame;

	public BankAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelBirth = new JLabel("Birth: ", JLabel.TRAILING);
		JTextField fieldBirth = new JTextField(10);
		labelBirth.setLabelFor(fieldBirth);
		panel.add(labelBirth);
		panel.add(fieldBirth);
		
		JLabel labelAccount = new JLabel("Account: ", JLabel.TRAILING);
		JTextField fieldAccount = new JTextField(10);
		labelAccount.setLabelFor(fieldAccount);
		panel.add(labelAccount);
		panel.add(fieldAccount);
		
		JLabel labelNum = new JLabel("Phone Number: ", JLabel.TRAILING);
		JTextField fieldNum = new JTextField(10);
		labelNum.setLabelFor(fieldNum);
		panel.add(labelNum);
		panel.add(fieldNum);
		
		panel.add(new JButton("Save"));
		panel.add(new JButton("Cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
	
}