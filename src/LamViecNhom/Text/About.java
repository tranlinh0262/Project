package LamViecNhom.Text;

public class About extends Text {
	private static About l = new About();

	public static About getInstance() {
		return l;
	}

	private About() {
		text = "List all of people developed this game: \n+ Ngo Minh Quang (team leader)\n+ Truong Thi My Hao\n+ Tran Minh Linh\n+ Vo Thanh Quy\n+ Mac Pham Hoang Duong\n+ Nguyen Doan Minh Nhat - Anh Thu";
	}
}
