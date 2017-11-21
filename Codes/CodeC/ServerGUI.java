import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;

public class ServerGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
					ServerGUI frame = new ServerGUI();
					frame.setVisible(true);
					Server.init();
					Server.read(frame.textArea);
				
	}

	/**
	 * Create the frame.
	 */
	public ServerGUI() {
		setTitle("Server");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(188, 30, 244, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterTheMessage = new JLabel("Enter the Message");
		lblEnterTheMessage.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblEnterTheMessage.setBounds(16, 34, 159, 16);
		contentPane.add(lblEnterTheMessage);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendData();
			}
		});
		btnSend.setBounds(135, 68, 117, 29);
		contentPane.add(btnSend);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 93, 417, 233);
		contentPane.add(scrollPane);
		
		
		textArea.setBounds(31, 109, 401, 203);
		scrollPane.setViewportView(textArea);
		
	}
	JTextArea textArea = new JTextArea();
	private void sendData(){
		String msg= textField.getText();
		try {
			Server.write(msg);
			System.out.println("Data Send is ::: "+msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
