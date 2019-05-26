package LamViecNhom.Frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.crypto.dsig.keyinfo.PGPData;

import LamViecNhom.GameMain;
import LamViecNhom.Levels.LevelsFactory;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class PlayGame extends JFrame {
	private static PlayGame playGame = new PlayGame();
	public static PlayGame getInstance() {
		return playGame;
	}
	private JPanel contentPane;
	private JLabel lblTime;
	private JLabel lblMark;
	

	public JLabel getLblMark() {
		return lblMark;
	}

	public void setLblMark(JLabel lblMark) {
		this.lblMark = lblMark;
	}

	public JLabel getLblTime() {
		return lblTime;
	}

	public void setLblTime(JLabel lblTime) {
		this.lblTime = lblTime;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayGame frame = new PlayGame();
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
	private PlayGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1012, 611);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		lblMark = new JLabel("Mark: 0000");
		lblMark.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblMark.setBounds(744, 75, 145, 33);
		contentPane.add(lblMark);
		
		JButton btnSort = new JButton("Sort");
		btnSort.setBounds(744, 144, 115, 29);
		contentPane.add(btnSort);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("D:\\Documents\\Java\\WorkSpace\\ThietKeHuongDoiTuong\\ProjectGamePikachu\\Images\\bSoundAA.png"));
		label_1.setBounds(892, 481, 98, 87);
		contentPane.add(label_1);
		
		JButton btnNewButton = new JButton("MARK");
		btnNewButton.setForeground(new Color(255, 255, 0));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(785, 188, 169, 51);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(874, 144, 115, 29);
		contentPane.add(btnExit);
		
		lblTime = new JLabel("Time: 60");
		lblTime.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblTime.setBounds(744, 16, 145, 33);
		contentPane.add(lblTime);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\Documents\\Java\\WorkSpace\\ThietKeHuongDoiTuong\\ProjectGamePikachu\\Images\\sky.jpg"));
		label.setBounds(0, 0, 1015, 584);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(44, 39, 642, 496);
		contentPane.add(panel);
	}
}
