package LamViecNhom.Icons;

import LamViecNhom.GameMain;

public class SortIcon implements WorkWithIcon{
	private static SortIcon sortIcon = new SortIcon();
	private SortIcon() {};
	public static SortIcon getInstance() {
		return sortIcon;
	}
	
	public void addIconsRamdom(GameMain g) {
		// Bo sung
	}
	
	@Override
	public void action(GameMain g) {
		addIconsRamdom(g);
		
	}

}
