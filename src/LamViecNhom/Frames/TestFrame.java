package LamViecNhom.Frames;

import javax.swing.JFrame;

import LamViecNhom.CurrentData;
import LamViecNhom.GameMain;

public class TestFrame {
	public static void main(String[] args) {
		GameMain g = GameMain.getInstance();
		ButtonsData b = new ButtonsData(g);
		CurrentData c = CurrentData.getInstance();
		g.setButtonData(b);
		g.setData(c);
		JFrame theme1 = new GameMain_Theme1(g, b, c);
		b.attach((Observer) theme1);
		g.setTh(theme1);
		theme1.setVisible(true);
	}

}
