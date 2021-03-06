package com.echoeight.tankd;

import com.echoeight.bison.display.DisplayManager;
import com.echoeight.tankd.levels.MainMenuState;
import com.echoeight.tankd.states.StateManager;


public class Game {
	
	public DisplayManager dm;
	public StateManager sm;
	static Thread mainThread;
	
	public Game(int width, int height, String title){
		System.out.println("TankD Started");
		dm = new DisplayManager(width, height, title);
		initState();
	}

	private void initState(){
		sm = new StateManager(this);
		sm.enterState(new MainMenuState(this, 0));
	}
	
	public static void main(String[] argv) {
		mainThread = Thread.currentThread();
		new Game(600, 800, "TankD");
	}

	public void save() {

	}
	
}