package LamViecNhom.SoundButton;

import LamViecNhom.GameMain;

public class EnableSoundMain implements WorkWithSound {
	private static EnableSoundMain enableSound = new EnableSoundMain();

	private EnableSoundMain() {
	};

	Sound sound;

	public void enable(GameMain g) {
		// Bat am thanh tro choi
	}

	public void setButton(GameMain g) {
		// Bo sung
	}

	@Override
	public void action(GameMain g) {
		enable(g);
		setButton(g);

	}

	public static EnableSoundMain getInstance() {
		return enableSound;

	}
}
