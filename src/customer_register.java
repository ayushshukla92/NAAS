import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class customer_register extends JFrame {
customer cust=new customer();
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public JCheckBox chckbxTimesOfIndia,chckbxEconimicTimes,chckbxNewCheckBox,chckbxTheHindu,chckbxNewCheckBox_1,chckbxNewCheckBox_2,chckbxNewCheckBox_3;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer_register frame = new customer_register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public customer_register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(33, 40, 46, 14);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(126, 37, 211, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setBounds(33, 94, 73, 14);
		contentPane.add(lblAddress);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 91, 211, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSectorNo = new JLabel("SECTOR NO.");
		lblSectorNo.setBounds(33, 157, 73, 14);
		contentPane.add(lblSectorNo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 154, 211, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		chckbxTimesOfIndia = new JCheckBox("TIMES OF INDIA");
		chckbxTimesOfIndia.setBounds(9, 227, 138, 23);
		contentPane.add(chckbxTimesOfIndia);
		
		chckbxEconimicTimes = new JCheckBox("ECONOMIC TIMES");
		chckbxEconimicTimes.setBounds(9, 269, 115, 23);
		contentPane.add(chckbxEconimicTimes);
		
		 chckbxTheHindu = new JCheckBox("THE HINDU");
		chckbxTheHindu.setBounds(9, 312, 97, 23);
		contentPane.add(chckbxTheHindu);
		
		chckbxNewCheckBox = new JCheckBox("TOPGEAR");
		chckbxNewCheckBox.setBounds(9, 352, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("THE TELEGRAPH");
		chckbxNewCheckBox_1.setBounds(245, 227, 115, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("DIGIT");
		chckbxNewCheckBox_2.setBounds(245, 269, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		chckbxNewCheckBox_3 = new JCheckBox("INDIA TODAY");
		chckbxNewCheckBox_3.setBounds(245, 312, 97, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				cust.name=textField.getText();
				cust.address=textField_1.getText();
				cust.sector=textField_2.getText();
				cust.ti=chckbxTimesOfIndia.isSelected();
				cust.th=chckbxTheHindu.isSelected();
				cust.tg=chckbxNewCheckBox.isSelected();
				cust.et=chckbxEconimicTimes.isSelected();
				cust.it=chckbxNewCheckBox_3.isSelected();
				cust.tt=chckbxNewCheckBox_1.isSelected();
				cust.dg=chckbxNewCheckBox_2.isSelected();
				cust.amt=0;
				System.out.print("data saved");
				try{
				FileOutputStream fs=new FileOutputStream("customerdatabase.txt",true);
				ObjectOutputStream os=new ObjectOutputStream(fs);
				
				os.writeObject(cust);
				os.close();
				fs.close();
				JOptionPane.showMessageDialog(null,"CUSTOMER REGISTERED SUCCESFULLY","RESULT",EXIT_ON_CLOSE);
				
				
				
				}
				catch(Exception e1)
				{
				System.out.println(e1);	
				}
				
			}
		});
		btnSave.setBounds(286, 387, 89, 23);
		contentPane.add(btnSave);
	}
}
