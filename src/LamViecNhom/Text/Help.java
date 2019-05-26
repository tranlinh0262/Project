package LamViecNhom.Text;

public class Help extends Text {
	private static Help l = new Help();

	public static Help getInstance() {
		return l;
	}

	private Help() {
		text = "We have 3 level, You can choose any level to play."
				+ "\nNumber of icons will increase when evel increase. Time of 3 level is different"
				+ "\nYour mission have to find the same double icon."
				+ "\nHave just 3 path from this icon to the same icons."
				+ "\nIf it correct. You will be received mark. If it incorrect, you have to choose again."
				+ "\nEnd game if time up.";
	}
}
