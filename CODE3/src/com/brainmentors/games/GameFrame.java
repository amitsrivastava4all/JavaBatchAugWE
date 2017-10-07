package com.brainmentors.games;

import javax.swing.JFrame;

import com.brainmentors.games.utils.GameConstants;

public class GameFrame extends JFrame implements GameConstants{

	public GameFrame(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setTitle(GAME_NAME);
		setResizable(false);
		Board board = new Board();
		add(board);
		//setLocation(100, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameFrame frame = new GameFrame();
		
	}

}
