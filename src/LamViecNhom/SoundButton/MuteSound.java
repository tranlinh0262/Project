package LamViecNhom.SoundButton;

import LamViecNhom.GameMain;

public class MuteSound implements WorkWithSound {
	private static MuteSound muteSound = new MuteSound();

	private MuteSound() {
	};


	public void mute(GameMain g) {
		// Tat am thanh tro choi
	}

	public void setButton(GameMain g) {
		// Bo sung
	}

	@Override
	public void action(GameMain g) {
		// TODO Auto-generated method stub

	}

	public static MuteSound getInstance() {
		return muteSound;
	}
}
