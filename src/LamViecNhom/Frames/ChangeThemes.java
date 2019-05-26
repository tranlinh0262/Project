package LamViecNhom.Frames;

import javax.swing.JFrame;

import LamViecNhom.CurrentData;
import LamViecNhom.GameMain;

public class ChangeThemes {
	private static ButtonsData d = GameMain.getInstance().getButtonData();
	private static ChangeThemes ch = new ChangeThemes();
	private JFrame th;
	private GameMain g = GameMain.getInstance();

	private ChangeThemes() {
	}

	public void action() {
		g.getTh().setVisible(false);
		if (d.getIndexOfTheme() == 1) {
			th = new GameMain_Theme2(g, d, CurrentData.getInstance());
			d.detach(d.getObs().get(0));
			d.attach((Observer) th);
			d.changedStatus();
			g.setTh(th);
			g.getTh().setVisible(true);
			d.setIndexOfTheme(2);
		} else if (d.getIndexOfTheme() == 2) {
			th = new GameMain_Theme1(g, d, CurrentData.getInstance());
			d.detach(d.getObs().get(0));
			d.attach((Observer) th);
			d.changedStatus();
			g.setTh(th);
			g.getTh().setVisible(true);
			d.setIndexOfTheme(1);
		}
	}

	public static ChangeThemes getInstance() {
		return ch;
	}
}
