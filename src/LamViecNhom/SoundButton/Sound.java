package LamViecNhom.SoundButton;

import java.applet.AudioClip;

public class Sound {
	AudioClip audio;

	public Sound(AudioClip audio) {
		super();
		this.audio = audio;
	}

	public AudioClip getAudio() {
		return audio;
	}

	public void setAudio(AudioClip audio) {
		this.audio = audio;
	}
}
