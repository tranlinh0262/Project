package LamViecNhom.Mark;

import java.util.ArrayList;
import java.util.List;

public class ListMark {
	private static ListMark m = new ListMark();
	private List<MarkOfPerson> listMark;

	private ListMark() {
		listMark = new ArrayList<>();
	}

	public List<MarkOfPerson> getListMark() {
		return listMark;
	}

	public void addPerson(MarkOfPerson m) {
		listMark.add(m);
	}

	public String list() {
		String text = "";
		for (MarkOfPerson list1 : listMark) {
			text = text + list1;
		}
		return text;

	}

	public void sortList() {

	}

	public static ListMark getInstance() {
		return m;
	}

}
