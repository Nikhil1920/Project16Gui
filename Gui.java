package project16;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Gui extends JFrame {
	public static String res;
	public static void set_res(String a)
	{
		res = a;
	}

	private JPanel contentPane;
	private JTextField inp1;
	private JTextField inp2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
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
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1079, 734);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_1.setForeground(new Color(0, 0, 255));
		btnNewButton_1.setBounds(670, 433, 240, 96);
		contentPane.add(btnNewButton_1);
		
		JLabel outp = new JLabel("");
		outp.setHorizontalAlignment(SwingConstants.CENTER);
		outp.setForeground(Color.GRAY);
		outp.setFont(new Font("Tahoma", Font.BOLD, 40));
		outp.setBounds(34, 327, 999, 96);
		contentPane.add(outp);

		JLabel lblNewLabel = new JLabel("Project 16");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 48));
		lblNewLabel.setBounds(296, 10, 416, 72);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the location of the file");
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_1.setBounds(34, 145, 582, 46);
		contentPane.add(lblNewLabel_1);
		
		inp1 = new JTextField();
		inp1.setForeground(Color.DARK_GRAY);
		inp1.setBackground(Color.LIGHT_GRAY);
		inp1.setFont(new Font("Tahoma", Font.BOLD, 30));
		inp1.setBorder(new LineBorder(Color.CYAN, 2));
		inp1.setBounds(635, 145, 398, 46);
		contentPane.add(inp1);
		inp1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter the word to be searched");
		lblNewLabel_2.setForeground(Color.YELLOW);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_2.setBounds(34, 242, 582, 46);
		contentPane.add(lblNewLabel_2);
		
		inp2 = new JTextField();
		inp2.setBackground(Color.LIGHT_GRAY);
		inp2.setBorder(new LineBorder(Color.CYAN, 2));
		inp2.setFont(new Font("Tahoma", Font.BOLD, 40));
		inp2.setBounds(635, 242, 398, 46);
		contentPane.add(inp2);
		inp2.setColumns(10);
		
		JButton search = new JButton("Search");
		search.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Pro.setfile_location(inp1.getText());
				Pro.setkey_word(inp2.getText());
				try {
					Pro.main_func();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				outp.setText(res);
			}
		});
		search.setForeground(new Color(0, 0, 255));
		search.setFont(new Font("Tahoma", Font.BOLD, 40));
		search.setBounds(122, 433, 240, 96);
		contentPane.add(search);
	}
}
