package com.brainmentors.games;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.brainmentors.games.utils.GameConstants;
import com.brainmentors.games.utils.RandomGenerate;

public class Board extends JPanel implements GameConstants{//,ActionListener {
	private Timer timer;
	public Board(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setBackground(Color.BLACK);
		gameLoop();
	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
	
	private void gameLoop(){
		//timer = new Timer(50,this);
		timer = new Timer(50,(e)->{
			repaint();
			move();
			changeDirection();
	});
		timer.start();
	}
	final int FIX_SPEED = 35;
	int x = 100;
	int xSpeed = 35;
	RandomGenerate r = new RandomGenerate(FIX_SPEED);
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		drawBall(g);
		
		//System.out.println("Paint Done...");
	}
	
	public void drawBall(Graphics g){
		g.setColor(Color.CYAN);
		g.fillOval(x, 100, 50, 50);
	}

	public void move(){
		x+=xSpeed;
	}

	public void changeDirection(){
		if(x>=(GAME_WIDTH-50)){
			xSpeed =  -r.getRandomNumber() ;
		}
		else
		if(x<=0){
			xSpeed = r.getRandomNumber();
		}
	}
	
}
