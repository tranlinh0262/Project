package LamViecNhom.Levels;

public abstract class ChooseLevels {
	protected int width;
	protected int heigth;
	protected int timeLimit;

	public int getTimeLimit() {
		return timeLimit;
	}

	public int getWidth() {
		return width;
	}

	public int getHeigth() {
		return heigth;
	}

	public String printSize() {
		return width + "x" + heigth;
	}

}
