package com.brainmentors.games;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.brainmentors.games.utils.GameConstants;

public class GameFrame extends JFrame implements GameConstants{

	public GameFrame(int noOfBalls){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setTitle(GAME_NAME);
		setResizable(false);
		Board board = new Board(noOfBalls);
		add(board);
		//setLocation(100, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	private static int askNoOfBalls(){
		String balls = JOptionPane.showInputDialog( "Enter the No of Balls");
		return Integer.parseInt(balls);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameFrame frame = new GameFrame(askNoOfBalls());
		
		
	}

}
