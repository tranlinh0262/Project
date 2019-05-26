package LamViecNhom.Levels;

import LamViecNhom.GameMain;

public class LevelsFactory {
	private static LevelsFactory lf = new LevelsFactory();

	private LevelsFactory() {
	}

	public ChooseLevels chLevels(GameMain g) {
		ChooseLevels ch = null;
		if (g.getData().getNumLevels() == 1) {
			ch = new Level1();
		} else if (g.getData().getNumLevels() == 2) {
			ch = new Level2();
		} else if (g.getData().getNumLevels() == 3) {
			ch = new Level3();
		}
		return ch;
	}

	public static LevelsFactory getInstance() {
		return lf;
	}
}
