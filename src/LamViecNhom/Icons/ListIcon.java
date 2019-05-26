package LamViecNhom.Icons;

import java.util.ArrayList;
import java.util.List;

public class ListIcon {
	private List<Icon> listIcon;

	public ListIcon(List<Icon> listIcon) {
		super();
		listIcon = new ArrayList<>();
	}

	public List<Icon> getListIcon() {
		return listIcon;
	}

	public void getIcon(int x) {
		listIcon.get(x);
	}

	public void addIcon(Icon i) {
		listIcon.add(i);
	}

	public void removeIcon(Icon i) {
		listIcon.remove(i);
	}

}
