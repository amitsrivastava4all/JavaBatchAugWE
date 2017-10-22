package com.srivastava.games;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements GameConstants {

	public GameFrame(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setTitle(GAME_TITLE);
		setResizable(false);
		Board board = new Board();  // Board Object Create
		this.add(board);  // Add this board in a frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		GameFrame obj = new GameFrame();

	}

}
