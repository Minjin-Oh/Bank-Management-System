package GUI;

import javax.swing.JFrame;

import javax.swing.JPanel;
import manager.BankManager;

public class WindowFrame extends JFrame {
	
	BankManager bankmanager;
	MenuSelection menuselection;
	BankAdder bankadder;
	BankViewer bankviewer;
	
	public WindowFrame(BankManager bankmanager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Bank Account Setting");
		
		this.bankmanager = bankmanager;
		this.menuselection = new MenuSelection(this);
		this.bankadder = new BankAdder(this);
		this.bankviewer = new BankViewer(this, this.bankmanager);
		
		this.setupPanel(menuselection);
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public BankAdder getBankadder() {
		return bankadder;
	}

	public void setBankadder(BankAdder bankadder) {
		this.bankadder = bankadder;
	}

	public BankViewer getBankviewer() {
		return bankviewer;
	}

	public void setBankviewer(BankViewer bankviewer) {
		this.bankviewer = bankviewer;
	}
}