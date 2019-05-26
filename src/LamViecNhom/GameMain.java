package LamViecNhom;

import javax.swing.JFrame;

import LamViecNhom.EventButton.WorkWithEventButton;
import LamViecNhom.Frames.ButtonsData;
import LamViecNhom.Frames.EndGame;
import LamViecNhom.Frames.GameMain_Theme1;
import LamViecNhom.Frames.GameMain_Theme2;
import LamViecNhom.Frames.Observer;
import LamViecNhom.Frames.PlayGame;
import LamViecNhom.Icons.WorkWithIcon;
import LamViecNhom.Mark.ListMark;
import LamViecNhom.SoundButton.WorkWithSound;

public class GameMain {
	private static GameMain newGame = new GameMain();
	private JFrame th;

	private PlayGame play;
	private EndGame end;
	private CurrentData data;
	private ButtonsData buttonData;
	private WorkWithEventButton workWithEventButton;
	private WorkWithIcon workWithIcon;
	private WorkWithSound workWithSound;
	private ListMark listMark;

	private GameMain() {
	};

	public WorkWithEventButton runEvent() {
		return workWithEventButton;
	}

	public void setWorkWithEventButton(WorkWithEventButton workWithEventButton) {
		this.workWithEventButton = workWithEventButton;
	}

	public WorkWithIcon runIcon() {
		return workWithIcon;
	}

	public void setWorkWithIcon(WorkWithIcon workWithIcon) {
		this.workWithIcon = workWithIcon;
	}

	public WorkWithSound runSound() {
		return workWithSound;
	}

	public void setWorkWithSound(WorkWithSound workWithSound) {
		this.workWithSound = workWithSound;
	}

	public CurrentData getData() {
		return data;
	}

	public void setData(CurrentData data) {
		this.data = data;
	}

	public void setButtonData(ButtonsData buttonData) {
		this.buttonData = buttonData;
	}

	public PlayGame getPlay() {
		return play;
	}

	public void setPlay(PlayGame play) {
		this.play = play;
	}

	public ListMark getListMark() {
		return listMark;
	}

	public EndGame getEnd() {
		return end;
	}

	public void setListMark(ListMark listMark) {
		this.listMark = listMark;
	}

	public ButtonsData getButtonData() {
		return buttonData;
	}

	public JFrame getTh() {
		return th;
	}

	public void setTh(JFrame th) {
		this.th = th;
	}

	public static GameMain getInstance() {
		return newGame;
	}

}
