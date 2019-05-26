package LamViecNhom;

import java.util.ArrayList;

import javax.swing.JButton;

import LamViecNhom.Icons.Icon;

public class CurrentData {
	private static CurrentData current = new CurrentData();
	private String name;
	private int mark;
	private int time;
	private int[][] matrixCheck;
	private JButton[][] matrixIcons;
	private ArrayList<Icon> listIcon;
	private int numLevels = 1;
	private int numIconsList;
	private int numIconChoosen;
	private boolean isHaveSound = true;

	private CurrentData() {
	};

	public int getNumLevels() {
		return numLevels;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumLevels(int numLevels) {
		this.numLevels = numLevels;
	}

	public int getNumIconsList() {
		return numIconsList;
	}

	public void setNumIconsList(int numIconsList) {
		this.numIconsList = numIconsList;
	}

	public int getNumIconChoosen() {
		return numIconChoosen;
	}

	public void setNumIconChoosen(int numIconChoosen) {
		this.numIconChoosen = numIconChoosen;
	}

	public boolean isHaveSound() {
		return isHaveSound;
	}

	public void setHaveSound(boolean isHaveSound) {
		this.isHaveSound = isHaveSound;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int[][] getMatrixCheck() {
		return matrixCheck;
	}

	public void setMatrixCheck(int[][] matrixCheck) {
		this.matrixCheck = matrixCheck;
	}

	public JButton[][] getMatrixIcons() {
		return matrixIcons;
	}

	public void setMatrixIcons(JButton[][] matrixIcons) {
		this.matrixIcons = matrixIcons;
	}

	public ArrayList<Icon> getListIcon() {
		return listIcon;
	}

	public void setListIcon(ArrayList<Icon> listIcon) {
		this.listIcon = listIcon;
	}

	public int getLevels() {
		return numLevels;
	}

	public void setLevels(int levels) {
		this.numLevels = levels;
	}

	public static CurrentData getInstance() {
		return current;
	}

}
