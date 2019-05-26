package LamViecNhom.EventButton;

import javax.swing.JButton;
import LamViecNhom.GameMain;
import LamViecNhom.Frames.PlayGame;
import LamViecNhom.Levels.LevelsFactory;
import LamViecNhom.Threads.CountDownTime;

public class NewGameButton implements WorkWithEventButton {
	LevelsFactory leFac = LevelsFactory.getInstance();
	int[][] iconsCheck;
	JButton[][] icons;
	PlayGame play;
	private static NewGameButton ngButton = new NewGameButton();

	private NewGameButton() {
	};

	public static NewGameButton getInstance() {
		return ngButton;
	}

	public void setData(GameMain g) {
		g.getData().setTime(leFac.chLevels(g).getTimeLimit());
		g.getData().setMark(0);
		g.getData().setMatrixCheck(iconsCheck = new int[leFac.chLevels(g).getWidth()][leFac.chLevels(g).getHeigth()]);
		g.getData().setMatrixIcons(icons = new JButton[leFac.chLevels(g).getWidth()][leFac.chLevels(g).getHeigth()]);
	}

	public void loadFrame(GameMain g) {
		g.getTh().setVisible(false);
		PlayGame play = PlayGame.getInstance();
		g.setPlay(play);
		play.setVisible(true);
	}

	public void startTime(GameMain g) {
		CountDownTime count = new CountDownTime();
		count.setSetTime(leFac.chLevels(g).getTimeLimit());
		Thread th = new Thread(count);
		th.start();
	}

	@Override
	public void action(GameMain g) {
		setData(g);
		loadFrame(g);
		startTime(g);
	}

}
