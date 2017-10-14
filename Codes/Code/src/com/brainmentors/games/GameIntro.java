package com.brainmentors.games;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;

import com.brainmentors.games.utils.GameConstants;

public class GameIntro extends JWindow implements GameConstants {
	JLabel label = new JLabel();
	JProgressBar progressBar = new JProgressBar();
	private Timer timer;
	private int progressVal;
	private void animation(){
		timer = new Timer(50,(e)->{
			if(progressVal>100){
				timer.stop();
				GameFrame gameFrame = new GameFrame(GameFrame.askNoOfBalls());
				GameIntro.this.setVisible(false);
				GameIntro.this.dispose();
			}
			progressBar.setValue(progressVal);
			progressVal++;
		});
		timer.start();
	}
	
	public GameIntro(){
		progressBar.setStringPainted(true);
		setBackground(Color.YELLOW);
		setSize(625,625);
		//setTitle(GAME_NAME);
		//setResizable(false);
		setLocationRelativeTo(null);
		ImageIcon icon = new ImageIcon(GameIntro.class.getResource("intro.gif"));
		label.setIcon(icon);
		add(label,BorderLayout.CENTER);
		add(progressBar,BorderLayout.NORTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameIntro intro  = new GameIntro();
		intro.animation();

	}

}
