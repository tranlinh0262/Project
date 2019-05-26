package LamViecNhom.EventButton;

import LamViecNhom.GameMain;

public class TimeOut_Exit implements WorkWithEventButton {
	private static TimeOut_Exit toe = new TimeOut_Exit();

	private TimeOut_Exit() {
	};

	public static TimeOut_Exit getInstance() {
		return toe;
	}

	public void goToEndFrame(GameMain g) {
		g.getPlay().setVisible(false);
		// TODO
	}

	@Override
	public void action(GameMain g) {
		goToEndFrame(g);
	}

}
