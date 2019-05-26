package LamViecNhom.EventButton;

import LamViecNhom.GameMain;

public class LevelsButton implements WorkWithEventButton {
	private static LevelsButton lb = new LevelsButton();
	private LevelsButton() {};
	public static LevelsButton getInstance() {
		return lb;
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
		g.getButtonData().setShowlbLevel1(true);
		g.getButtonData().setShowlbLevel2(true);
		g.getButtonData().setShowlbLevel3(true);
		g.getButtonData().setShowtextField(false);
		g.getButtonData().setEnableBg(false);
		g.getButtonData().changedStatus();
	}
	
	@Override
	public void action(GameMain g) {
		setFrame(g);
	}}
