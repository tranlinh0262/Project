package LamViecNhom.Icons;

import LamViecNhom.GameMain;

public class DeleteIcon implements WorkWithIcon {
	private static DeleteIcon deleteICon = new DeleteIcon();
	private DeleteIcon() {};
	public static DeleteIcon getInstance() {
		return deleteICon;
	}
	public void appearLineCoupleIcons(GameMain g) {
		// cai duong gach noi 2 hinh se xuat hien
	}

	public void delCoupleIcon(GameMain g) {
		// 1 cap hinh khi chon dung se bi xoa
	}

	public void addMark(GameMain g) {
		// cong diem khi 2 hinh bi xoa
	}

	public void disapearLineCoupleIcons(GameMain g) {
		// cai duong gach noi 2 hinh se bien mat
	}

	@Override
	public void action(GameMain g) {
		appearLineCoupleIcons(g);
		delCoupleIcon(g);
		disapearLineCoupleIcons(g);
		addMark(g);
	}

}
