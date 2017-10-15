package com.brainmentors.games;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements GameConstants {

	public GameFrame(){
		Board board = new Board();
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setResizable(false);
		setTitle(GAME_NAME);
		setLocationRelativeTo(null);
		add(board);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameFrame obj = new GameFrame();

	}

}
