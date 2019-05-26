package LamViecNhom.Mark;

public class MarkOfPerson {
	private String name;
	private int mark;
	public MarkOfPerson(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}
	public String getName() {
		return name;
	}
	public int getMark() {
		return mark;
	}
	
	@Override
	public String toString() {
		return "name:" + " " + name + "-->" + "mark: " + mark;
	}

}
