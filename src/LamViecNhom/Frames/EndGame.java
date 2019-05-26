package LamViecNhom.Frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import LamViecNhom.Rating.Rating;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EndGame extends JFrame implements Rating{
	private static EndGame endGame = new EndGame();
	public static EndGame getInstance() {
		return endGame;
	}
	private JPanel contentPane;
	private JTextField textField;
	private int mark;
	private ImageIcon star = new ImageIcon("Images\\b4_BackClick.png");
	private ImageIcon iconBackC = new ImageIcon("Images\\b4_BackClick.png");
	private ImageIcon iconBackI = new ImageIcon("Images\\b4_BackInMouse.png");
	private ImageIcon iconBackO = new ImageIcon("Images\\b4_BackOutMouse.png");
	private JButton btBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EndGame frame = new EndGame();
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
	private EndGame() {
		setTitle("Save Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1159, 678);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblim = new JLabel("Mark: ");
		lblim.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblim.setHorizontalAlignment(SwingConstants.LEFT);
		lblim.setForeground(new Color(255, 255, 0));
		lblim.setBounds(38, 79, 79, 37);
		contentPane.add(lblim);

		btBack = new JButton("");
		btBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btBack.setBounds(441, 547, 273, 59);
		contentPane.add(btBack);
		btBack.setIcon(iconBackO);
		btBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btBack.setIcon(iconBackI);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btBack.setIcon(iconBackO);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				btBack.setIcon(iconBackI);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				btBack.setIcon(iconBackC);
			}
		});

		JLabel label_1 = new JLabel("");
		label_1.setBounds(126, 120, 356, 49);
		contentPane.add(label_1);

		JLabel lblNewLabel_1 = new JLabel("<000>");
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(116, 76, 131, 42);
		contentPane.add(lblNewLabel_1);

		JLabel lblEnterTheGamer = new JLabel("Enter the gamer: ");
		lblEnterTheGamer.setForeground(new Color(255, 255, 0));
		lblEnterTheGamer.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblEnterTheGamer.setBounds(38, 204, 196, 37);
		contentPane.add(lblEnterTheGamer);

		textField = new JTextField();
		textField.setForeground(new Color(127, 255, 212));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(234, 199, 768, 42);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblnhGi = new JLabel("Rating: ");
		lblnhGi.setForeground(new Color(255, 255, 0));
		lblnhGi.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblnhGi.setBounds(38, 132, 93, 37);
		contentPane.add(lblnhGi);

		JLabel lblNewLabel = new JLabel("RESULT OF THE GAME");
		lblNewLabel.setForeground(new Color(222, 184, 135));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("UVN Hai Long", Font.PLAIN, 52));
		lblNewLabel.setBounds(346, 0, 433, 89);
		contentPane.add(lblNewLabel);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(
				"D:\\Documents\\Java\\WorkSpace\\ThietKeHuongDoiTuong\\ProjectGamePikachu\\Images\\disableBackGround.png"));
		label.setBounds(0, 0, 1154, 640);
		contentPane.add(label);
	}

	@Override
	public void rating() {
		// TODO Auto-generated method stub
		
	}
}
