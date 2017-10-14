package com.brainmentors.games;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.brainmentors.games.utils.GameConstants;

import jaco.mp3.player.MP3Player;

public class GameFrame extends JFrame implements GameConstants{
	MP3Player song;
private void playSound(){
	song = new MP3Player(GameFrame.class.getResource("pop.mp3"));
	song.play();
	}

	public GameFrame(int noOfBalls){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setTitle(GAME_NAME);
		setResizable(false);
		Board board = new Board(noOfBalls);
		add(board);
		//setLocation(100, 100);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				askForClose();
			}
		});
		setLocationRelativeTo(null);
		setVisible(true);
		playSound();
	}
	
	private void askForClose(){
		int choice = JOptionPane.showConfirmDialog(this, "Do u want to leave this game","Game-2017",JOptionPane.YES_NO_OPTION);
		if(choice == JOptionPane.YES_OPTION){
			song.stop();
			this.setVisible(false);
			this.dispose();
			System.exit(0);
		}
		else
		{
			return ;
		}
	}
	
	public static int askNoOfBalls(){
		String balls = JOptionPane.showInputDialog( "Enter the No of Balls");
		return Integer.parseInt(balls);
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		GameFrame frame = new GameFrame(askNoOfBalls());
//		
//		
//	}

}
