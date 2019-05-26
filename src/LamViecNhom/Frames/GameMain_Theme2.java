package LamViecNhom.Frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import LamViecNhom.CurrentData;
import LamViecNhom.GameMain;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameMain_Theme2 extends JFrame implements Observer {
	private GameMain g;
	private ButtonsData b;
	private CurrentData c;

	private JPanel contentPane;

	private JButton btStart;
	private JButton btLevels;
	private JButton btMark;
	private JButton btExit;
	private JButton btHelps;
	private JButton btAbout;
	private JButton btBack;
	private JLabel lbLevel1;
	private JLabel lbLevel2;
	private JLabel lbLevel3;
	private JLabel labelSound;
	private JLabel labelThemes;
	private JLabel labelPikachu;
	private JTextField textField;
	private JLabel bgMain;
	private ImageIcon iconStartI = new ImageIcon("Images\\b4_StartInMouse.png");
	private ImageIcon iconStartO = new ImageIcon("Images\\b4_StartOutMouse.png");
	private ImageIcon iconStartC = new ImageIcon("Images\\b4_StartClick.png");
	private ImageIcon iconLevelsI = new ImageIcon("Images\\b4_LevelsInMouse.png");
	private ImageIcon iconLevelsO = new ImageIcon("Images\\b4_LevelsOutMouse.png");
	private ImageIcon iconLevelsC = new ImageIcon("Images\\b4_LevelsClick.png");
	private ImageIcon iconMarkI = new ImageIcon("Images\\b4_MarkInMouse.png");
	private ImageIcon iconMarkO = new ImageIcon("Images\\b4_MarkOutMouse.png");
	private ImageIcon iconMarkC = new ImageIcon("Images\\b4_MarkClick.png");
	private ImageIcon iconHelpsI = new ImageIcon("Images\\b4_HelpsInMouse.png");
	private ImageIcon iconHelpsO = new ImageIcon("Images\\b4_HelpsOutMouse.png");
	private ImageIcon iconHelpsC = new ImageIcon("Images\\b4_HelpsClick.png");
	private ImageIcon iconAboutI = new ImageIcon("Images\\b4_AboutInMouse.png");
	private ImageIcon iconAboutO = new ImageIcon("Images\\b4_AboutOutMouse.png");
	private ImageIcon iconAboutC = new ImageIcon("Images\\b4_AboutClick.png");
	private ImageIcon iconBackC = new ImageIcon("Images\\b4_BackClick.png");
	private ImageIcon iconBackI = new ImageIcon("Images\\b4_BackInMouse.png");
	private ImageIcon iconBackO = new ImageIcon("Images\\b4_BackOutMouse.png");
	private ImageIcon iconExitI = new ImageIcon("Images\\b4_ExitInMouse.png");
	private ImageIcon iconExitO = new ImageIcon("Images\\b4_ExitOutMouse.png");
	private ImageIcon iconExitC = new ImageIcon("Images\\b4_ExitClick.png");
	private ImageIcon iconEnSound = new ImageIcon("Images\\bSoundAA.png");
	private ImageIcon iconMuteSound = new ImageIcon("Images\\bSoundBB.png");
	private ImageIcon iconChangeThemes = new ImageIcon("Images\\bThemes.png");
	private ImageIcon iconChooseLevel1 = new ImageIcon("Images\\levelsChoosen1.png");
	private ImageIcon iconChooseLevel2 = new ImageIcon("Images\\levelsChoosen2.png");
	private ImageIcon iconChooseLevel3 = new ImageIcon("Images\\levelsChoosen3.png");
	private ImageIcon iconUnChooseLevel1 = new ImageIcon("Images\\levelsUnChoose1.png");
	private ImageIcon iconUnChooseLevel2 = new ImageIcon("Images\\levelsUnChoose2.png");
	private ImageIcon iconUnChooseLevel3 = new ImageIcon("Images\\levelsUnChoose3.png");
	private ImageIcon iconPkachu = new ImageIcon("Images\\iconTop.png");
	private ImageIcon bgMotion = new ImageIcon("Images\\iconMotion.gif");
	private ImageIcon bgDisable = new ImageIcon("Images\\disableBackGround.png");

	private boolean haveSound = true;
	private int numLevels = 0;

	public JLabel getLabelPikachu() {
		return labelPikachu;
	}

	public JButton getBtStart() {
		return btStart;
	}

	public JButton getBtLevels() {
		return btLevels;
	}

	public JButton getBtMark() {
		return btMark;
	}

	public JButton getBtExit() {
		return btExit;
	}

	public JButton getBtHelps() {
		return btHelps;
	}

	public JButton getBtAbout() {
		return btAbout;
	}

	public JButton getBtBack() {
		return btBack;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

	}

	/**
	 * Create the frame.
	 */
	public GameMain_Theme2(GameMain g, ButtonsData b, CurrentData c) {
		this.g = g;
		this.b = b;
		this.c = c;

		setIconImage(Toolkit.getDefaultToolkit().getImage("Images\\iconBar2.png"));
		setTitle("Game Main");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1196, 662);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btStart = g.getButtonData().getBtStart();
		btStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btStart.setIcon(iconStartI);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btStart.setIcon(iconStartO);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				btStart.setIcon(iconStartI);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				btStart.setIcon(iconStartC);
			}
		});

		btStart.setIcon(iconStartO);
		btStart.setBounds(902, 257, 273, 59);
		contentPane.add(btStart);

		lbLevel1 = g.getButtonData().getLbLevel1();
		lbLevel1.setIcon(iconChooseLevel1);
		lbLevel1.setBounds(902, 257, 273, 67);
		contentPane.add(lbLevel1);
		lbLevel1.hide();

		lbLevel2 = g.getButtonData().getLbLevel2();
		lbLevel2.setIcon(iconUnChooseLevel2);
		lbLevel2.setBounds(902, 340, 285, 67);
		contentPane.add(lbLevel2);
		lbLevel2.hide();

		lbLevel3 = g.getButtonData().getLbLevel3();
		lbLevel3.setIcon(iconUnChooseLevel3);
		lbLevel3.setBounds(902, 423, 285, 67);
		contentPane.add(lbLevel3);
		lbLevel3.hide();

		btLevels = g.getButtonData().getBtLevels();
		btLevels.setIcon(iconLevelsO);
		btLevels.setBounds(902, 314, 273, 59);
		contentPane.add(btLevels);
		btLevels.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btLevels.setIcon(iconLevelsI);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btLevels.setIcon(iconLevelsO);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				btLevels.setIcon(iconLevelsI);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				btLevels.setIcon(iconLevelsC);
			}
		});

		btMark = g.getButtonData().getBtMark();
		btMark.setIcon(iconMarkO);
		btMark.setBounds(902, 373, 273, 59);
		contentPane.add(btMark);
		btMark.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btMark.setIcon(iconMarkI);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btMark.setIcon(iconMarkO);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				btMark.setIcon(iconMarkI);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				btMark.setIcon(iconMarkC);
			}
		});

		btAbout = g.getButtonData().getBtAbout();
		btAbout.setIcon(iconAboutO);
		btAbout.setBounds(902, 486, 273, 59);
		contentPane.add(btAbout);
		btAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btAbout.setIcon(iconAboutI);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btAbout.setIcon(iconAboutO);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				btAbout.setIcon(iconAboutI);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				btAbout.setIcon(iconAboutC);
			}
		});

		btBack = g.getButtonData().getBtBack();
		btBack.setIcon(iconBackO);
		btBack.setBounds(902, 561, 273, 59);
		contentPane.add(btBack);
		btBack.hide();
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

		btExit = g.getButtonData().getBtExit();
		btExit.setIcon(iconExitO);
		btExit.setBounds(902, 561, 273, 59);
		contentPane.add(btExit);
		btExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btExit.setIcon(iconExitI);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btExit.setIcon(iconExitO);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				btExit.setIcon(iconExitI);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				btExit.setIcon(iconExitC);
			}
		});

		btHelps = g.getButtonData().getBtHelps();
		btHelps.setIcon(iconHelpsO);
		btHelps.setBounds(902, 431, 273, 59);
		contentPane.add(btHelps);
		btHelps.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btHelps.setIcon(iconHelpsI);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btHelps.setIcon(iconHelpsO);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				btHelps.setIcon(iconHelpsI);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				btHelps.setIcon(iconHelpsC);
			}
		});

		textField = g.getButtonData().getTextField();
		textField.setBackground(new Color(224, 255, 255));
		textField.setForeground(new Color(138, 43, 226));
		textField.setFont(new Font("UVN Saigon", Font.BOLD, 20));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setText("Beginnings...");
		textField.setBounds(15, 16, 865, 489);
		contentPane.add(textField);
		textField.hide();
		textField.setColumns(10);

		labelSound = g.getButtonData().getLabelSound();
		labelSound.setIcon(iconEnSound);
		labelSound.setBounds(0, 513, 109, 110);
		contentPane.add(labelSound);

		labelThemes = g.getButtonData().getLabelThemes();
		labelThemes.setIcon(iconChangeThemes);
		labelThemes.setBounds(104, 523, 100, 100);
		contentPane.add(labelThemes);

		labelPikachu = new JLabel(iconPkachu);
		labelPikachu.setBounds(908, 16, 267, 225);
		contentPane.add(labelPikachu);

		bgMain = g.getButtonData().getBg();
		bgMain.setIcon(bgMotion);
		bgMain.setHorizontalAlignment(SwingConstants.LEFT);
		bgMain.setVerticalAlignment(SwingConstants.TOP);
		bgMain.setBounds(0, 0, 1193, 623);
		contentPane.add(bgMain);
	}

	@Override
	public void update(boolean st, boolean le, boolean mk, boolean he, boolean ab, boolean bk, boolean ex, boolean l1,
			boolean l2, boolean l3, int numl, boolean textFieldShow, boolean sound, boolean bg, String text) {
		if (st)
			btStart.show();
		else
			btStart.hide();
		if (le)
			btLevels.show();
		else
			btLevels.hide();
		if (mk)
			btMark.show();
		else
			btMark.hide();
		if (he)
			btHelps.show();
		else
			btHelps.hide();
		if (ab)
			btAbout.show();
		else
			btAbout.hide();
		if (bk)
			btBack.show();
		else
			btBack.hide();
		if (ex)
			btExit.show();
		else
			btExit.hide();
		if (l1)
			lbLevel1.show();
		else
			lbLevel1.hide();
		if (l2)
			lbLevel2.show();
		else
			lbLevel2.hide();
		if (l3)
			lbLevel3.show();
		else
			lbLevel3.hide();

		if (textFieldShow)
			textField.show();
		else
			textField.hide();
		if (bg)
			bgMain.setIcon(bgMotion);
		else
			bgMain.setIcon(bgDisable);
		if (sound)
			labelSound.setIcon(iconEnSound);
		else
			labelSound.setIcon(iconMuteSound);
		if (numl == 1) {
			lbLevel1.setIcon(iconChooseLevel1);
			lbLevel2.setIcon(iconUnChooseLevel2);
			lbLevel3.setIcon(iconUnChooseLevel3);
		}
		if (numl == 2) {
			lbLevel1.setIcon(iconUnChooseLevel1);
			lbLevel2.setIcon(iconChooseLevel2);
			lbLevel3.setIcon(iconUnChooseLevel3);
		}
		if (numl == 3) {
			lbLevel1.setIcon(iconUnChooseLevel1);
			lbLevel2.setIcon(iconUnChooseLevel2);
			lbLevel3.setIcon(iconChooseLevel3);
		}
		textField.setText(text);

	}

}
