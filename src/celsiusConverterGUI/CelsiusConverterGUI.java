package celsiusConverterGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Conversor de Celsius a Fahrenheit.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class CelsiusConverterGUI extends JFrame {

	private JPanel contentPane;
	private JTextField celsiusTextField;
	private JLabel fahrenheitLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CelsiusConverterGUI frame = new CelsiusConverterGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CelsiusConverterGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 219, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		celsiusTextField = new JTextField();
		celsiusTextField.setBounds(10, 11, 86, 20);
		contentPane.add(celsiusTextField);
		celsiusTextField.setColumns(10);

		JLabel celsiusLabel = new JLabel("Celsius");
		celsiusLabel.setBounds(106, 14, 46, 14);
		contentPane.add(celsiusLabel);

		JButton convertButton = new JButton("Convert");
		convertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tempFahr = (int) ((Double.parseDouble(celsiusTextField.getText())) * 1.8 + 32);
				fahrenheitLabel.setText(tempFahr + " Fahrenheit");
			}
		});
		convertButton.setBounds(10, 42, 86, 23);
		contentPane.add(convertButton);

		fahrenheitLabel = new JLabel("Fahrenheit");
		fahrenheitLabel.setBounds(106, 46, 97, 14);
		contentPane.add(fahrenheitLabel);
	}
}
