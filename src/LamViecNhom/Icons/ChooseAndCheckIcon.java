package LamViecNhom.Icons;

import LamViecNhom.GameMain;

public class ChooseAndCheckIcon implements WorkWithIcon {
	private static ChooseAndCheckIcon cacIcon = new ChooseAndCheckIcon();
	int countChoosen;
	boolean isDelete = false;

	private ChooseAndCheckIcon() {
	};

	public void choose(GameMain g) {
		// Click chuot de chon hinh
		if (countChoosen == 2)
			checkIcons(g);
	}

	public void checkIcons(GameMain g) {
		// Day la thuat toan duyet de kiem tra xem 1 cap hinh duoc chon co xoa duoc hay
		// khong?

	}

	@Override
	public void action(GameMain g) {
		choose(g);
	}

	public static ChooseAndCheckIcon getInstance() {
		return cacIcon;
	}
}
