package com.springframe.springFramework;

import com.springframe.springFramework.game.GameRunner;
import com.springframe.springFramework.game.MarioGame;
import com.springframe.springFramework.game.SuperContraGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		//var marioGame = new MarioGame();
		
		var game = new MarioGame();//step 1: object creation
		var gamerunner = new GameRunner(game); //step 2: object creation + wiring of dependency(Dependency injection)
		//GameRunner is dependent on Game, without game, GameRunner will not work
		//gamerunner.setMarioGame(marioGame); when using getter setter
		gamerunner.run();
		
	}

}
