package LamViecNhom.Icons;

import LamViecNhom.GameMain;

public class CreateIcon implements WorkWithIcon{
	private static CreateIcon createIcon = new CreateIcon();
	private CreateIcon() {};
	public void addIconsRamdom(GameMain g) {
		// Bo sung
	}
	
	@Override
	public void action(GameMain g) {
		addIconsRamdom(g);
		
	}
	public static CreateIcon getInstance() {
		return createIcon;
	}

}
