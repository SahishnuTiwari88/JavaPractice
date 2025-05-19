package com.springframe.springFramework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springframe.springFramework.game.GameRunner;
import com.springframe.springFramework.game.GamingConsole;
import com.springframe.springFramework.game.MarioGame;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		var game = new MarioGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRun(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		// gameRunner.run();
		return gameRunner;
		
	}
}
