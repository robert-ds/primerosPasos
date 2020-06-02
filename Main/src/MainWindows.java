import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainWindows {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	int num1, num2, r;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindows window = new MainWindows();
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
	public MainWindows() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblN = new JLabel("N = ");
		lblN.setBounds(10, 23, 46, 14);
		frame.getContentPane().add(lblN);
		
		JLabel lblD = new JLabel("D =");
		lblD.setBounds(10, 57, 46, 14);
		frame.getContentPane().add(lblD);
		
		JLabel lblR = new JLabel("R =");
		lblR.setBounds(10, 95, 46, 14);
		frame.getContentPane().add(lblR);
		
		textField = new JTextField();
		textField.setBounds(73, 20, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(73, 54, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(73, 92, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					num1 = Integer.parseInt(textField.getText());
					num2 = Integer.parseInt(textField_1.getText());
					r = num1 / num2;
					textField_2.setText(String.valueOf(r));
										
				}catch(NumberFormatException e){
					System.out.println("Escribe 2 Mayores a Cero");
				}catch(ArithmeticException e1){
					System.out.println(e1.toString());
				}
				
			}
		});
		btnDividir.setBounds(70, 123, 89, 23);
		frame.getContentPane().add(btnDividir);
	}
}
