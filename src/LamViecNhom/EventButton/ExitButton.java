package LamViecNhom.EventButton;

import LamViecNhom.GameMain;

public class ExitButton implements WorkWithEventButton {
	private static ExitButton eb = new ExitButton();

	private ExitButton() {
	}

	public static ExitButton getInstance() {
		return eb;
	}

	public void stopProgram(GameMain g) {
		System.exit(0);
	}

	@Override
	public void action(GameMain g) {
		stopProgram(g);

	};

}
