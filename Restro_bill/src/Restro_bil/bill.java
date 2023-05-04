package Restro_bil;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 1000, 663);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restro Bill");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(291, 48, 263, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(45, 179, 169, 52);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(45, 283, 169, 52);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Milk-Rs.10", "Tea-Rs.20", "Hot Coffee-Rs.25", "Cold Coffee-Rs.30"}));
		c1.setBounds(188, 191, 304, 40);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		t1.setBounds(193, 293, 304, 40);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String qnty=t1.getText();
				int q=Integer.parseInt(qnty);
				int bill=0;
				if(item.equals("Milk-Rs.10"))
				{
					bill=q*10;
					JOptionPane.showMessageDialog(btnNewButton, "Hello\n Selected item: "+item+"\nQnty: "+q+"\n your bill:"+bill);
				}
				else if(item.equals("Tea-Rs.20"))
				{
					bill=q*20;
					JOptionPane.showMessageDialog(btnNewButton, "Hello\n Selected item: "+item+"\nQnty: "+q+"\n your bill:"+bill);
				}
				else if(item.equals("Hot Coffee-Rs.25"))
				{
					bill=q*25;
					JOptionPane.showMessageDialog(btnNewButton, "Hello\n Selected item: "+item+"\nQnty: "+q+"\n your bill:"+bill);
				}
				else if(item.equals("Cold Coffee-Rs.30"))
				{
					bill=q*30;
					JOptionPane.showMessageDialog(btnNewButton, "Hello\n Selected item: "+item+"\nQnty: "+q+"\n your bill:"+bill);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(321, 453, 171, 40);
		frame.getContentPane().add(btnNewButton);
	}
}
