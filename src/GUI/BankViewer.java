package GUI;

import java.util.Vector;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Bank.BankInput;
import manager.BankManager;

public class BankViewer extends JPanel {
	
	WindowFrame frame;
	
	BankManager bankmanager;
	
	public BankViewer(WindowFrame frame, BankManager bankmanager) {
		this.frame = frame;
		this.bankmanager = bankmanager;
		
		System.out.println("***" + bankmanager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Birth");
		model.addColumn("Account");
		model.addColumn("Phone Number");
		
		for(int i=0; i<bankmanager.size(); i++) {
			Vector row = new Vector();
			BankInput bi = bankmanager.get(i);
			row.add(bi.getName());
			row.add(bi.getBirth());
			row.add(bi.getAccount());
			row.add(bi.getNum());
			
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
	
}