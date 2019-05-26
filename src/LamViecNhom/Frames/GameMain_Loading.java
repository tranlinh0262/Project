package LamViecNhom.Frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class GameMain_Loading extends JFrame {
	private static GameMain_Loading gmLoading = new GameMain_Loading();
	public static GameMain_Loading getInstance() {
		return gmLoading;
	}
	private JPanel contentPane;
	private JLabel backGround;
	private JLabel loadingFrame;
	private ImageIcon bg = new ImageIcon("Images\\BackGoundStart2.jpg");
	private ImageIcon lImage = new ImageIcon("Images\\LoadingImage.gif");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameMain_Loading frame = new GameMain_Loading();
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
	private GameMain_Loading() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("Images\\iconBar2.png"));
		setTitle("Welcome To The Pikachu World");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 862, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		backGround = new JLabel("");
		backGround.setBounds(5, 5, 846, 509);
		backGround.setIcon(bg);
		contentPane.add(backGround);

		loadingFrame = new JLabel("");
		loadingFrame.setIcon(lImage);
		loadingFrame.setBounds(5, 512, 856, 53);
		contentPane.add(loadingFrame);
	}
}
