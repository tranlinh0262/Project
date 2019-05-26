package LamViecNhom.EventButton;

import LamViecNhom.GameMain;
import LamViecNhom.Mark.ListMark;

public class ListMarkButton implements WorkWithEventButton {
	private static ListMarkButton lmb = new ListMarkButton();
	private ListMark mark = ListMark.getInstance();

	private ListMarkButton() {
	};

	public static ListMarkButton getInstance() {
		return lmb;
	}

	public void setFrame(GameMain g) {
		g.getButtonData().setShowbtAbout(false);
		g.getButtonData().setShowbtBack(true);
		g.getButtonData().setShowbtExit(false);
		g.getButtonData().setShowbtMark(false);
		g.getButtonData().setShowbtHelps(false);
		g.getButtonData().setShowbtStart(false);
		g.getButtonData().setShowlabelSound(true);
		g.getButtonData().setShowbtLevels(false);
		g.getButtonData().setShowlbLevel1(false);
		g.getButtonData().setShowlbLevel2(false);
		g.getButtonData().setShowlbLevel3(false);
		g.getButtonData().setShowtextField(true);
		g.getButtonData().setEnableBg(false);
		g.getButtonData().changedStatus();
	}

	public void setText(GameMain g) {
		if(mark.getListMark().isEmpty()) {
			g.getButtonData().getTextField().setText("<The list mark is empty!>");
			g.getButtonData().setText("<The list mark is empty!>");
		}
		else {
			g.getButtonData().getTextField().setText(mark.list());
			g.getButtonData().setText(mark.list());
		}
	}

	@Override
	public void action(GameMain g) {
		setFrame(g);
		setText(g);
	}

}
