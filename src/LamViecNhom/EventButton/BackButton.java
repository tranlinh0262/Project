package LamViecNhom.EventButton;

import LamViecNhom.GameMain;

public class BackButton implements WorkWithEventButton{
	private static BackButton bb=new BackButton();
	private BackButton() {};
	public static BackButton getInstance() {
		return bb;
	}
	public void setFrame(GameMain g) {
		g.getButtonData().setShowbtStart(true);
		g.getButtonData().setShowbtLevels(true);
		g.getButtonData().setShowbtMark(true);
		g.getButtonData().setShowbtAbout(true);
		g.getButtonData().setShowbtExit(true);
		g.getButtonData().setShowbtHelps(true);
		g.getButtonData().setShowbtLevels(true);
		g.getButtonData().setShowlabelSound(true);
		g.getButtonData().setShowbtBack(false);
		g.getButtonData().setShowlbLevel1(false);
		g.getButtonData().setShowlbLevel2(false);
		g.getButtonData().setShowlbLevel3(false);
		g.getButtonData().setShowlabelSound(true);
		g.getButtonData().setEnableBg(true);
		g.getButtonData().setShowtextField(false);
		g.getButtonData().notifyAllObserver();
	
	}
	@Override
	public void action(GameMain g) {
		setFrame(g);
	}

}
