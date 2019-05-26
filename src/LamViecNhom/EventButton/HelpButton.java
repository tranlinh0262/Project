package LamViecNhom.EventButton;

import LamViecNhom.GameMain;
import LamViecNhom.Text.Help;
import LamViecNhom.Text.Text;

public class HelpButton implements WorkWithEventButton {
	private static HelpButton hb = new HelpButton();

	private HelpButton() {
	};

	public static HelpButton getInstance() {
		return hb;
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
		g.getButtonData().notifyAllObserver();
	}

	public void setText(GameMain g) {
		Text t = Help.getInstance();
		g.getButtonData().getTextField().setText(t.getText());
		g.getButtonData().setText(t.getText());
	}

	@Override
	public void action(GameMain g) {
		setText(g);
		setFrame(g);
	}

}
