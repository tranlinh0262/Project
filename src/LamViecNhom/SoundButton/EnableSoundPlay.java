package LamViecNhom.SoundButton;

import LamViecNhom.GameMain;

public class EnableSoundPlay implements WorkWithSound {
	private static EnableSoundPlay enableSound = new EnableSoundPlay();

	private EnableSoundPlay() {
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

	public static EnableSoundPlay getInstance() {
		return enableSound;

	}
}
