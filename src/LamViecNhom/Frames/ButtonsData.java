package LamViecNhom.Frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import LamViecNhom.CurrentData;
import LamViecNhom.GameMain;
import LamViecNhom.EventButton.AboutButton;
import LamViecNhom.EventButton.BackButton;
import LamViecNhom.EventButton.ExitButton;
import LamViecNhom.EventButton.HelpButton;
import LamViecNhom.EventButton.LevelsButton;
import LamViecNhom.EventButton.ListMarkButton;
import LamViecNhom.EventButton.NewGameButton;
import LamViecNhom.EventButton.WorkWithEventButton;
import LamViecNhom.SoundButton.EnableSoundMain;
import LamViecNhom.SoundButton.MuteSound;
import LamViecNhom.SoundButton.WorkWithSound;

public class ButtonsData implements Subject {
	private ButtonsData bd = this;
	private ArrayList<Observer> obs;
	private GameMain g;
	private JButton btStart = new JButton();
	private JButton btLevels = new JButton();
	private JButton btMark = new JButton();
	private JButton btExit = new JButton();
	private JButton btHelps = new JButton();
	private JButton btAbout = new JButton();
	private JButton btBack = new JButton();
	private JLabel lbLevel1 = new JLabel();
	private JLabel lbLevel2 = new JLabel();
	private JLabel lbLevel3 = new JLabel();
	private JLabel labelSound = new JLabel();
	private JLabel labelThemes = new JLabel();
	private String text = "";
	private int indexOfTheme = 1;

	private JTextField textField = new JTextField();
	private JLabel bg = new JLabel();

	private boolean showbtStart = true;
	private boolean showbtLevels = true;
	private boolean showbtMark = true;
	private boolean showbtExit = true;
	private boolean showbtHelps = true;
	private boolean showbtAbout = true;
	private boolean showbtBack = false;
	private boolean showlbLevel1 = false;
	private boolean showlbLevel2 = false;
	private boolean showlbLevel3 = false;
	private int numLevels = 1;
	private boolean showlabelSound = true;
	private boolean showtextField = false;
	private boolean enableBg = true;

	public ArrayList<Observer> getObs() {
		return obs;
	}

	public int getIndexOfTheme() {
		return indexOfTheme;
	}

	public void setIndexOfTheme(int indexOfTheme) {
		this.indexOfTheme = indexOfTheme;
	}

	public ButtonsData(GameMain g) {
		this.g = g;
		obs = new ArrayList<>();
		btStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WorkWithEventButton work = NewGameButton.getInstance();
				work.action(g);
			}
		});
		btLevels.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WorkWithEventButton work = LevelsButton.getInstance();
				work.action(g);
			}
		});
		btMark.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WorkWithEventButton work = ListMarkButton.getInstance();
				work.action(g);
			}
		});
		btAbout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WorkWithEventButton work = AboutButton.getInstance();
				work.action(g);
			}
		});
		btHelps.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WorkWithEventButton work = HelpButton.getInstance();
				work.action(g);
			}
		});
		btBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WorkWithEventButton work = BackButton.getInstance();
				work.action(g);
			}
		});
		btExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				WorkWithEventButton work = ExitButton.getInstance();
				work.action(g);
			}
		});
		labelSound.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Chi Linh

			}
		});
		lbLevel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				g.getData().setNumLevels(1);
				numLevels = 1;
				changedStatus();
			}

		});
		lbLevel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				g.getData().setNumLevels(2);
				numLevels = 2;
				changedStatus();
			}

		});
		lbLevel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				g.getData().setNumLevels(3);
				numLevels = 3;
				changedStatus();
			}

		});
		labelSound.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!(g.getData().isHaveSound())) {
					g.getData().setHaveSound(true);
					WorkWithSound sound = EnableSoundMain.getInstance();
					sound.action(g);
					setShowlabelSound(true);
					changedStatus();
					// System.out.println("The sound is Enabled!");
				} else {
					g.getData().setHaveSound(false);
					WorkWithSound sound = MuteSound.getInstance();
					sound.action(g);
					setShowlabelSound(false);
					changedStatus();
					// System.out.println("The sound is Disabled!");
				}
			}
		});
		labelThemes.addMouseListener(new MouseAdapter() {
			private JFrame th;

			@Override
			public void mouseClicked(MouseEvent e) {
				ChangeThemes ch = ChangeThemes.getInstance();
				ch.action();
			}
		});

	}

	public GameMain getGMain() {
		return g;
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

	public JLabel getLbLevel1() {
		return lbLevel1;
	}

	public JLabel getLbLevel2() {
		return lbLevel2;
	}

	public JLabel getLbLevel3() {
		return lbLevel3;
	}

	public JLabel getLabelSound() {
		return labelSound;
	}

	public JLabel getLabelThemes() {
		return labelThemes;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JLabel getBg() {
		return bg;
	}

	public void setShowbtStart(boolean showbtStart) {
		this.showbtStart = showbtStart;
	}

	public void setShowbtLevels(boolean showbtLevels) {
		this.showbtLevels = showbtLevels;
	}

	public void setShowbtMark(boolean showbtMark) {
		this.showbtMark = showbtMark;
	}

	public void setShowbtExit(boolean showbtExit) {
		this.showbtExit = showbtExit;
	}

	public void setShowbtHelps(boolean showbtHelps) {
		this.showbtHelps = showbtHelps;
	}

	public void setShowbtAbout(boolean showbtAbout) {
		this.showbtAbout = showbtAbout;
	}

	public void setShowbtBack(boolean showbtBack) {
		this.showbtBack = showbtBack;
	}

	public void setShowlbLevel1(boolean showlbLevel1) {
		this.showlbLevel1 = showlbLevel1;
	}

	public void setShowlbLevel2(boolean showlbLevel2) {
		this.showlbLevel2 = showlbLevel2;
	}

	public void setShowlbLevel3(boolean showlbLevel3) {
		this.showlbLevel3 = showlbLevel3;
	}

	public void setShowlabelSound(boolean showlabelSound) {
		this.showlabelSound = showlabelSound;

	}

	public void setShowtextField(boolean showtextField) {
		this.showtextField = showtextField;

	}

	public void setEnableBg(boolean enable) {
		this.enableBg = enable;

	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void changedStatus() {
		notifyAllObserver();
	}

	@Override
	public void attach(Observer observer) {
		if (!obs.contains(observer))
			obs.add(0, observer);
	}

	@Override
	public void detach(Observer observer) {
		if (obs.contains(observer)) {
			obs.remove(observer);
		}
	}

	@Override
	public void notifyAllObserver() {
		for (Observer observer : obs) {
			observer.update(showbtStart, showbtLevels, showbtMark, showbtHelps, showbtAbout, showbtBack, showbtExit,
					showlbLevel1, showlbLevel2, showlbLevel3, numLevels, showtextField, showlabelSound, enableBg, text);
		}
	}

	// public static ButtonsData getInstance() {
	// return bd;
	// }

}
