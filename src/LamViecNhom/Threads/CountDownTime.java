package LamViecNhom.Threads;

import LamViecNhom.GameMain;
import LamViecNhom.Frames.PlayGame;

public class CountDownTime implements Runnable {
	private GameMain g = GameMain.getInstance();
	private PlayGame play = g.getPlay();
	private int setTime;

	@Override
	public void run() {
		for (int i = setTime; i >= 0; i--) {
			play.getLblTime().setText("Time: " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}

		}
		// Viet code chuyen sang giao dien EndGame

	}

	public int getSetTime() {
		return setTime;
	}

	public void setSetTime(int setTime) {
		this.setTime = setTime;
	}

}
